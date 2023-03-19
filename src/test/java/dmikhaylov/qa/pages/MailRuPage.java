package dmikhaylov.qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MailRuPage {

    final static ElementsCollection headMenu = $$("div.headline div.ph-projects a");
    final static ElementsCollection tabsMenu = $$("div.tabs a");
    final static ElementsCollection tabsContent = $$("ul.tabs-content li div.news-item_regular");
    final static SelenideElement buttonEnter = $x("//button[text()='Войти']");
    final static SelenideElement buttonCreate = $x("//button[text()='Создать почту']");

    public MailRuPage openPage() {
        open("/");
        return this;
    }

    public MailRuPage verifyHeaderMenuItems(List<String> items) {
        headMenu.filter(visible).shouldHave(texts(items));
        return this;
    }

    public MailRuPage verifyTabsMenuItems(List<String> items) {
        tabsMenu.filter(visible).shouldHave(texts(items));
        return this;
    }

    public MailRuPage verifySizeOfNewsContent(int size) {
        tabsContent.filter(visible).shouldHave(size(size));
        return this;
    }

    public MailRuPage clickOnAutoTab() {
        $x("//a[text()='Авто']").click();
        return this;
    }

    public MailRuPage clickOnEnterButton() {
        buttonEnter.click();
        return this;
    }

    public MailRuPage checkModalAppears() {
        switchTo().frame($x("//div[contains(@class, 'ag-popup__frame_show')]//iframe"));
        $x("//h3[text()='Войти в аккаунт']").shouldBe(visible);
        return this;
    }

    public MailRuPage clickOnMailruInModal() {
        $("div[data-provider='mailru']").click();
        return this;
    }

    public MailRuPage clickOnYandexInModal() {
        $("div[data-provider='yandex']").click();
        return this;
    }

    public MailRuPage clickOnGoogleInModal() {
        $("div[data-provider='google']").click();
        return this;
    }

    public MailRuPage checkMailruDomain() {
        $x("//div[@class='domain-select']//span[text()='@mail.ru']").shouldBe(visible);
        return this;
    }

    public MailRuPage checkGoogleDomain() {
        $x("//div[@class='domain-select']//span[text()='@google.com']").shouldBe(visible);
        return this;
    }

    public MailRuPage checkYandexDomain() {
        $x("//div[@class='domain-select']//span[text()='@yandex.ru']").shouldBe(visible);
        return this;
    }



}
