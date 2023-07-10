package helpers;

import tests.TestBase;

import static io.restassured.RestAssured.given;
import static tests.TestData.ALLURE_TESTOPS_SESSION;
import static tests.TestData.CSRF_TOKEN;

public class AuthApi{
    //public static String authCookieKey = "ALLURE_TESTOPS_SESSION";
    public void  getToken (String login, String password) {
         given()
                .log().all()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", login)
                .formParam("password", password)
                .header("X-XSRF-TOKEN", CSRF_TOKEN)
                .cookies("XSRF-TOKEN",CSRF_TOKEN,
                        "ALLURE_TESTOPS_SESSION", ALLURE_TESTOPS_SESSION)
                .when()
                .post("/login/system")
                .then()
                .log().all()
                .statusCode(200);
    }
}
