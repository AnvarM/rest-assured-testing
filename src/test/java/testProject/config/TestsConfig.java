package testProject.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class TestsConfig {

    public static RequestSpecification jsonPlaceholderRequestSpec;
    public static ResponseSpecification jsonPlaceholderResponseSpec;

    @BeforeClass
    public static void setup() {

        jsonPlaceholderRequestSpec = new RequestSpecBuilder().
                setBaseUri("http://jsonplaceholder.typicode.com").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = jsonPlaceholderRequestSpec;

        jsonPlaceholderResponseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                build();

        RestAssured.responseSpecification = jsonPlaceholderResponseSpec;
    }



}
