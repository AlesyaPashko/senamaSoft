package tests.englishTests;

import models.UXApplicationsData;
import models.WebApplicationsData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HeaderSteps;
import steps.PortfolioSteps;
import utils.JsonReader;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;


public class PortfolioTest extends BaseTest {
    private PortfolioSteps portfolioSteps = new PortfolioSteps();

    private HeaderSteps headerSteps = new HeaderSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        super.goToUrl();
        headerSteps.clickPortfolioButton();
        webdriver().shouldHave(url(PORTFOLIO_LINK));
    }

    @Test
    public void checkWebApplicationButton(){
        portfolioSteps.openWebApplication();
        portfolioSteps.checkWebApplicationContent();
    }

    @Test
    public void checkMobileApplicationButton(){
        portfolioSteps.openMobileApplication();
        portfolioSteps.checkMobileApplicationContent();
    }

    @Test
    public void checkUXApplicationButton(){
        portfolioSteps.openUXApplication();
        portfolioSteps.checkUXApplicationContent();
    }

    @Test(dataProvider = "webApplicationsData", dataProviderClass = JsonReader.class)
    public void checkWebProjectsLinks(WebApplicationsData webApplicationsData){
        portfolioSteps.openWebApplication();
        portfolioSteps.checkWebProjectLink(webApplicationsData.getProjectName(), webApplicationsData.getLink());
    }

    @Test
    public void checkLifeTwigProjectsLinks(){
        portfolioSteps.openMobileApplication();
        portfolioSteps.checkLifeTwigLink();
    }

    @Test
    public void checkPopProjectsLinks(){
        portfolioSteps.openMobileApplication();
        portfolioSteps.checkPopLink();
    }

    @Test(dataProvider = "uxApplicationsData", dataProviderClass = JsonReader.class)
    public void checkUXProjectsLinks(UXApplicationsData uxApplicationsData){
        portfolioSteps.openUXApplication();
        portfolioSteps.checkUXProjectLink(uxApplicationsData.getProjectName(), uxApplicationsData.getLink());
    }

}