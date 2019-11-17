package testProject;

import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class GetRecordsFromApi {
    @Test
    @Step("Check that api is available now and retirn response code = 200")
    public void checkAvailability(){
        get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200);
    }
}
