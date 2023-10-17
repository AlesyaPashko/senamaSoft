package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.HomePage;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @Step
    public void clickReadMoreButton(){
        homePage.readMoreButton.click();
    }

    @Step
    public void checkProjectIcon(String projectName, String description){
        switch (projectName) {
            case ("Dr.Martens"):
                homePage.martensProjectButton.click();
                homePage.martensProjectDescription.shouldHave(Condition.text(description));
                break;
            case ("The Library ladder company"):
                homePage.libraryLadderProjectButton.click();
                homePage.libraryLadderProjectDescription.shouldHave(Condition.text(description));
                break;
            case ("Cartier"):
                homePage.cartierProjectButton.click();
                homePage.cartierProjectDescription.shouldHave(Condition.text(description));
                break;
            case ("Wild training"):
                homePage.wildTrainingProjectButton.click();
                homePage.wildTrainingProjectDescription.shouldHave(Condition.text(description));
                break;
            default:
                break;
        }
    }

    @Step
    public void clickMoreProjectButton(){
        homePage.moreProjectsButton.click();
    }
}
