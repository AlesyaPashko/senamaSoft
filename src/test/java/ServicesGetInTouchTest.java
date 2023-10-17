import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HeaderSteps;

public class ServicesGetInTouchTest extends GetInTouchTest{

    private HeaderSteps headerSteps = new HeaderSteps();

//    @BeforeMethod
//    @Override
//    public void goToUrl() {
//        super.goToUrl();
//        headerSteps.clickServicesButton();
//    }

    @Test
    @Override
    public void openGetInTouchFormTest() {
        super.openGetInTouchFormTest();
    }

    @Test
    @Override
    public void closeGetInTouchFormByButtonTest() {
        super.closeGetInTouchFormByButtonTest();
    }

    @Test
    @Override
    public void closeGetInTouchFormWithoutButtonTest() {
        super.closeGetInTouchFormWithoutButtonTest();
    }

    @Test
    @Override
    public void errorMassageTest() {
        super.errorMassageTest();
    }
}
