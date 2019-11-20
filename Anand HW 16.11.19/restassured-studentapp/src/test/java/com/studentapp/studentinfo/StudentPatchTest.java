package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class StudentPatchTest extends TestBase {
    @Test
    public void patchHW01() {
        //To update single record
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("patchvernon@patch.com");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/1");
        response.then().log().all().statusCode(200);

    }

    @Test
    public void patchHW02() {
        //To update multiple records
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        studentPojo.setEmail("Test@patch.co.uk");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/2");
        response.then().log().all().statusCode(200);
    }
@Test
    public void patchHW03() {
        //To update multiple records
        for (int i = 20; i <= 25; i++) {

            StudentPojo studentPojo = new StudentPojo();
            studentPojo.setEmail("TestPatch" + Math.random() * 50 + "@test.com");
            Response response = given()
                    .header("Content-Type", "application/json")
                    .when()
                    .body(studentPojo)
                    .patch(String.valueOf(i));
            response.then().log().all().statusCode(200);
        }
    }
    @Test
    public void patchHW04() {
        //Negative test - using blank email field
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/17");
        response.then().log().all().statusCode(500);
    }
    @Test
    public void patchHW05() {
        //Negative test - using duplicate records -  email field
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("Test@patch.co.uk");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/2");
        response.then().log().all().statusCode(500);
    }
}
