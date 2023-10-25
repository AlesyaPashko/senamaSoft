package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.http.ContentType.MULTIPART;

public class Specifications {

    public static RequestSpecification requestSpecification(String url){
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification multipartReqSpec(String url) {
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(MULTIPART)
                .build();
    }

    public static ResponseSpecification responseSpecificationOK200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static ResponseSpecification responseSpecificationOK503(){
        return new ResponseSpecBuilder()
                .expectStatusCode(503)
                .build();
    }

    public static ResponseSpecification responseSpecification404(){
        return new ResponseSpecBuilder()
                .expectStatusCode(404)
                .build();
    }

    public static void installSpecification(RequestSpecification request, ResponseSpecification response){
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
