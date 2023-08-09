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
    protected final AuthApi authApi = new AuthApi();
    protected final String login = config.getUsername();
    protected final String password = config.getPassword();

    @BeforeAll
    public static void setUp() {

        Configuration.baseUrl = config.getBaseUrl();
        RestAssured.baseURI = "https://allure.autotests.cloud";
        RestAssured.basePath = "/api";
        RestAssured.defaultParser = Parser.JSON;
    }
}

