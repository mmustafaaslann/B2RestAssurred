package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class _01Basics {


    @Test
    public void text01_BasicUsage() {
        given()         // ön veriler, requirementler,headers,cookies,body,....
                .when() // yapilan islem,GET , POST , DELETE , PUT
                .then(); //Assertions, statusCode, json path assertions
    }

    @Test
    public void test02_get() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2%22") // Get methodu ilr bu adrese reguest gönderdik
                .then()
                //  .log().body()   // body verileri consola yazdırılır.
                //  .log().all()
                //   .log().cookies()
                .log().headers()
        ;
    }

    @Test
    public void test03_statusCode() {
        String url = "https://reqres.in/api/users?page=2%22";
        given()
                .get(url)
                .then()
                .statusCode(200)   // statusCode 200 olmali
        ;


    }

    @Test
    public void test04_statusCode() {
        String url = "https://reqres.in/api/users?page=2%22";
        long time = given()
                .get(url)
                .timeIn(TimeUnit.MILLISECONDS);
        System.out.println(time);

    }

    @Test
    public void test05_parameters() {
        String url = "https://reqres.in/api/users?page=2%22";
        given()
                .get(url)
                .then()
                .statusCode(200)   // statusCode 200 olmali
        ;
    }

}
