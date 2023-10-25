package tests.dutchTests;

import models.ProjectsData;
import org.testng.annotations.Test;
import steps.HomeSteps;
import utils.JsonReader;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HomeTest extends BaseTest {
    private HomeSteps homeSteps = new HomeSteps();

    @Test
    public void checkReadMoreButton() {

        homeSteps.clickReadMoreButton();
        webdriver().shouldHave(url(SERVICES_LINK_DE));

    }

    @Test(dataProvider = "projectsData", dataProviderClass = JsonReader.class)
    public void openProjectByIcon(ProjectsData projectsData) {

        homeSteps.checkProjectIcon(projectsData.getProjectName(), projectsData.getProjectDescriptionDe());

    }

    @Test
    public void checkMoreProjectsButton(){
        homeSteps.clickMoreProjectButton();
        webdriver().shouldHave(url(PORTFOLIO_LINK_DE));
    }
}
