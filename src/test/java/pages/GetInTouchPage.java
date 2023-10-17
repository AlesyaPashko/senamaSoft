package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GetInTouchPage {

    public SelenideElement getInTouchForm = $x("//div[@class='styles_wrapperModal__DMwV_']");
    public SelenideElement getInTouchCloseButton = $x("//button[@class='styles_close_btn_modal__dVBjk']");
    public SelenideElement submitButton = $x("//div[@class='styles_wrapperModal__DMwV_']//button[@type='submit']");
    public SelenideElement errorMassage = $x("//div[@class='styles_err_text__y9dSA']");
    public SelenideElement headerZone = $x("//header");
}
