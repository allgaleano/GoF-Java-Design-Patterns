package builder;


import java.util.HashMap;
import java.util.Map;

public final class HttpResponse {
    private final int statusCode;
    private final Map<String, String> headers;
    private final String body;

    public HttpResponse(int statusCode, Map<String, String> headers, String body) {
        this.statusCode = statusCode;
        this.headers = new HashMap<>(headers);
        this.body = (body == null) ? "" : body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HttpResponse{" + "statusCode=" + statusCode + ", headers=" + headers.toString() + ", body=" + body + "}";
    }
}
