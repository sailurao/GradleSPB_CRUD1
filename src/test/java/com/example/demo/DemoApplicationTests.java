package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.hamcrest.Matchers;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testCustomerList() {

        get("http://localhost:8080/employees")
                .then()
                .assertThat()
                .statusCode(200)
                .body("size()", is(1));

        get("http://localhost:8080/employees/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("id", Matchers.equalTo(1));

        get("http://localhost:8080/employees/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("name", Matchers.equalTo("Murali"));

    }


}
