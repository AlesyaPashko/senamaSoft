package tests.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.GetInTouchData;
import models.GetInTouchErrorData;
import org.testng.annotations.Test;
import utils.GetRandom;
import utils.JsonReader;
import utils.Specifications;

import java.io.File;
import java.util.ResourceBundle;

public class GetInTouchAPITest{

    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");
    private final String URL = bundle.getString("get_in_touch");

    @Test(dataProvider = "geInTouchData", dataProviderClass = JsonReader.class)
    public void checkGetInTouchForm(GetInTouchData getInTouchData){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecificationOK503());

        File file = new File(getInTouchData.getFile());

        Response response = RestAssured
                .given()
                .multiPart("email", GetRandom.random(), "multipart/form-data")
                .multiPart("description", GetRandom.random(), "multipart/form-data")
                .multiPart("file", file, "multipart/form-data")
                .post(URL)
                .thenReturn();
    }

    @Test
    public void checkGetInTouchFormNoFile(){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecificationOK503());

        Response response = RestAssured
                .given()
                .multiPart("email", GetRandom.random(), "multipart/form-data")
                .multiPart("description", GetRandom.random(), "multipart/form-data")
                .post(URL)
                .thenReturn();
    }

    @Test
    public void checkGetInTouchFormNoEmail(){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecification404());

        Response response = RestAssured
                .given()
                .multiPart("email", "", "multipart/form-data")
                .multiPart("description", GetRandom.random(), "multipart/form-data")
                .post(URL)
                .thenReturn();
    }

    @Test
    public void checkGetInTouchFormNoDescription(){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecification404());

        Response response = RestAssured
                .given()
                .multiPart("email", GetRandom.random(), "multipart/form-data")
                .multiPart("description", "", "multipart/form-data")
                .post(URL)
                .thenReturn();
    }

    @Test
    public void checkGetInTouchFormEmpty(){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecification404());

        Response response = RestAssured
                .given()
                .multiPart("email", "", "multipart/form-data")
                .multiPart("description", "", "multipart/form-data")
                .post(URL)
                .thenReturn();
    }

    @Test(dataProvider = "geInTouchErrorData", dataProviderClass = JsonReader.class)
    public void checkGetInTouchFormErrorForm(GetInTouchErrorData getInTouchErrorData){

        Specifications.installSpecification(Specifications.multipartReqSpec(URL), Specifications.responseSpecificationOK503());

        File file = new File(getInTouchErrorData.getFile());

        Response response = RestAssured
                .given()
                .multiPart("email", GetRandom.random(), "multipart/form-data")
                .multiPart("description", GetRandom.random(), "multipart/form-data")
                .multiPart("file", file, "multipart/form-data")
                .post(URL)
                .thenReturn();
    }


}
