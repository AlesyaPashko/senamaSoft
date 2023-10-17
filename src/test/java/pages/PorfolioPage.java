package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PorfolioPage {

    public SelenideElement webApplicationButton = $x("//label[@for='switch1']");
    public SelenideElement mobileApplicationButton = $x("//label[@for='switch2']");
    public SelenideElement uxButton = $x("//label[@for='switch3']");
    public SelenideElement content = $x("//div[contains(@class,'styles_portfolio_list')]");
    public SelenideElement martensLink = $x("//a[@href='https://www.drmartens.com/us/en/']");
    public SelenideElement batLink = $x("//a[@href='https://www.unlockyourcity.co.uk/']");
    public SelenideElement libraryLink = $x("//a[@href='https://llcompany.co.uk/']");
    public SelenideElement cartierLink = $x("//a[@href='https://www.cartier.com.au/']");
    public SelenideElement wildLink = $x("//a[@href='https://www.wildtraining.co.uk/']");
    public SelenideElement theJunctionLink = $x("//a[@href='https://www.thejunctionleeds.co.uk/']");
    public SelenideElement platformLink = $x("//a[@href='https://www.platform13.net/']");
    public SelenideElement sadaLink = $x("//a[@href='https://www.sadaproject.org/']");
    public SelenideElement reeminaLink = $x("//a[@href='https://www.reemina.com/']");
    public SelenideElement lifeTwigLink = $x("//a[@href='https://play.google.com/store/apps/details?id=life.twig&pli=1']");
    public SelenideElement popLink = $x("//a[@href='https://play.google.com/store/apps/details?id=com.kimuandr.pop']");
    public SelenideElement sedaLink = $x("//a[@href='https://www.seda.xyz/']");
    public SelenideElement glideLink = $x("//a[@href='https://www.glideapps.com/']");
    public SelenideElement aflatLink = $x("//a[@href='https://www.affflat.com/']");
}
