package tests.russianTests;

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
        getInTouchSteps.checkBothErrorText(LANGUAGE_RU);
    }

    @Test
    public void emptyMassageTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.fillMail();
        getInTouchSteps.pushSubmitButton();
        getInTouchSteps.checkErrorOnlyMessageText(LANGUAGE_RU);
    }

    @Test
    public void emptyMailTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.fillMassage();
        getInTouchSteps.pushSubmitButton();
        getInTouchSteps.checkErrorOnlyMailText(LANGUAGE_RU);
    }

    @Test(dataProvider = "geInTouchData", dataProviderClass = JsonReader.class)
    public void addRightFile(GetInTouchData getInTouchData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchData.getFile(), getInTouchData.getText(), "right");
    }

    @Test(dataProvider = "geInTouchErrorData", dataProviderClass = JsonReader.class)
    public void addWrongFile(GetInTouchErrorData getInTouchErrorData){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.addFile(getInTouchErrorData.getFile(), getInTouchErrorData.getTextRu(), "error");
    }
}