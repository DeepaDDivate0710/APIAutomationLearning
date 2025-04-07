package org.apiautomation.ddd.ex01_RestAssured_Basic;

import io.restassured.RestAssured;

public class APITTesting004_MultipleTestCases {

    public static void main (String[] args)
    {

        String Pincode = "560016";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath ("/IN/" +Pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);



         Pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath ("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


         Pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath ("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
