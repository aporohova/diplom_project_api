package tests;
import models.ProjectRequest;
import models.ProjectResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static helpers.CustomerAllureListener.withCustomTemplates;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.*;
import static org.assertj.core.api.Assertions.assertThat;
public class ProjectTests extends TestBase {
    String name = "TestForApiDiploma";
    @Test
    @DisplayName("Открыть проект")
    void checkProject() {
        authApi.getToken(login, password);
        ProjectRequest request = new ProjectRequest();
        request.setName(name);

        ProjectResponse projectResponse = step("Отправка запроса на создание нового проекта", () ->
                given(requestSpec)
                        .filter(withCustomTemplates())
                        .body(request)
                        .when()
                        .get("rs/project/" + TestData.projectID)
                        .then()
                        .spec(response200Spec)
                        .extract()
                        .as(ProjectResponse.class));
        step("Проверка названия проекта", () ->
                assertThat(projectResponse.getName()).isEqualTo(name));
        step("Проверка айди проекта", () ->
        assertThat(projectResponse.getId()).isEqualTo(TestData.projectID));
    }
}