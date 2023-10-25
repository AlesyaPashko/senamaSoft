package tests.russianTests;

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
    private final String URL_RU = bundle.getString("path_to_url_ru");
    protected final String SERVICES_LINK_RU = bundle.getString("services_link_ru");
    protected final String PORTFOLIO_LINK_RU = bundle.getString("portfolio_link_ru");
    protected final String CONTACTS_LINK_RU = bundle.getString("contacts_link_ru");
    protected final String CAREER_LINK_RU = bundle.getString("career_link_ru");
    protected final String TESTIMONIALS_LINK_RU = bundle.getString("testimonials_link_ru");
    protected final String LANGUAGE_RU = "ru";

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
        open(URL_RU);
    }

    @AfterMethod
    public void clearData() {
        clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWindow();
    }
}