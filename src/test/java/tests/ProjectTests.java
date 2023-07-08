package tests;

import io.restassured.RestAssured;
import models.ProjectRequest;
import models.ProjectResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static helpers.AuthApi.authCookieKey;
import static helpers.CustomerAllureListener.withCustomTemplates;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.*;

public class ProjectTests extends TestBase{
    static Integer projectId;

    static ProjectRequest projectRequest;

//
//
//    @BeforeEach
//    public void beforeEach (){
//
//        RestAssured.baseURI = "https://allure.autotests.cloud";
//        RestAssured.basePath = "/api";
//    }
    @BeforeAll
    public static void buildData(){
        projectRequest = new ProjectRequest();
        projectRequest.setName("ProjectForDELETE");
        projectRequest.setIsPublic(false);
        //projectId = given(requestSpec).body(projectRequest).post("/rs/project").as(ProjectResponse.class).getId();


    }


    @Test
    @DisplayName("Создание нового проекта")
    void createNewProject() {
        String authCookieValue = authApi.getAuthCookie(login,password);


        var request = ProjectRequest.builder().isPublic(false).name("DiplomaTESTAPI").build();

//        projectRequest.setIsPublic(false);
//        projectRequest.setName("DiplomaTESTSAPI");

        step("Создать новый проект", () ->
                given(requestSpec)
                        .cookie(authCookieKey,authCookieValue)
                        .filter(withCustomTemplates())
                        .spec(requestSpec)
                        .body(request)
                        .when()
                        .post("/rs/project")
                        .then()
                        .spec(response200Spec)
                        .extract().as(ProjectResponse.class));


    }

    @Test
    @DisplayName("Удаление проекта")
    void deleteProject() {
        String authCookieValue = authApi.getAuthCookie(login,password);

        step("Удалить проект", () ->
                given(requestSpec)
                        .cookie(authCookieKey,authCookieValue)
                        .filter(withCustomTemplates())
                        .spec(requestSpec)
                        .body(projectRequest)
                        .when()
                        .queryParam("id", projectId)
                        .delete("rs/project/")
                        .then()
                        .spec(response204Spec));

    }


}