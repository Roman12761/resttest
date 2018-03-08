/**
 * Created By Roman Movcheniuk
 */
package requests;

import jsonresponses.GeneralResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import serialization.JSONSerialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Requests {
    private static  JSONSerialization<GeneralResponse> serializer = new JSONSerialization<GeneralResponse>();

    private static GeneralResponse getGeneralResponse(HttpResponse response) throws IOException {
        GeneralResponse generalResponse;
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        generalResponse = serializer.fromFile(GeneralResponse.class, result.toString());
        generalResponse.setResponseCode(response.getStatusLine().getStatusCode());

        return generalResponse;
    }

    public static  GeneralResponse postRequestDemo(String url, String requestBody) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        StringEntity postingString = new StringEntity(requestBody);
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        return getGeneralResponse(httpClient.execute(post));
    }
}