import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void postEchoTest() {
        String data = "some data";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body(data)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(data));
    }
}
