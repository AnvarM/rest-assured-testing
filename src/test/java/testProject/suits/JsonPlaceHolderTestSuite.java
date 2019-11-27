package testProject.suits;

import io.qameta.allure.Step;
import org.junit.Test;
import io.restassured.RestAssured;
import testProject.config.EndPoint;
import testProject.config.TestsConfig;


import static io.restassured.RestAssured.*;

public class JsonPlaceHolderTestSuite extends TestsConfig {

    @Test
    @Step("Send GET request to /posts, got list of posts and response code = 200")
    public void positiveGetAllPosts(){
        get(EndPoint.JSONPLACEHOLDER_POSTS);
    }

}
