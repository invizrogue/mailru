package dmikhaylov.qa.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import dmikhaylov.qa.helpers.Attach;
import dmikhaylov.qa.pages.MailRuPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    protected MailRuPage mailRuPage = new MailRuPage();

    protected static Stream<List<String>> headMenuProvider() {
        return Stream.of(List.of("Mail.ru", "Почта", "Облако", "Одноклассники",
                "Вконтакте", "Новости", "Знакомства"));
    }

    protected static Stream<List<String>> tabsMenuProvider() {
        return Stream.of(List.of("Новости", "Спецоперация", "Спорт", "Леди", "Авто", "Кино",
                "Hi-Tech", "Игры", "Дети", "Здоровье", "Дом", "Питомцы"));
    }

    @BeforeAll
    static void setUp() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.browserSize = System.getProperty("browserSize", "1366x768");
        Configuration.baseUrl = System.getProperty("baseUrl", "https://mail.ru");
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = "https://user1:1234@"
                + System.getProperty("selenoidUrl", "selenoid.autotests.cloud")
                + "/wd/hub";
        System.setProperty("chromeoptions.prefs","intl.accept_languages=ru");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}
