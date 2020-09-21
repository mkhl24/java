package com.mkhl24;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;
import java.net.http.HttpClient;

public class ApacheTest {

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.org");
        request.addHeader("User-Agenr","Chrome");

        try {
            CloseableHttpResponse response = httpClient.execute(request);
            System.out.println("response code = " + response.get);
        } catch (IOException e) {
            System.out.println();
        }


    }
}
