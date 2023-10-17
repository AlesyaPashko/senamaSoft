package steps;

import io.qameta.allure.Step;
import pages.FooterPage;

public class TestimonialsSteps {

    private FooterPage footerPage = new FooterPage();

    @Step
    public void clickFooterButton(String buttonName){
        switch (buttonName) {
            case ("address"):
                footerPage.addressButton.click();
                break;
            case ("instagram"):
                footerPage.instagramButton.click();
                break;
            case ("facebook"):
                footerPage.facebookButton.click();
                break;
            case ("linkedin"):
                footerPage.linkedinButton.click();
                break;
            default:
                break;
        }
    }

}
