package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GetInTouchPage {

    public SelenideElement getInTouchForm = $x("//div[@class='styles_wrapperModal__DMwV_']");
    public SelenideElement getInTouchCloseButton = $x("//button[@class='styles_close_btn_modal__dVBjk']");
    public SelenideElement submitButton = $x("//div[@class='styles_wrapperModal__DMwV_']//button[@type='submit']");
    public ElementsCollection errorMassage = $$x("//div[@class='styles_err_text__y9dSA']");
    public SelenideElement mailInput = $x("//div[@class='styles_wrapperModal__DMwV_']//input[@name='email']");
    public SelenideElement massageInput = $x("//div[@class='styles_wrapperModal__DMwV_']//textarea[@class='styles_form_textarea__3cyt2  ']");
    public SelenideElement fileInput = $x("//input[@name='file']");
    public SelenideElement deleteFileButton = $x("//label");
    public ElementsCollection fileText = $$x("//p[@class='styles_emty_text__eELEI']");
    public SelenideElement fileErrorText = $x("//p[@class='styles_err_text__y9dSA']");
    public SelenideElement headerZone = $x("//header");
}
