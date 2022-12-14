package com.Saltyp0rridge.Avocado.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class BackendCommunicator {
    public static final String BACKEND_URL = "192.168.124.22";

    public String sendRequest(String endpoint) {
        StringBuilder response = new StringBuilder();

        try {
            URL url = new URL(BACKEND_URL + endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response.toString();
    }


}
