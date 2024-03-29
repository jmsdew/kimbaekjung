package com.kimbaekjung.semiproject.main.kakao.service;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;
import com.kimbaekjung.semiproject.main.kakao.dto.KakaoDTO;
import com.kimbaekjung.semiproject.main.kakao.model.KakaoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

@Service
public class KakaoAPI {

    @Value("${API-KEY.restApi-key}")
    private String kakao_apikey;
    @Value("${API-KEY.restApi-pwd}")
    private String kakao_apipwd;


    @Autowired
    private KakaoDAO kakaoDAO;
    public String getAccessToken (String code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://kauth.kakao.com/oauth/token";

        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=" + URLEncoder.encode(kakao_apikey, "UTF-8"));
            sb.append("&client_secret=" + URLEncoder.encode(kakao_apipwd, "UTF-8"));
            sb.append("&redirect_uri=https://localhost:443/oauth/kakao");
        /*    sb.append("&redirect_uri=http://112.222.187.244:1001/oauth/kakao");*/
            sb.append("&code=" + code);
            bw.write(sb.toString());
            bw.flush();

            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);
            if (responseCode != 200) {
                // 오류 응답 출력
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                String errorLine;
                StringBuilder errorResult = new StringBuilder();
                while ((errorLine = errorReader.readLine()) != null) {
                    errorResult.append(errorLine);
                }
                System.out.println("error response body : " + errorResult.toString());
            }

            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }


            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            access_Token = element.getAsJsonObject().get("access_token").getAsString();
            refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();


            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return access_Token;
    }


    public HashMap<String, Object> getUserInfo(String access_Token){
        //    요청하는 클라이언트마다 가진 정보가 다를 수 있기에 HashMap타입으로 선언
        HashMap<String, Object> userInfo = new HashMap<>();
        String reqURL = "https://kapi.kakao.com/v2/user/me";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            //    요청에 필요한 Header에 포함될 내용
            conn.setRequestProperty("Authorization", "Bearer " + access_Token);

            int responseCode = conn.getResponseCode();


            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }


            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();

            String email = kakao_account.getAsJsonObject().get("email").getAsString();


            userInfo.put("email", email);

            List<KakaoDTO> kakaoDTOs = kakaoDAO.selectEmail();
            List<String> emails = kakaoDTOs.stream().map(KakaoDTO::getEmail).collect(Collectors.toList());
            System.out.println(emails);
            if (emails.contains(email)) {
                System.out.println("회원입니다.");
            } else {
                int signUp = kakaoDAO.signUp(email);
                if (signUp > 0) {
                    System.out.println("회원가입완료");
                }
            }



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return userInfo;
    }
}
