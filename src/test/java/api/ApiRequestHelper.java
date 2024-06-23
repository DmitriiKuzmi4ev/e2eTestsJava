package api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiRequestHelper {
    private final RequestSpecification requestSpec;

    public ApiRequestHelper(String baseUri) {
        requestSpec = RestAssured
                .given().baseUri(baseUri)
                .log().all();
    }

    public RequestSpecification getRequestSpec() {
        return requestSpec;
    }
}
