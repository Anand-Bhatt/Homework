package com.studentapp.studentinfo.testbase;

import com.studentapp.model.StudentPojo;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
    @Test
    public void putTest01() {
        //To update new records using all mandatory fields  - positive test
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        studentPojo.setEmail("put@put.co.uk");
        studentPojo.setProgramme("Software Testing");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/99");
        response.then().log().all().statusCode(200);
    }
    @Test
    public void putTest02() {
        //To update records without all mandatory fields  - negative test
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        //studentPojo.setEmail("put@put.co.uk");
        studentPojo.setProgramme("Software Testing");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/99");
        response.then().log().all().statusCode(500);
    }
    @Test
    public void putTest03() {
        //To update records by leaving mandatory fields blank - negative test
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        studentPojo.setEmail("");
        studentPojo.setProgramme("Software Testing");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/99");
        response.then().log().all().statusCode(500);
    }
    @Test
    public void putTest04() {
        StudentPojo studentPojo = new StudentPojo();
        //To update new records using duplicate  - negative  test
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        studentPojo.setEmail("put@put.co.uk");
        studentPojo.setProgramme("Software Testing");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/98");
        response.then().log().all().statusCode(500);
    }
    @Test
    public void putTest05() {
        //To update records using list
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Ruby");
        StudentPojo studentPojo = new StudentPojo();
        //To update new records   - positive  test
        studentPojo.setFirstName("Just");
        studentPojo.setLastName("Checking");
        studentPojo.setEmail("putcourses@put.co.uk");
        studentPojo.setProgramme("Software Testing");
        studentPojo.setCourses(courses);
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/98");
        response.then().log().all().statusCode(200);
    }
}

