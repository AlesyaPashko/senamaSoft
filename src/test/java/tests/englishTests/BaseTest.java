package tests.englishTests;

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
    private final String URL = bundle.getString("path_to_url");
    public final String SERVICES_LINK = bundle.getString("services_link");
    protected final String PORTFOLIO_LINK = bundle.getString("portfolio_link");
    protected final String CONTACTS_LINK = bundle.getString("contacts_link");
    protected final String CAREER_LINK = bundle.getString("career_link");
    protected final String TESTIMONIALS_LINK = bundle.getString("testimonials_link");
    protected final String LANGUAGE_EN = "en";

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
        open(URL);
    }

    @AfterMethod
    public void clearData() {
        clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWindow();
    }
}