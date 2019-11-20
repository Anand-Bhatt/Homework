package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.SerenityRest.then;

@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase {
    @Test
    public void getAllStudents() {
        SerenityRest.rest().given()
                .when()
                .get("/list")
                .then()
                .statusCode(200).log().all();
    }
}
