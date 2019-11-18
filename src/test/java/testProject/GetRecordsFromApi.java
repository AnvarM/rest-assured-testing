package testProject;

import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class GetRecordsFromApi {
    @BeforeClass
    public static void configureTest(){
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    @Step("Check that api is available now and retirn response code = 200")
    public void checkAvailability(){
        given().get(EndPoints.posts).then().statusCode(200);
    }
}
