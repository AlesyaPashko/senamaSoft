package tests.russianTests;

import models.HeaderData;
import models.HeaderLanguageData;
import org.testng.annotations.Test;
import steps.HeaderSteps;
import utils.JsonReader;

public class HeaderTest extends BaseTest {

    private HeaderSteps headerSteps = new HeaderSteps();

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkHomeHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkServiceHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName("services", SERVICES_LINK_RU);
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkPortfolioHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName("portfolio", PORTFOLIO_LINK_RU);
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkContactsHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName("contacts", CONTACTS_LINK_RU);
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkCareerHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName("career", CAREER_LINK_RU);
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerData", dataProviderClass = JsonReader.class)
    public void checkTestimonialsHeaderLinks(HeaderData headerData) {
        headerSteps.clickTabName("testimonials", TESTIMONIALS_LINK_RU);
        headerSteps.clickTabName(headerData.getTabName(), headerData.getLinkRu());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkHomeLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkWelcomeContent(headerLanguageData.getWelcomeContent());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkServiceLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.clickTabName("services", SERVICES_LINK_RU);
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkServicesContent(headerLanguageData.getServicesContent());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkPortfolioLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.clickTabName("portfolio", PORTFOLIO_LINK_RU);
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkPortfolioContent(headerLanguageData.getPortfolioContent());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkContactsLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.clickTabName("contacts", CONTACTS_LINK_RU);
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkContactContent(headerLanguageData.getContactsContent());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkCareerLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.clickTabName("career", CAREER_LINK_RU);
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkCareerContent(headerLanguageData.getCareerContent());
    }

    @Test(dataProvider = "headerLanguageData", dataProviderClass = JsonReader.class)
    public void checkTestimonialsLanguageChange(HeaderLanguageData headerLanguageData) {
        headerSteps.clickTabName("testimonials", TESTIMONIALS_LINK_RU);
        headerSteps.changeLanguage(headerLanguageData.getLanguage());
        headerSteps.checkTestimonialsContent(headerLanguageData.getTestimonialsContent());
    }
}
