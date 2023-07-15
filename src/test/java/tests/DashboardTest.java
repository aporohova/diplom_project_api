package tests;
import models.DashboardRequest;
import models.DashboardResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
import static specs.Specs.requestSpec;
import static io.restassured.RestAssured.given;
import static specs.Specs.response200Spec;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DashboardTest extends TestBase {
    @Test
    @DisplayName("Создание и удаление dashboard в проекте")
    void createDashboard() {
        authApi.getToken(login, password);
        DashboardRequest dashboardRequest = new DashboardRequest();
        dashboardRequest.setProjectId(TestData.projectID);
        dashboardRequest.setName(TestData.dashboardName);

        DashboardResponse dashboardResponse = step("Создать dashboard", () ->
                given(requestSpec)
                        .body(dashboardRequest)
                        .when()
                        .post("rs/dashboard")
                        .then()
                        .spec(response200Spec)
                        .extract().as(DashboardResponse.class));
        step("Проверить имя созданного dashboard", () ->
                assertThat(dashboardResponse.getName()).isEqualTo(TestData.dashboardName));

        int dashboardId = dashboardResponse.getId();
        step("Удалить созданный dashboard", () ->
                given(requestSpec)
                        .when()
                        .delete("rs/dashboard/" + dashboardId)
                        .then()
                        .log().status()
                        .log().body()
                        .statusCode(202));
    }
}
