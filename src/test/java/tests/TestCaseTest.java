package tests;
import models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.requestSpec;
import static specs.Specs.response200Spec;
import static org.assertj.core.api.Assertions.assertThat;

public class TestCaseTest extends TestBase {
    @Test
    @DisplayName("Создание тест кейса")
    void createTestCase() {
        authApi.getToken(login, password);
        TestCaseRequest testCaseRequest = new TestCaseRequest();
        testCaseRequest.setName(TestData.testCaseName);

        TestCaseResponse testCaseResponse = step("Создать тест кейс", () ->
                given(requestSpec)
                        .body(testCaseRequest)
                        .queryParam("projectId", TestData.projectID)
                        .when()
                        .post("/rs/testcasetree/leaf")
                        .then()
                        .spec(response200Spec)
                        .statusCode(200).extract().as(TestCaseResponse.class));
        step("Проверить имя созданного тест кейса", () ->
                assertThat(testCaseResponse.getName()).isEqualTo(TestData.testCaseName));
    }
    @Test
    @DisplayName("Добавление комментария к тесту и его удаление")
    void addDeleteComment() {
        CommentRequest commentRequest = new CommentRequest();
        commentRequest.setBody(TestData.testCaseComment);
        commentRequest.setTestCaseId(24126);
        authApi.getToken(login, password);
        CommentResponse commentResponse = step("Добавить комментарий к тест кейсу", () ->
                given(requestSpec)
                        .body(commentRequest)
                        .when()
                        .post("/rs/comment")
                        .then()
                        .spec(response200Spec)
                        .extract().as(CommentResponse.class));
        step("Проверить добавленный комментарий", () ->
                assertThat(commentResponse.getBody()).isEqualTo(TestData.testCaseComment));

        int commentId = commentResponse.getId();
        step("Удалить созданный комментарий", () ->
                given(requestSpec)
                        .when()
                        .delete("rs/comment/" + commentId)
                        .then()
                        .log().status()
                        .log().body()
                        .statusCode(204));
    }
}