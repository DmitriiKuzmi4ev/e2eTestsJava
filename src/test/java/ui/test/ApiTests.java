package ui.test;

import core.BaseTest;
import io.qameta.allure.Feature;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Tag("Api")
@Feature("Тесты ci/cd")
public class ApiTests extends BaseTest {
    @BeforeAll
    public static void setBaseUrl(){
        RestAssured.baseURI = "https://api.spacexdata.com/v3";
    }

    @Test
    public void checkCeoIsElonMusk(){
        given().get("/info")
                .then().log().body()
                .body("founder", equalTo("Elon Musk"));
    }

    @Test
    public void checkLandPads(){
        given().get("/landpads/LZ-4")
                .then().log().body()
                .body("full_name", equalTo("Landing Zone 4"));
    }

}
