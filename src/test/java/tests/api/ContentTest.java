package tests.api;

import models.ContentData;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonReader;
import utils.Specifications;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class ContentTest {

    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");
    private final String URL_EN = bundle.getString("en_json_link");
    private final String URL_RU = bundle.getString("ru_json_link");
    private final String URL_AR = bundle.getString("ar_json_link");
    private final String URL_PL = bundle.getString("pl_json_link");
    private final String URL_DE = bundle.getString("de_json_link");

    @Test(dataProvider = "enContentData", dataProviderClass = JsonReader.class)
    public void checkEnContentTest(ContentData enContentData){

        Specifications.installSpecification(Specifications.requestSpecification(URL_EN), Specifications.responseSpecificationOK200());

        ContentData contentNow = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.en.common", ContentData.class);

        Assert.assertEquals(contentNow, enContentData);
    }

    @Test(dataProvider = "ruContentData", dataProviderClass = JsonReader.class)
    public void checkRuContentTest(ContentData ContentData){

        Specifications.installSpecification(Specifications.requestSpecification(URL_RU), Specifications.responseSpecificationOK200());

        ContentData contentNow = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.ru.common", ContentData.class);

        Assert.assertEquals(contentNow, ContentData);
    }

    @Test(dataProvider = "arContentData", dataProviderClass = JsonReader.class)
    public void checkArContentTest(ContentData ContentData){

        Specifications.installSpecification(Specifications.requestSpecification(URL_AR), Specifications.responseSpecificationOK200());

        ContentData contentNow = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.ar.common", ContentData.class);

        Assert.assertEquals(contentNow, ContentData);
    }

    @Test(dataProvider = "plContentData", dataProviderClass = JsonReader.class)
    public void checkPlContentTest(ContentData ContentData){

        Specifications.installSpecification(Specifications.requestSpecification(URL_PL), Specifications.responseSpecificationOK200());

        ContentData contentNow = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.pl.common", ContentData.class);

        Assert.assertEquals(contentNow, ContentData);
    }

    @Test(dataProvider = "deContentData", dataProviderClass = JsonReader.class)
    public void checkDeContentTest(ContentData ContentData){

        Specifications.installSpecification(Specifications.requestSpecification(URL_DE), Specifications.responseSpecificationOK200());

        ContentData contentNow = given()
                .when()
                .get()
                .then().log().all()
                .extract().body().jsonPath().getObject("pageProps._nextI18Next.initialI18nStore.de.common", ContentData.class);

        Assert.assertEquals(contentNow, ContentData);
    }

}
