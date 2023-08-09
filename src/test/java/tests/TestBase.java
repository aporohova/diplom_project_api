package tests;
import com.codeborne.selenide.Configuration;
import config.TestConfig;
import helpers.AuthApi;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static TestConfig config = ConfigFactory.create(TestConfig.class, System.getProperties());
    String login = config.getUsername();
    String password = config.getPassword();
    AuthApi authApi = new AuthApi();

    @BeforeAll
    public static void setUp() {

        Configuration.baseUrl = config.getBaseUrl();
        RestAssured.baseURI = "https://allure.autotests.cloud";
        RestAssured.basePath = "/api";
        RestAssured.defaultParser = Parser.JSON;
    }
}

