package demoApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class apiDay1 {
    @Test
    public void test() {
        String baseurl = "http://3.224.114.109:8000";
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when()
                .get(baseurl + "/api/spartans");
        System.out.println("response.statusCode() = " + response.statusCode());
        Assertions.assertEquals(response.statusCode(), 200);
        response.prettyPrint();
    }

        }


