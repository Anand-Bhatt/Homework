package com.studentapp.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {


    @Test

    public void getAllStudentInformation() {
        Response response = given().log().all()
                .when()
                .get("/list");
        response.then().log().ifValidationFails().statusCode(200);

        //To print outcome of above request
        //System.out.println(response.prettyPrint());
//        ValidatableResponse response1 = given()
//                .when()
//                .get("/list")
//                .then()
//                .statusCode(200);

    }

    @Test
    public void getSingleStudentInformation() {
        Response response = given()
                .when()
                .get("/101");
        System.out.println(response.prettyPrint());

    }

    @Test
    public void getSingleStudentInfoByParameter() {
        Response response = given()
                .param("programme", "law")
                .param("limit", 2)
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);

    }
    // Homework - 10 Test for Get method

    @Test
    public void homeWork1() {
        //To get single student information
        Response response = given()
                .when()
                .get("/15");
        //System.out.println(response.prettyPrint());
        response.then().log().all().statusCode(200);
    }

    @Test
    public void homeWork2() {
        //To get all student information
        Response response = given().log().all()
                .when()
                .get("/list");
        response.then().log().ifValidationFails().statusCode(200);

    }

    @Test
    public void homeWork3() {
        //To get student info by parameters
        Response response = given()
                .param("programme", "Computer Science")
                .param("limit", 5)
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);

    }

    @Test
    public void homeWork4() {
        //To get student info by parameters
        Response response = given()
                .param("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void homeWork5() {
        //To get student info by parameters
        Response response = given()
                .param("firstName", "Vernon")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void homeWork6() {
        //To get student info by parameters
        Response response = given()
                .param("programme", "Criminology")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void homeWork7() {
        //To get student info by parameters
        Response response = given().log().all()
                .param("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void homeWork8(){
        //To get student info by parameters
        Response response = given()
                .param("programme", "Medicine")
                .param("limit",5)
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void homeWork9(){
        //Invalid request
        Response response = given()
                .when()
                .get("/103");
        response.then().log().all().statusCode(404);
    }
    @Test
    public void homeWork10(){
        //To get student info by parameters
        Response response = given()
                .param("email", "nascetur@conguea.com")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }
}
