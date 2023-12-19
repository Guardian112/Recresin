import steps.BaseTest;

import models.responseModels.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Example extends BaseTest {
    @Test(description = "Получение списка пользователей")
    public void getUserList() {
        UserListResponse user = USER_STEPS.getUserList(200);
        System.out.println(user);
    }
    @Test(description = "Получение пользователя по id")
    public void getUserById() {
        UserResponse user = USER_STEPS.getUserById(2, 200);
        System.out.println(user);
    }
    @Test(description = "Проверка несуществующего пользователя")
    public void getUserDoesNotExist() {
        UserResponse user = USER_STEPS.getUserDoesNotExist();
        System.out.println(user);
    }
    @Test(description = "Получение списка неизвестных пользователя")
    public void getResourceListResponse() {
        ResourceListResponse user = USER_STEPS.getResourceListResponse(200);
        System.out.println(user);
    }
    @Test(description = "Получение неизвестного пользователя по id")
    public void getResourceResponse() {
        ResourceResponse user = USER_STEPS.getResourceResponse(2, 200);
        System.out.println(user);
    }
    @Test(description = "Проверка несуществующего, неизвестного пользователя")
    public void getResourceDoesNotExist() {
        ResourceResponse user = USER_STEPS.getResourceDoesNotExist();
        System.out.println(user);
    }
}