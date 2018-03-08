
import jsonresponses.GeneralResponse;
import requests.Requests;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String request = "{\n" +
                "  \"email\": \"shntddhh@jj.ri\",\n" +
                "  \"login\": \"shtrddkkking\",\n" +
                "  \"name\": \"Ntrlling\",\n" +
                "  \"password\": \"String_1234\",\n" +
                "  \"surname\": \"String\"\n" +
                "}";
        GeneralResponse response1 = Requests.postRequestDemo("http://localhost:8080/citizen/auth/signUp",request);
        System.out.println(response1);

    }


}