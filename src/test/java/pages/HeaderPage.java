package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderPage {

    public SelenideElement logoButton = $x("//a[@class='styles_header_logo__GtU3C styles_pic__qRlW8']");
    public SelenideElement homeButton = $x("//header//nav//a[@href='/']");
    public SelenideElement servicesButton = $x("//header//a[@href='/services']");
    public SelenideElement portfolioButton = $x("//header//a[@href='/portfolio']");
    public SelenideElement contactsButton = $x("//header//a[@href='/contacts']");
    public SelenideElement careerButton = $x("//header//a[@href='/offers']");
    public SelenideElement testimonialsButton = $x("//header//a[@href='/testimonials']");
    public SelenideElement enButton = $x("//header//a[text()='en']");
    public SelenideElement ruButton = $x("//header//a[text()='ru']");
    public SelenideElement arButton = $x("//header//a[text()='ar']");
    public SelenideElement plButton = $x("//header//a[text()='pl']");
    public SelenideElement deButton = $x("//header//a[text()='de']");
    public SelenideElement getInTouchButton = $x("//header//button[contains(@class,'styles_join_btn__')]");
    public SelenideElement welcomeContent = $x("//div[@class='styles_welcome_content__Z84k5']//p");
    public SelenideElement servicesContent = $x("//div[contains(@class,'styles_services_header')]//p");
    public SelenideElement portfolioContent = $x("//div[@class='styles_container__Nwnoi']//h1");
    public SelenideElement contactContent = $x("//div[@class='styles_contacts__zPY6b']");
    public SelenideElement careerContent = $x("//div[@class='styles_offers_header_wrapper__Ua6Zg']");
    public SelenideElement testimonialsContent = $x("//div[@class='styles_testimonials_header_wrapper__wpeym']");
}
