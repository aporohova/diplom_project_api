package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomerAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;
import static tests.TestData.*;

public class Specs {
    public static RequestSpecification requestSpec = with()
            .log().all()
            .contentType("application/json;charset=UTF-8")
            .header("X-XSRF-TOKEN", CSRF_TOKEN)
            .cookies("XSRF-TOKEN",CSRF_TOKEN,
                    "ALLURE_TESTOPS_SESSION", ALLURE_TESTOPS_SESSION);

    public static ResponseSpecification response200Spec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();
    public static ResponseSpecification response204Spec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(204)
            .build();

}
