package ui.catalogFactories.StandartCompany;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ui.catalogFactories.DemfaCompany.DemfaPage;
import utils.RandomUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class StandartPage {
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";

    private final SelenideElement catalog = $x("/html/body/header/div/nav/ul/li[1]/a");
    private final SelenideElement standart = $x("//a[(@href=\"/main/factory/select-factory/standart/\")]");
    private final SelenideElement facadePvh = $x("//a[(@href=\"/select-facade/pvh-standart/\")]");
    private final SelenideElement straightFacade = $x("//a[(@href=\"/catalog/decors/pvh-pryamie-Standart\")]");

    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//*[@id=\"exampleModal\"]/div/form/div/div[3]/button[2]");
    private final SelenideElement continue2 = $x("//button[@class=\"btn btn-primary\"]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final ElementsCollection millingCollection = $$x("//a[contains(@class, \"card d-block  m-0 milling-item-button\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement addToBasketBtn = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement checkOutBtn = $x("//body[(@class=\"body-page personal-area\")]//ancestor::a[(@data-type=\"go-to-checkout\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js\")]");
    private final SelenideElement goToBasket = $x("//a[@class='basket-header-link']");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");

    private final SelenideElement qrCode = $x("//input[(@value=\"raiff\")]//ancestor::label");
    private final SelenideElement qrCodeRadio = $x("//input[(@value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//label[(@for=\"deliveryCityCheckbox\")]");
    private final SelenideElement deliveryCityCheckbox = $x("//input[(@id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");


    @Step("Проверяю, что кнопка Каталог активна и кликаю по ней")
    public StandartPage openCatalog() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    @Step("Проверяю, что кнопка Стандарт активна и кликаю по ней")
    public StandartPage openStandartFabric() {
        standart.shouldBe(Condition.enabled).click();
        return this;
    }
    @Step("Проверяю, что кнопка Фасады ПВХ активна и кликаю по ней")
    public StandartPage openFacadePvh() {
        facadePvh.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    @Step("Проверяю, что кнопка Фасады прямые активна и кликаю по ней")
    public StandartPage setStraightFacade() {
        straightFacade.shouldBe(Condition.enabled).click();
        return this;
    }
    @Step("Кликаю на рандомный декор")
    public StandartPage setRandomDecor() {
        SelenideElement element = RandomUtils
                .getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
        return this;
    }
    @Step("Кликаю на кнопку - Продолжить")
    public void continue1Click() {
        continue1.shouldBe(Condition.enabled).click();
    }

    @Step("Кликаю на рандомную фрезеровку")
    public void setRandomMilling() {
        SelenideElement element1 = RandomUtils
                .getRandomElementFromList(millingCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
    }
    @Step("Кликаю на кнопку - Продолжить")
    public void continue2Click() {
        continue2.shouldBe(Condition.enabled).click();
    }

    @Step("Ввожу высоту")
    public void setHeight() {
        heightArea.shouldBe(Condition.enabled).sendKeys(BASE_HEIGHT);
    }
    @Step("Ввожу ширину")
    public void setWidth() {
        widthArea.shouldBe(Condition.enabled).sendKeys(BASE_WIDTH);
    }


    @Step("Кликаю по кнопке Рассчитать стоимость заказа")
    public void calculateClick() {
        calculate.scrollTo();
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        addToBasketBtn.scrollTo();
    }
    @Step("Проверяю, что кнопка Добавить в корзину - активна и кликаю по ней")
    public void addToBasketClick() {
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    @Step("Проверяю, что кнопка Перейти в корзину - активна и кликаю по ней")
    public void goToBasketClick() {
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    @Step("Проверяю, что кнопка Перейти к оформлению - активна и кликаю по ней")
    public void goToCheckOutClick() {
        checkOutBtn.scrollTo();
        goToCheckOut.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    @Step("Кликаю по кнопке - оплатить по QR коду и проверяю, что активировался нужный Radio")
    public void qrCodeClick() {
        qrCode.click();
        qrCodeRadio.should(Condition.selected);
    }

    @Step("Кликаю по кнопке - подтвердить город доставки и проверяю, что активировался нужный чек бокс")
    public void deliveryCityClick() {
        deliveryCity.click();
        deliveryCityCheckbox.should(Condition.selected);
    }

    @Step("Проверяю, что кнопка Оплатить - активна и доступна")
    public void checkedPaymentBtn() {
        paymentBtn.should(Condition.enabled);
    }
}
