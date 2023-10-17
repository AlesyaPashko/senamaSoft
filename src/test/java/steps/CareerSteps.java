package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.CareerPage;

public class CareerSteps {

    CareerPage careerPage = new CareerPage();

    @Step
    public void checkFullInformationOpen(){
        careerPage.seeMoreButton.click();
        careerPage.fullInformationButton.shouldBe(Condition.visible);
    }

    @Step
    public void checkFullInformationClose(){
        careerPage.seeMoreButton.doubleClick();
        careerPage.fullInformationButton.shouldNotBe(Condition.visible);
    }
}
