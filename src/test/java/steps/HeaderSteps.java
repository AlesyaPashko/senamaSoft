package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.HeaderPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HeaderSteps {

    public final String ACTIVE_CLASS_NAME = "styles_active_link__2_2NK";

    private HeaderPage headerPage = new HeaderPage();

    @Step
    public void clickTabName(String tabName, String link){
        switch (tabName) {
            case ("logo"):
                headerPage.logoButton.click();
                headerPage.homeButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("home"):
                headerPage.homeButton.click();
                headerPage.homeButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("services"):
                headerPage.servicesButton.click();
                headerPage.servicesButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("portfolio"):
                headerPage.portfolioButton.click();
                headerPage.portfolioButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("contacts"):
                headerPage.contactsButton.click();
                headerPage.contactsButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("career"):
                headerPage.careerButton.click();
                headerPage.careerButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            case ("testimonials"):
                headerPage.testimonialsButton.click();
                headerPage.testimonialsButton.shouldHave(attribute("class", ACTIVE_CLASS_NAME));
                webdriver().shouldHave(url(link));
                break;
            default:
                break;
        }
    }

    @Step
    public void changeLanguage(String language, String activeClassName){
        switch (language) {
            case ("english"):
                headerPage.enButton.click();
                headerPage.enButton.shouldHave(attribute("class", activeClassName));
                break;
            case ("russian"):
                headerPage.ruButton.click();
                headerPage.ruButton.shouldHave(attribute("class", activeClassName));
                break;
            case ("arab"):
                headerPage.arButton.click();
                headerPage.arButton.shouldHave(attribute("class", activeClassName));
                break;
            case ("poland"):
                headerPage.plButton.click();
                headerPage.plButton.shouldHave(attribute("class", activeClassName));
                break;
            case ("dutch"):
                headerPage.deButton.click();
                headerPage.deButton.shouldHave(attribute("class", activeClassName));
                break;
            default:
                break;
        }
    }

    @Step
    public void checkWelcomeContent(String welcomeContent){
        headerPage.welcomeContent.shouldHave(Condition.text(welcomeContent));
    }

    @Step
    public void checkServicesContent(String servicesContent){
        headerPage.servicesContent.shouldHave(Condition.text(servicesContent));
    }

    @Step
    public void checkPortfolioContent(String portfolioContent){
        headerPage.portfolioContent.shouldHave(Condition.text(portfolioContent));
    }

    @Step
    public void checkContactContent(String contactContent){
        headerPage.contactContent.shouldHave(Condition.text(contactContent));
    }

    @Step
    public void checkCareerContent(String careerContent){
        headerPage.careerContent.shouldHave(Condition.text(careerContent));
    }

    @Step
    public void checkTestimonialsContent(String testimonialsContent){
        headerPage.testimonialsContent.shouldHave(Condition.text(testimonialsContent));
    }

    @Step
    public void clickServicesButton(){
        headerPage.servicesButton.click();
    }

    @Step
    public void clickPortfolioButton(){
        headerPage.portfolioButton.click();
    }

    @Step
    public void clickCareerButton(){
        headerPage.careerButton.click();
    }
}
