package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.ServicesPage;

public class ServicesSteps {

    private ServicesPage servicesPage = new ServicesPage();

    @Step
    public void checkMobileApplicationButton(){
        servicesPage.mobileApplicationButton.click();
        servicesPage.mobileApplicationProjects.shouldBe(Condition.visible);
    }

    @Step
    public void checkWebApplicationButton(){
        servicesPage.webApplicationButton.click();
        servicesPage.webApplicationProjects.shouldBe(Condition.visible);
    }
}
