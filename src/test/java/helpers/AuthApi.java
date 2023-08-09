package helpers;
import config.AllureConfig;
import org.aeonbits.owner.ConfigFactory;
import static io.restassured.RestAssured.given;

public class AuthApi {
    static AllureConfig allureConfig = ConfigFactory.create(AllureConfig.class, System.getProperties());

    public void getToken(String login, String password) {
        given()
                .log().all()
                .header("X-XSRF-TOKEN", allureConfig.xsrfToken())
                .header("Cookie", "XSRF-TOKEN=" + allureConfig.xsrfToken())
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
