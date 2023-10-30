package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pages.GetInTouchPage;
import pages.HeaderPage;
import utils.GetRandom;

import java.io.File;

public class GetInTouchSteps {

    private final String EMPTY_MAIL_TEXT_EN = "The Email/Phone field is required";
    private final String EMPTY_MAIL_TEXT_RU = "Поле Email/Телефон обязательное";
    private final String EMPTY_MAIL_TEXT_AR = "مطلوب حقل البريد الإلكتروني / الهاتف";
    private final String EMPTY_MAIL_TEXT_PL = "Pole e-mail/Telefon jest wymagane";
    private final String EMPTY_MAIL_TEXT_DE = "Das Feld E-Mail/Telefon ist erforderlich";
    private final String EMPTY_MASSAGE_TEXT_EN = "Enter your message, please";
    private final String EMPTY_MASSAGE_TEXT_RU = "Введите, пожалуйста, сообщение";
    private final String EMPTY_MASSAGE_TEXT_AR = "من فضلك أدخل رسالة";
    private final String EMPTY_MASSAGE_TEXT_PL = "Wprowadź wiadomość, proszę.";
    private final String EMPTY_MASSAGE_TEXT_DE = "Bitte geben Sie Ihre Nachricht ein.";
    private final String DELETE_FILE_TEXT_DE = "Datei löschen";
    private final String DELETE_FILE_TEXT_PL = "Pusty";
    private final String DELETE_FILE_TEXT_AR = "فارغ";
    private final String DELETE_FILE_TEXT_RU = "Пусто";
    private final String DELETE_FILE_TEXT_EN = "No file";

    private GetInTouchPage getInTouchPage = new GetInTouchPage();
    private HeaderPage headerPage = new HeaderPage();

    @Step
    public void clickGetInTouchButton(){
        headerPage.getInTouchButton.click();
    }

    @Step
    public void checkGetInTouchFormOpen(){
        getInTouchPage.getInTouchForm.shouldBe(Condition.visible);
    }

    @Step
    public void checkGetInTouchFormCloseByButton(){
        getInTouchPage.getInTouchCloseButton.click();
        getInTouchPage.getInTouchForm.shouldNotBe(Condition.visible);
    }

    @Step
    public void checkGetInTouchFormCloseWithoutCloseButton(){
        Selenide.actions().moveToElement(getInTouchPage.headerZone).click().build().perform();
        getInTouchPage.getInTouchForm.shouldNotBe(Condition.visible);
    }

    @Step
    public void pushSubmitButton(){
        getInTouchPage.submitButton.click();
    }

    @Step
    public void fillMail(){
        getInTouchPage.mailInput.setValue(GetRandom.random());
    }

    @Step
    public void fillMassage(){
        getInTouchPage.massageInput.setValue(GetRandom.random());
    }

    @Step
    public void addFile(String filePath, String text, String fileType){
        File file = new File(filePath);
        getInTouchPage.fileInput.uploadFile(file);
        if(fileType.equals("error")){
            getInTouchPage.fileErrorText.shouldHave(Condition.text(text));
        } else {
            getInTouchPage.fileText.get(0).shouldHave(Condition.text(text));
        }
    }

    @Step
    public void deleteFile(String language){
        getInTouchPage.deleteFileButton.click();
        switch (language){
            case "en":
                getInTouchPage.fileText.get(0).shouldHave(Condition.text(DELETE_FILE_TEXT_EN));
                break;
            case "ru":
                getInTouchPage.fileText.get(0).shouldHave(Condition.text(DELETE_FILE_TEXT_RU));
                break;
            case "ar":
                getInTouchPage.fileText.get(0).shouldHave(Condition.text(DELETE_FILE_TEXT_AR));
                break;
            case "pl":
                getInTouchPage.fileText.get(0).shouldHave(Condition.text(DELETE_FILE_TEXT_PL));
                break;
            case "de":
                getInTouchPage.fileText.get(0).shouldHave(Condition.text(DELETE_FILE_TEXT_DE));
                break;
            default:
                break;
        }
    }

    @Step
    public void checkErrorOnlyMailText(String language){
        switch (language){
            case "en":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_EN));
                break;
            case "ru":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_RU));
                break;
            case "ar":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_AR));
                break;
            case "pl":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_PL));
                break;
            case "de":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_DE));
                break;
            default:
                break;
        }

    }

    @Step
    public void checkErrorOnlyMessageText(String language){
        switch (language){
            case "en":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_EN));
                break;
            case "ru":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_RU));
                break;
            case "ar":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_AR));
                break;
            case "pl":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_PL));
                break;
            case "de":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_DE));
                break;
            default:
                break;
        }
    }

    @Step
    public void checkBothErrorText(String language){
        switch (language){
            case "en":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_EN));
                getInTouchPage.errorMassage.get(1).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_EN));
                break;
            case "ru":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_RU));
                getInTouchPage.errorMassage.get(1).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_RU));
                break;
            case "ar":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_AR));
                getInTouchPage.errorMassage.get(1).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_AR));
                break;
            case "pl":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_PL));
                getInTouchPage.errorMassage.get(1).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_PL));
                break;
            case "de":
                getInTouchPage.errorMassage.get(0).shouldHave(Condition.text(EMPTY_MAIL_TEXT_DE));
                getInTouchPage.errorMassage.get(1).shouldHave(Condition.text(EMPTY_MASSAGE_TEXT_DE));
                break;
            default:
                break;
        }
    }
}
