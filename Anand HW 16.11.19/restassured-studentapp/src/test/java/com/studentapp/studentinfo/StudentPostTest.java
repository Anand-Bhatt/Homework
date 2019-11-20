package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {

    @Test
    public void postHw01() {
        //To create new record with all mandatory field
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Ruby");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andy");
        studentPojo.setLastName("Brown");
        studentPojo.setEmail("abcd010@mail.com");
        studentPojo.setProgramme("QA");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }

    @Test
    public void postHw02() {
        //To create new record using duplicate records - negative test
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Ruby");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andy");
        studentPojo.setLastName("Brown");
        studentPojo.setEmail("abcd010@mail.com");
        studentPojo.setProgramme("QA");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(500);
    }
    @Test
    public void postHw03() {
        //To create new record with blank course field
        List<String> courses = new ArrayList<>();
        courses.add("");
        courses.add("");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andy");
        studentPojo.setLastName("Brown");
        studentPojo.setEmail("abcd" + Math.random()*50 +"@mail.com");
        studentPojo.setProgramme("QA");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }
    @Test
    public void postHw04() {
        //To create new record with programme  field - negative
        List<String> courses = new ArrayList<>();
        courses.add("");
        courses.add("");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andy");
        studentPojo.setLastName("Brown");
        studentPojo.setEmail("abcd" + Math.random()*50 +"@mail.com");
        studentPojo.setProgramme("");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(500);
    }
    @Test
    public void postHw05() {
        //To create new record with all mandatory field
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Ruby");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andy");
        studentPojo.setLastName("Brown");
        studentPojo.setEmail("abcd56@mail.com");
        studentPojo.setProgramme("QA");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }

}

