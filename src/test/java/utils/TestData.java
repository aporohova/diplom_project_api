package utils;
import com.github.javafaker.Faker;
import java.util.UUID;

public class TestData {
    public static final String
            token = "0d0c580d-039c-4a7f-a8ec-92f0fd2f9efe",
            xsrfToken = "0d0c580d-039c-4a7f-a8ec-92f0fd2f9efe",
            ALLURE_TESTOPS_SESSION = UUID.randomUUID().toString();
    static Faker faker = new Faker();
    public final static String
            projectDescription = faker.funnyName().name(),
            testCaseName = faker.funnyName().name(),
            dashboardName = faker.funnyName().name(),
            testCaseComment = "комментарий",
            projectName = "TestForApiDiploma";

    public static final int projectID = 3498;

}