package steps;

import io.qameta.allure.Step;
import pages.FooterPage;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class FooterSteps {

    private FooterPage footerPage = new FooterPage();

    @Step
    public void clickFooterButton(String buttonName, String link){
        switch (buttonName) {
            case ("address"):
                footerPage.addressButton.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("instagram"):
                footerPage.instagramButton.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("facebook"):
                footerPage.facebookButton.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("linkedin"):
                footerPage.linkedinButton.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            default:
                break;
        }
    }

}
