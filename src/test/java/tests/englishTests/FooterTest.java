package tests.englishTests;

import models.FooterData;
import models.FooterTestimonialsData;
import org.testng.annotations.Test;
import steps.FooterSteps;
import steps.HeaderSteps;
import utils.JsonReader;

public class FooterTest extends BaseTest {

    private HeaderSteps headerSteps = new HeaderSteps();
    private FooterSteps footerSteps = new FooterSteps();

    @Test(dataProvider = "footerData", dataProviderClass = JsonReader.class)
    public void checkHomeFooterButtons(FooterData footerData){
        footerSteps.clickFooterButton(footerData.getButtonName(), footerData.getLink());
    }

    @Test(dataProvider = "footerData", dataProviderClass = JsonReader.class)
    public void checkServiceFooterButtons(FooterData footerData){
        headerSteps.clickTabName("services", SERVICES_LINK);
        footerSteps.clickFooterButton(footerData.getButtonName(), footerData.getLink());
    }

    @Test(dataProvider = "footerData", dataProviderClass = JsonReader.class)
    public void checkPortfolioFooterButtons(FooterData footerData){
        headerSteps.clickTabName("portfolio", PORTFOLIO_LINK);
        footerSteps.clickFooterButton(footerData.getButtonName(), footerData.getLink());
    }

    @Test(dataProvider = "footerData", dataProviderClass = JsonReader.class)
    public void checkContactsFooterButtons(FooterData footerData){
        headerSteps.clickTabName("contacts", CONTACTS_LINK);
        footerSteps.clickFooterButton(footerData.getButtonName(), footerData.getLink());
    }

    @Test(dataProvider = "footerData", dataProviderClass = JsonReader.class)
    public void checkCareerFooterButtons(FooterData footerData){
        headerSteps.clickTabName("career", CAREER_LINK);
        footerSteps.clickFooterButton(footerData.getButtonName(), footerData.getLink());
    }

    @Test(dataProvider = "footerTestimonialsData", dataProviderClass = JsonReader.class)
    public void checkTestimonialsFooterButtons(FooterTestimonialsData footerTestimonialsData){
        headerSteps.clickTabName("testimonials", TESTIMONIALS_LINK);
        footerSteps.clickFooterButton(footerTestimonialsData.getButtonName(), footerTestimonialsData.getLink());
    }
}
