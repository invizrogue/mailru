package dmikhaylov.qa.tests;

import dmikhaylov.qa.base.BaseTest;
import static io.qameta.allure.Allure.step;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;

public class MainPageTest extends BaseTest {

    @MethodSource("headMenuProvider")
    @ParameterizedTest(name="Наличие пунктов меню в заголовке главной страницы")
    public void verifyElementsOfHeadMenuTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Проверяем наличие пунктов меню в заголовке главной страницы", () -> {
            mailRuPage.verifyHeaderMenuItems(items);
        });
    }

    @MethodSource("tabsMenuProvider")
    @ParameterizedTest(name="Наличие пунктов таб-меню в основной части страницы")
    public void verifyElementsOfTabsMenuTest(List<String> items) {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Проверяем наличие пунктов таб-меню в основной части страницы", () -> {
            mailRuPage.verifyTabsMenuItems(items);
        });
    }

    @Test
    public void verifySizeOfRegularNewsContentItemsTest() {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Проверяем, что количество основных новостных статей в таб-меню Новости равно 13", () -> {
            mailRuPage.verifySizeOfNewsContent(13);
        });
    }

    @Test
    public void verifySizeOfRegularAutoContentItemsTest() {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Нажимаем на таб-меню Авто", () -> {
            mailRuPage.clickOnAutoTab();
        });
        step("Проверяем, что количество основных новостных статей в таб-меню Авто равно 14", () -> {
            mailRuPage.verifySizeOfNewsContent(14);
        });
    }

    @Test
    public void shouldBeModalAppearsByClickingEnterButtonTest() {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Нажимаем на кнопку Войти", () -> {
            mailRuPage.clickOnEnterButton();
        });
        step("Проверяем, что появилось модальное окно Войти в аккаунт", () -> {
            mailRuPage.checkModalAppears();
        });
    }

    @Test
    public void shouldBeChangeDomainNameByClickingProviderTest() {
        step("Открываем главную страницу сайта", () -> {
            mailRuPage.openPage();
        });
        step("Нажимаем на кнопку Войти", () -> {
            mailRuPage.clickOnEnterButton();
        });
        step("Переключаемся на модальное окно", () -> {
            mailRuPage.checkModalAppears();
        });
        step("Выбираем провайдера Yandex", () -> {
            mailRuPage.clickOnYandexInModal();
        });
        step("Проверяем, что домен сменился на @yandex.ru", () -> {
            mailRuPage.clickOnYandexInModal();
        });
        step("Выбираем провайдера Google", () -> {
            mailRuPage.clickOnGoogleInModal();
        });
        step("Проверяем, что домен сменился на @google.com", () -> {
            mailRuPage.clickOnGoogleInModal();
        });
        step("Выбираем провайдера Mail.ru", () -> {
            mailRuPage.clickOnMailruInModal();
        });
        step("Проверяем, что домен сменился на @mail.ru", () -> {
            mailRuPage.clickOnMailruInModal();
        });
    }

}
