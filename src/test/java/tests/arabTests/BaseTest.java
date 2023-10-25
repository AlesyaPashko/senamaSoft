package tests.arabTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import steps.HeaderSteps;

import java.util.ResourceBundle;
import java.util.logging.Level;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.*;


public class BaseTest {


    static ResourceBundle bundle = ResourceBundle.getBundle("test_framework");
    private final String URL_AR = bundle.getString("path_to_url_ar");
    public final String SERVICES_LINK_AR = bundle.getString("services_link_ar");
    protected final String PORTFOLIO_LINK_AR = bundle.getString("portfolio_link_ar");
    protected final String CONTACTS_LINK_AR = bundle.getString("contacts_link_ar");
    protected final String CAREER_LINK_AR = bundle.getString("career_link_ar");
    protected final String TESTIMONIALS_LINK_AR = bundle.getString("testimonials_link_ar");
    protected final String LANGUAGE_AR = "ar";

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
        open(URL_AR);
    }

    @AfterMethod
    public void clearData() {
        clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWindow();
    }
}