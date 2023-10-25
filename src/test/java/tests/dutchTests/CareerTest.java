package tests.dutchTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.CareerSteps;

import static com.codeborne.selenide.Selenide.open;

public class CareerTest extends BaseTest {
    private CareerSteps careerSteps = new CareerSteps();

    @BeforeMethod
    @Override
    public void goToUrl() {
        open(CAREER_LINK_DE);
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
