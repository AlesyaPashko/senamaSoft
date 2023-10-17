package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.PorfolioPage;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class PortfolioSteps {

    private final String WEB_CONTENT = "Dr. Martens";
    private final String MOBILE_CONTENT = "LIFE TWIG";
    private final String UX_CONTENT = "Eaton Real Estate";
    private final String LIFE_TWIG_LINK = "https://play.google.com/store/apps/details?id=life.twig&pli=1";
    private final String POP_LINK = "https://play.google.com/store/apps/details?id=com.kimuandr.pop";

    PorfolioPage porfolioPage = new PorfolioPage();

    @Step
    public void openWebApplication(){
        porfolioPage.webApplicationButton.click();
        porfolioPage.webApplicationButton.shouldHave(Condition.attributeMatching("class", "active"));
    }
    @Step
    public void openMobileApplication(){
        porfolioPage.mobileApplicationButton.click();
        porfolioPage.mobileApplicationButton.shouldHave(Condition.attributeMatching("class", "active"));
    }

    @Step
    public void openUXApplication(){
        porfolioPage.uxButton.click();
        porfolioPage.uxButton.shouldHave(Condition.attributeMatching("class", "active"));
    }

    @Step
    public void checkUXApplicationContent(){
        porfolioPage.content.shouldHave(Condition.text(UX_CONTENT));
    }

    @Step
    public void checkWebApplicationContent(){
        porfolioPage.content.shouldHave(Condition.text(WEB_CONTENT));
    }

    @Step
    public void checkMobileApplicationContent(){
        porfolioPage.content.shouldHave(Condition.text(MOBILE_CONTENT));
    }

    @Step
    public void checkWebProjectLink(String projectName, String link){
        switch (projectName) {
            case ("Dr.Martens"):
                porfolioPage.martensLink.shouldHave(Condition.text(link));
                porfolioPage.martensLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("British American Tobacco (BAT) – Unlock Your City (UYC)"):
                porfolioPage.batLink.shouldHave(Condition.matchText(link));
                porfolioPage.batLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("The Library ladder company"):
                porfolioPage.libraryLink.shouldHave(Condition.text(link));
                porfolioPage.libraryLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("Cartier"):
                porfolioPage.cartierLink.shouldHave(Condition.text(link));
                porfolioPage.cartierLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("Wild training"):
                porfolioPage.wildLink.shouldHave(Condition.text(link));
                porfolioPage.wildLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("The Junction"):
                porfolioPage.theJunctionLink.shouldHave(Condition.text(link));
                porfolioPage.theJunctionLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("PlatForm 13"):
                porfolioPage.platformLink.shouldHave(Condition.text(link));
                porfolioPage.platformLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("SADA"):
                porfolioPage.sadaLink.shouldHave(Condition.text(link));
                porfolioPage.sadaLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("Reemina"):
                porfolioPage.reeminaLink.shouldHave(Condition.text(link));
                porfolioPage.reeminaLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            default:
                break;
        }
    }

    @Step
    public void checkLifeTwigLink(){
        porfolioPage.lifeTwigLink.shouldHave(Condition.text(LIFE_TWIG_LINK));
        porfolioPage.lifeTwigLink.click();
        switchTo().window(1);
        webdriver().shouldHave(url(LIFE_TWIG_LINK));
    }

    @Step
    public void checkPopLink(){
        porfolioPage.popLink.shouldHave(Condition.text(POP_LINK));
        porfolioPage.popLink.click();
        switchTo().window(1);
        webdriver().shouldHave(url(POP_LINK));
    }

    @Step
    public void checkUXProjectLink(String projectName, String link){
        switch (projectName) {
            case ("SEDA"):
                porfolioPage.sedaLink.shouldHave(Condition.text(link));
                porfolioPage.sedaLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("Glide"):
                porfolioPage.glideLink.shouldHave(Condition.matchText(link));
                porfolioPage.glideLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("POP Play or Pay"):
                porfolioPage.popLink.shouldHave(Condition.text(link));
                porfolioPage.popLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("Life Twig"):
                porfolioPage.lifeTwigLink.shouldHave(Condition.text(link));
                porfolioPage.lifeTwigLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            case ("AFLAT"):
                porfolioPage.aflatLink.shouldHave(Condition.text(link));
                porfolioPage.aflatLink.click();
                switchTo().window(1);
                webdriver().shouldHave(url(link));
                break;
            default:
                break;
        }
    }
}
