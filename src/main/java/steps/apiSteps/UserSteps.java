package steps.apiSteps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import models.responseModels.*;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class UserSteps {
    @Step ("Получить список пользователей")
    public UserListResponse getUserList (Integer statusCode) {
        return given()
                .baseUri("https://reqres.in") // Ссылка сайта
                .get("/api/users?page=2") // Api
                .then() // Затем
                .assertThat()// утверждать что
                .statusCode(statusCode)// проверка статус кода
                .extract() // "Вытащить"
                .response().as(UserListResponse.class); // Привод к этой модели (UserListResponse)
    }
    @Step ("Получить пользователя по id")
    public UserResponse getUserById (Integer id, Integer statusCode) {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users/" + id)
                .then()
                .assertThat()
                .statusCode(statusCode)
                .extract()
                .response().as(UserResponse.class);
    }
    @Step ("Получить несуществующего пользователя")
    public UserResponse getUserDoesNotExist () {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users/23")
                .then()
                .assertThat()//
                .statusCode(404)//
                .extract()
                .response().as(UserResponse.class);
    }
    @Step ("Получить список неизвестных пользователей")
    public ResourceListResponse getResourceListResponse (Integer statusCode) {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/unknown")
                .then()
                .assertThat()
                .statusCode(statusCode)
                .extract()
                .response().as(ResourceListResponse.class);
    }
    @Step ("Получить список неизвестных пользователей")
    public ResourceResponse getResourceResponse (Integer id, Integer statusCode) {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/unknown/" + id)
                .then()
                .assertThat()
                .statusCode(statusCode)
                .extract()
                .response().as(ResourceResponse.class);
    }
    @Step ("Получить несуществующего пользователя")
    public ResourceResponse getResourceDoesNotExist () {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users/23")
                .then()
                .assertThat()
                .statusCode(404)//
                .extract()
                .response().as(ResourceResponse.class);
    }
}