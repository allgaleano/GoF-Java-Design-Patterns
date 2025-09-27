package builder;

public class Main {
    public static void main(String[] args) {
        HttpResponse response = new HttpResponseBuilder()
                .statusCode(200)
                .header("Content-Type", "application/json")
                .body("{\"message\":\"success\"}")
                .build();
        System.out.println(response);
    }
}
