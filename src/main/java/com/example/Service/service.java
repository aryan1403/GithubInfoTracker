package com.example.Service;

import java.io.*;
import java.util.*;
import org.json.JSONObject;
import java.net.*;

public class service {
    public JSONObject get(String url) throws IOException {
        // "https://www.instagram.com/"+username+"/?__a=1"
        // https://api.github.com/users/Hellboy-Aaryan
        // https://covid19.mathdro.id/api
        // http://jostapi.notavailable.live/lyrics/songname

        URL urlForGetRequest = new URL(url);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        int responseCode = conection.getResponseCode();
        Map<String, String> map = new HashMap<>();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            //System.out.println(response.toString());
            String s = response.toString();

            JSONObject object = new JSONObject(s);
            
            return object;
        } else {
            System.out.println("User not found");
        }

        return null;
    
    }
}
