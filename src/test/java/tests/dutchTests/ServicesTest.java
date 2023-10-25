package tests.dutchTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.ServicesSteps;

import static com.codeborne.selenide.Selenide.open;

public class ServicesTest extends BaseTest {

    private ServicesSteps servicesSteps = new ServicesSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        open(SERVICES_LINK_DE);
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
