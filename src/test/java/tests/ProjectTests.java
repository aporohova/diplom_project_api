package tests;
import io.qameta.allure.Owner;
import models.ProjectComment;
import models.ProjectCommentResponse;
import models.ProjectRequest;
import models.ProjectResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.TestData;
import static helpers.CustomerAllureListener.withCustomTemplates;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.*;
import static org.assertj.core.api.Assertions.assertThat;

@Owner("Алена Порохова")
@Tag("api")
public class ProjectTests extends TestBase {

    @Test
    @DisplayName("Открыть проект")
    void checkProject() {
        authApi.getToken(login, password);
        ProjectRequest request = new ProjectRequest();
        request.setName(TestData.projectName);

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
                assertThat(projectResponse.getName()).isEqualTo(TestData.projectName));
        step("Проверка айди проекта", () ->
                assertThat(projectResponse.getId()).isEqualTo(TestData.projectID));
    }

    @Test
    @DisplayName("Добавить описание к проекту")
    void addProjectDescription() {
        authApi.getToken(login, password);
        ProjectComment comment = new ProjectComment();
        comment.setName(TestData.projectName);
        comment.setDescription(TestData.projectDescription);

        ProjectCommentResponse projectCommentResponse = step("Добавить описание проекта", () ->
                given(requestSpec)
                        .filter(withCustomTemplates())
                        .body(comment)
                        .when()
                        .patch("rs/project/" + TestData.projectID)
                        .then()
                        .spec(response200Spec)
                        .extract()
                        .as(ProjectCommentResponse.class));
        step("Проверка названия проекта", () ->
                assertThat(projectCommentResponse.getDescription()).isEqualTo(TestData.projectDescription));
    }
}