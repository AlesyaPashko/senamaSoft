package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ServicesPage {

    public SelenideElement mobileApplicationButton = $x("//li[@class='styles_mobile_serv__0IfqM']");
    public SelenideElement webApplicationButton = $x("//li[@class='styles_webapp_serv__9RB_S']");
    public SelenideElement mobileApplicationProjects = $x("//label[contains(@for,'switch2') and contains(@class,'active')]");
    public SelenideElement webApplicationProjects = $x("//label[contains(@for,'switch1') and contains(@class,'active')]");
}
