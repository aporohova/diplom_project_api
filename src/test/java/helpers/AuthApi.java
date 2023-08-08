package helpers;
import config.AllureConfig;
import org.aeonbits.owner.ConfigFactory;
import tests.TestBase;
import static io.restassured.RestAssured.given;

public class AuthApi {
    static AllureConfig configAllure = ConfigFactory.create(AllureConfig.class, System.getProperties());
    //static public String token = configAllure.getToken();
    public String xsrfToken = configAllure.getXsrfToken();

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
