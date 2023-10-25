package tests.dutchTests;

import models.UXApplicationsData;
import models.WebApplicationsData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.PortfolioSteps;
import utils.JsonReader;

import static com.codeborne.selenide.Selenide.open;


public class PortfolioTest extends BaseTest {
    private PortfolioSteps portfolioSteps = new PortfolioSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        open(PORTFOLIO_LINK_DE);
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
