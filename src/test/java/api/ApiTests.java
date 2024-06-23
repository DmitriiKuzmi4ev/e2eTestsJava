package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@Tag("Api")
@Feature("Тесты ci/cd")
public class ApiTests {

    ObjectMapper objectMapper = new ObjectMapper();
    private ApiRequestHelper apiRequestHelper = new ApiRequestHelper("https://api.spacexdata.com/v3");

    @Test
    public void testCheckCeoIsElonMusk() {
        apiRequestHelper.getRequestSpec()
                .when().get("/info")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("ceo", equalTo("Elon Musk"));

    }

    @Test
    public void testCheckLandPads() {
        apiRequestHelper.getRequestSpec()
                .when().get("/landpads/LZ-4")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("full_name", equalTo("Landing Zone 4"));
    }

}
