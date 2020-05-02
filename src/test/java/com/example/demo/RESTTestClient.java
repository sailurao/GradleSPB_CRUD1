package com.example.demo;

// Import from REST Assured Framework
import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;

// Import from TestNG framework
import org.testng.Assert;
import org.testng.annotations.Test;

public class RESTTestClient {

    @Test //TestNG annotation
    public void verifyEmployeeRESTService() {
        // Setting base URL and port numbers for Amazon Service
        RestAssured.baseURI = "http://35.239.118.177";
        RestAssured.port = 8080;

        try {
            // Values of expected and actual
            String expected = "[{\"id\":1,\"name\":\"Murali\"}]";
            String actual = get("/employees").asString(); //Calling service via REST Assured

            // Print the valued of actual and expected
            System.out.println(expected);
            System.out.println(actual);

            Assert.assertEquals(actual, expected); //TestNG decision making on PASS or FAIL
        } finally {
            //do nothing
        }
    }
}
