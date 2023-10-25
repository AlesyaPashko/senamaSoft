package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FooterPage {

    public SelenideElement addressButton = $x("//a[contains(@href,'https://www.google.com/maps')]");
    public SelenideElement instagramButton = $x("//a[contains(@href,'https://www.instagram')]");
    public SelenideElement facebookButton = $x("//a[contains(@href,'https://www.facebook')]");
    public SelenideElement linkedinButton = $x("//a[contains(@href,'https://www.linkedin.com/company')]");
}
