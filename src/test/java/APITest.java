import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {

    private static final String URL = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

    @Test
    public void api() {
        given().when().get(URL).then().statusCode(200);
    }
}
