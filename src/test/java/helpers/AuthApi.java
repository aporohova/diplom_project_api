package helpers;
import utils.TestData;
import static io.restassured.RestAssured.given;

public class AuthApi extends TestData{

    public void  getToken (String login, String password) {
         given()
                 .log().all()
                 .header("X-XSRF-TOKEN",  xsrfToken)
                 .header("Cookie", "XSRF-TOKEN=" + xsrfToken)
                 .formParam("username", login)
                 .formParam("password", password)
                 .when()
                 .post("/login/system")
                 .then()
                 .log().all()
                 .statusCode(200)
                 .extract().response()
                 .getCookie("ALLURE_TESTOPS_SESSION");
    }
}
