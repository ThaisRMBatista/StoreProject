package br.com.pattern.store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL urlApi = new URL(url);
            URLConnection urlConnection = urlApi.openConnection();
            urlConnection.connect();
        } catch (Exception e) {
           throw new RuntimeException("Error to send HTTP request");
        }

    }
}
