package tests.englishTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.CareerSteps;
import steps.HeaderSteps;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CareerTest extends BaseTest {
    private CareerSteps careerSteps = new CareerSteps();
    private HeaderSteps headerSteps = new HeaderSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        super.goToUrl();
        headerSteps.clickCareerButton();
        webdriver().shouldHave(url(CAREER_LINK));
    }

    @Test
    public void checkOpenFullInformation() {
        careerSteps.checkFullInformationOpen();
    }

    @Test
    public void checkCloseFullInformation() {
        careerSteps.checkFullInformationClose();
    }

}
