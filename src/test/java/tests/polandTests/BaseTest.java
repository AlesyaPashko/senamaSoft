package tests.polandTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.ResourceBundle;
import java.util.logging.Level;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.*;


public class BaseTest {


    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");
    private final String URL_PL = bundle.getString("path_to_url_pl");
    public final String SERVICES_LINK_PL = bundle.getString("services_link_pl");
    protected final String PORTFOLIO_LINK_PL = bundle.getString("portfolio_link_pl");
    protected final String CONTACTS_LINK_PL = bundle.getString("contacts_link_pl");
    protected final String CAREER_LINK_PL = bundle.getString("career_link_pl");
    protected final String TESTIMONIALS_LINK_PL = bundle.getString("testimonials_link_pl");
    protected final String LANGUAGE_PL = "pl";

    @BeforeClass
    public static void startLocal() {
        SelenideLogger.addListener("allure", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
                .enableLogs(LogType.BROWSER, Level.ALL));

        Configuration.browser = CHROME;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeMethod
    public void goToUrl() {
        open(URL_PL);
    }

    @AfterMethod
    public void clearData() {
        clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWindow();
    }
}