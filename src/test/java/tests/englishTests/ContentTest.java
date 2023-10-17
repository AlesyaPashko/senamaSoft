package tests.englishTests;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import models.EnContentData;
import models.response.EnContentResponseData;
import models.response.PageProps;
import org.testng.annotations.Test;
import utils.JsonReader;
import utils.Specifications;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class ContentTest {

    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");
    private final String URL = bundle.getString("path_to_url");

    @Test(dataProvider = "enContentData", dataProviderClass = JsonReader.class)
    public void createTest(EnContentData enContentData){

        Specifications.installSpecification(Specifications.requestSpecification("https://www.senamasoft.com/_next/data/o-C7qB284eyszF6MNFmVU/en.json"), Specifications.responseSpecificationOK200());

        EnContentResponseData users = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.en.common", EnContentResponseData.class);

//        Assert.assertEquals(users.getInTouch, enContentData.getInTouch);

//        Response response = RestAssured
//                .given()
//                .get()
//                .thenReturn();
//
//        JsonPath jsonPath = response.jsonPath();
//        Map<String, String> states = new HashMap<String, String>();
//
//        states = jsonPath.getMap("pageProps._nextI18Next.initialI18nStore.en.common");


    }

}
