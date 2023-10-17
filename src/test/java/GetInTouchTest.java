import org.testng.Assert;
import org.testng.annotations.Test;
import steps.GetInTouchSteps;
import tests.englishTests.BaseTest;

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
    public void errorMassageTest(){
        getInTouchSteps.clickGetInTouchButton();
        getInTouchSteps.pushSubmitButton();
        Assert.assertEquals(getInTouchSteps.checkErrorMessage(), "Enter your message, please");
    }
}
