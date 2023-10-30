package tests.dutchTests;

import models.GetInTouchData;
import models.GetInTouchErrorData;
import org.testng.annotations.Test;
import steps.GetInTouchSteps;
import utils.JsonReader;

public class GetInTouchTest extends BaseTest {

    private GetInTouchSteps getInTouchSteps = new GetInTouchSteps();

    @Test
    public void openGetInTouchFormTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.checkGetInTouchFormOpen();
    }

    @Test
    public void closeGetInTouchFormByButtonTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.checkGetInTouchFormCloseByButton();
    }

    @Test
    public void closeGetInTouchFormWithoutButtonTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.checkGetInTouchFormCloseWithoutCloseButton();
    }

    @Test
    public void emptyFormTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.pushSubmitButton();
        getInTouchSteps.checkBothErrorText(LANGUAGE_DE);
    }

    @Test
    public void emptyMassageTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.fillMail();
        getInTouchSteps.pushSubmitButton();
        getInTouchSteps.checkErrorOnlyMessageText(LANGUAGE_DE);
    }

    @Test
    public void emptyMailTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.fillMassage();
        getInTouchSteps.pushSubmitButton();
        getInTouchSteps.checkErrorOnlyMailText(LANGUAGE_DE);
    }

    @Test(dataProvider = "geInTouchData", dataProviderClass = JsonReader.class)
    public void addRightFile(GetInTouchData getInTouchData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchData.getFile(), getInTouchData.getText(), "right");
    }

    @Test(dataProvider = "geInTouchData", dataProviderClass = JsonReader.class)
    public void deleteRightFile(GetInTouchData getInTouchData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchData.getFile(), getInTouchData.getText(), "right");
        getInTouchSteps.deleteFile(LANGUAGE_DE);
    }

    @Test(dataProvider = "geInTouchErrorData", dataProviderClass = JsonReader.class)
    public void addWrongFile(GetInTouchErrorData getInTouchErrorData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchErrorData.getFile(), getInTouchErrorData.getTextDe(), "error");
    }

    @Test(dataProvider = "geInTouchErrorData", dataProviderClass = JsonReader.class)
    public void deleteErrorFile(GetInTouchErrorData getInTouchErrorData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchErrorData.getFile(), getInTouchErrorData.getTextDe(), "error");
        getInTouchSteps.deleteFile(LANGUAGE_DE);
    }
}
