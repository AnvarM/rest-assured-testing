package testProject.suits;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.Test;
import io.restassured.RestAssured;
import testProject.config.EndPoint;
import testProject.config.TestsConfig;
import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.*;

public class JsonPlaceHolderTestSuite extends TestsConfig {

    @Test
    @Step("Send GET request to /posts, got list of posts and response code = 200")
    public void positiveGetAllPosts(){
        get(EndPoint.JSONPLACEHOLDER_POSTS);
    }

    @Test
    @Step("Username 'Bret' in response body")
    public void positiveCheckUserName(){
        Response response = get(EndPoint.JSONPLACEHOLDER_USERS);
        response.then().body("username", hasItem("Bret"));
    }

}
