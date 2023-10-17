package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    public SelenideElement seeMoreButton = $x("//div[@class='styles_offers_block_info__Kfg3J']//button");
    public SelenideElement fullInformationButton = $x("//div[@class='styles_offers_block_info__Kfg3J']//h4[text()='We offer']");
}
