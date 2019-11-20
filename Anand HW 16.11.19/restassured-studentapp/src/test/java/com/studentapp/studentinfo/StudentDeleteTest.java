package com.studentapp.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {
    @Test
    public void deleteHW01(){
        Response response = given()
                .when()
                .delete("/7");
        response.then().log().all().statusCode(204);
    }
    @Test
    public void deleteHW02(){
        Response response = given()
                .when()
                .delete("/17");
        response.then().log().all().statusCode(204);
    }
    @Test
    public void deleteHW03(){
        Response response = given()
                .when()
                .delete("/27");
        response.then().log().all().statusCode(204);
    }
    @Test
    public void deleteHW04(){
        Response response = given()
                .when()
                .delete("/37");
        response.then().log().all().statusCode(204);
    }
    @Test
    public void deleteHW05(){
        //Invalid request
        Response response = given()
                .param("firstName", "Vernon")
                .when()
                .delete();
        response.then().log().all();
    }
}
