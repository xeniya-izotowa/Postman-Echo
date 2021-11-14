package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankAppTest {
    @Test
    public void shouldReturnTheSameBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("POST-method test")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("PUT-method test"))
        ;
    }
}
