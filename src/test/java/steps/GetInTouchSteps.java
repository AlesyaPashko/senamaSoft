package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.GetInTouchPage;
import pages.HeaderPage;

public class GetInTouchSteps {

    private GetInTouchPage getInTouchPage = new GetInTouchPage();
    private HeaderPage headerPage = new HeaderPage();

    @Step
    public void clickGetInTouchButton(){
        headerPage.getInTouchButton.click();
    }

    @Step
    public void checkGetInTouchFormOpen(){
        getInTouchPage.getInTouchForm.shouldBe(Condition.visible);
    }

    @Step
    public void checkGetInTouchFormCloseByButton(){
        getInTouchPage.getInTouchCloseButton.click();
        getInTouchPage.getInTouchForm.shouldNotBe(Condition.visible);
    }

    @Step
    public void checkGetInTouchFormCloseWithoutCloseButton(){
        Selenide.actions().moveToElement(getInTouchPage.headerZone).click().build().perform();
        getInTouchPage.getInTouchForm.shouldNotBe(Condition.visible);
    }

    @Step
    public void pushSubmitButton(){
        getInTouchPage.submitButton.click();
    }

    @Step
    public String checkErrorMessage(){
        return getInTouchPage.errorMassage.getText();
    }
}
