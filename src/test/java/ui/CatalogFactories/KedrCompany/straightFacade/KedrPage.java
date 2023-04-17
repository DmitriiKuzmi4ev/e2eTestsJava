package ui.CatalogFactories.KedrCompany.straightFacade;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.RandomUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class KedrPage {
    private static final String BASE_HEIGHT = "716";
    private static final String BASE_WIDTH = "497";
    private final SelenideElement catalog = $x("/html/body/header/div/nav/ul/li[1]/a");
    private final SelenideElement kedr = $x("//a[contains(@href, \"/main/factory/select-factory/kedr/\")]");
    private final SelenideElement plastic = $x("/html/body/div[5]/div/div[2]/div/div/nav/a[1]");
    private final SelenideElement aluminiumColor = $x("/html/body/div[5]/div/div[2]/div[2]/div/div[1]/div/div[3]/a");
    private final ElementsCollection decorCollection = $$x("//div[contains(@class, \"col-md-6 col-lg-3 mb-4 decor-item\")]");
    private final SelenideElement continue1 = $x("//*[@id=\"exampleModal\"]/div/form/div/div[3]/button[2]");
    private final SelenideElement heightArea = $x("//input[contains(@class, \"detail-height-input form-control\")]");
    private final SelenideElement widthArea = $x("//input[contains(@class, \"detail-width-input form-control\")]");
    private final ElementsCollection edgeCollection = $$x("//div[contains(@class, \"d-flex mb-2 align-items-center edge-decor-item-parent\")]");
    private final SelenideElement calculate = $x("//button[contains(@class, \"btn btn-success mb-4\")]");
    private final SelenideElement addToBasketBtn = $x("//a[contains(@data-href, \"/order/add-to-basket/\")]");
    private final SelenideElement checkOutBtn = $x("//a[contains(@data-type, \"go-to-checkout\")]");
    private final SelenideElement addToBasket = $x("//a[contains(@class, \"add-to-basket-js\")]");
    private final SelenideElement goToBasket = $x("//a[@class='basket-header-link']");
    private final SelenideElement goToCheckOut = $x("//a[contains(@class, \"btn btn-lg btn-success w-100 mb-4\")]");
    private final SelenideElement aluminiumSlim = $x("//a[@data-slug=\"plast-Al-color-slim\"]");

    private final SelenideElement qrCode = $x("//input[(@value=\"raiff\")]//ancestor::label");
    private final SelenideElement qrCodeRadio = $x("//input[(@value=\"raiff\")]");
    private final SelenideElement deliveryCity = $x("//label[(@for=\"deliveryCityCheckbox\")]");
    private final SelenideElement deliveryCityCheckbox = $x("//input[(@id=\"deliveryCityCheckbox\")]");
    private final SelenideElement paymentBtn = $x("//button[contains(@class, \" btn-success w-100\")]");
    private final SelenideElement aluminiumSilver = $x("//a[@data-slug=\"plastik-AL-silver\"]");
    private final SelenideElement facadeWithOutEdge = $x("//a[(@href=\"/catalog/decors/simple\")]");
    private final SelenideElement facadeWithEdge = $x("//a[contains(@href, \"/catalog/decors/edge\")]");

    /*Каталог*/
    public KedrPage openCatalog() {
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Фабрика Кедр*/
    public KedrPage openKedrFabric() {
        kedr.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Фасады из пластика*/
    public KedrPage openPlasticFacade() {
        plastic.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Фасады ал. профиль silver*/
    public KedrPage setAluminiumSilver() {
        aluminiumSilver.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Фасады ал. профиль slim*/
    public KedrPage setAluminiumSlim() {
        aluminiumSlim.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Фасады ал. профиль цветной*/
    public KedrPage setAluminiumColor() {
        aluminiumColor.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Фасады без окромления*/
    public KedrPage setFacadeWithOutEdge() {
        facadeWithOutEdge.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Фасады с кромкой ПВХ*/
    public KedrPage setFacadeWithEdge() {
        facadeWithEdge.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
    public KedrPage setRandomDecor() {
        SelenideElement element = RandomUtils
                .getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
        return this;
    }
    /*Продолжить*/
    public void continue1Click() {
        continue1.shouldBe(Condition.enabled).click();
    }
    /*Высота*/
    public void setHeight() {
        heightArea.shouldBe(Condition.enabled).sendKeys(BASE_HEIGHT);
    }
    /*Ширина*/
    public void setWidth() {
        widthArea.shouldBe(Condition.enabled).sendKeys(BASE_WIDTH);
    }
    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор кромки*/
    public void setRandomEdge() {
        SelenideElement element1 = RandomUtils
                .getRandomElementFromList(edgeCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element1.click();
    }
    /*Рассчитать стоимость заказа*/
    public void calculateClick() {
        calculate.scrollTo();
        calculate.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        addToBasketBtn.scrollTo();
    }
    /*Добавить в корзину*/
    public void addToBasketClick() {
        addToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Перейти в корзину*/
    public void goToBasketClick() {
        goToBasket.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Перейти к оформлению*/
    public void goToCheckOutClick() {
        checkOutBtn.scrollTo();
        goToCheckOut.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
    }
    /*Выбрать оплату по QR*/
    public void qrCodeClick() {
        qrCode.click();
        qrCodeRadio.should(Condition.selected);
    }

    /*Подтвердить город доставки*/
    public void deliveryCityClick() {
        deliveryCity.click();
        deliveryCityCheckbox.should(Condition.selected);
    }

    /*Кнопка Оплатить - активна*/
    public void checkedPaymentBtn() {
        paymentBtn.should(Condition.enabled);
    }
}
