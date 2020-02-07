package com.example.apis.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection connection = url.openConnection();
            connection.connect();

            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

                        String line = "";
            while(line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }

            inputStream.close();

        } catch(MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
