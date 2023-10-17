package tests.englishTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HeaderSteps;
import steps.ServicesSteps;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ServicesTest extends BaseTest {

    private HeaderSteps headerSteps = new HeaderSteps();
    private ServicesSteps servicesSteps = new ServicesSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        super.goToUrl();
        headerSteps.clickServicesButton();
        webdriver().shouldHave(url(SERVICES_LINK));
    }

    @Test
    public void checkMobileApplicationButton(){
        servicesSteps.checkMobileApplicationButton();
    }

    @Test
    public void checkWebApplicationButton(){
        servicesSteps.checkWebApplicationButton();
    }

}
