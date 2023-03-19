package dmikhaylov.qa.base;

import com.codeborne.selenide.logevents.SelenideLogger;
import dmikhaylov.qa.config.WebDriverProvider;
import dmikhaylov.qa.helpers.Attach;
import dmikhaylov.qa.pages.MailRuPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
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
        WebDriverProvider.setUp();
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
