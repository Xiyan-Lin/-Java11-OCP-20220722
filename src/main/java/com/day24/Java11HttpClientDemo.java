package com.day24;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Java11HttpClientDemo {
    public static void main(String[] args) throws Exception {
        String txtUrl = "https://www.w3.org/TR/PNG/iso_8859-1.txt";
        
        HttpClient client = HttpClient.newBuilder()
                                      .version(HttpClient.Version.HTTP_2) // HTTP 版本
                                      .connectTimeout(Duration.ofSeconds(30)) // 最大等待時間
                                      .build();
        
        HttpRequest request = HttpRequest.newBuilder() // 請求 request
                .GET()
                .uri(URI.create(txtUrl))
                .build();
        
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
