package br.com.pattern.store.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> data);
}
