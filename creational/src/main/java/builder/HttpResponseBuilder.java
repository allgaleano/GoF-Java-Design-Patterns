package builder;

import java.util.HashMap;
import java.util.Map;

public class HttpResponseBuilder {

    private int statusCode;
    private final Map<String, String> headers = new HashMap<>();
    private String body;

    public HttpResponseBuilder statusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public HttpResponseBuilder header(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpResponseBuilder body(String body) {
        this.body = body;
        return this;
    }

    public HttpResponse build() {
        return new HttpResponse(statusCode, headers, body);
    }
}
