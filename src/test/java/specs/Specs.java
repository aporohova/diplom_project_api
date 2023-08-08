package specs;
import config.AllureConfig;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;
import tests.TestBase;
import static helpers.CustomerAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;
import static utils.TestData.*;

public class Specs extends TestBase {

    static AllureConfig configAllure = ConfigFactory.create(AllureConfig.class, System.getProperties());
    static public String token = configAllure.getToken();
    //public String xsrfToken = configAllure.getXsrfToken();
    public static RequestSpecification requestSpec = with()
            .log().all()
            .contentType("application/json;charset=UTF-8")
            .header("Authorization", "Api-Token " + token)
            .cookie("ALLURE_TESTOPS_SESSION", ALLURE_TESTOPS_SESSION)
            .filter(withCustomTemplates())
            .contentType(JSON);

    public static ResponseSpecification response200Spec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();
}
