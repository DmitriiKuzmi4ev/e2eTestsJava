package ui.personalArea;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import utils.RandomUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FdmPersonalAreaPage {
    /**
     * Блок с константами для сценариев на главной странице (надо вынести в отдельный класс Constants)
     */

    private static final String VALID_NUM = "9950378814";
    private static final String VALID_CODE = "1111";


    /**
     * Блок с локаторами для сценариев проверки личного кабинета
     */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enter = $x("//body[(@class=\"body-page\")]//ancestor::a[(@data-target=\"#auth-modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement orders = $x("//body[(@class=\"body-page\")]//ancestor::a[(@href=\"/orders\")]");
    private final SelenideElement personalArea = $x("//body[(@class=\"body-page personal-area\")]//ancestor::h1");
    private final SelenideElement shoppingCart = $x("//a[@href=\"/main/basket/\"]");
    private final SelenideElement paidOrders = $x("//a[@href=\"/orders/paid\"]");
    private final SelenideElement decorSamples = $x("//a[@href=\"/shop/sample-orders\"]");

    private final ElementsCollection orderCart = $$x("//a[contains(@class, \"add-order-basket-js\")]");
    private final SelenideElement orderTableInCart = $x("//table[(@class=\"table table-outline table-vcenter card-table\")]");

    /**
     * Блок с методами позитивных и негативных сценариев проверки личного кабинета
     */


    @Step("Подтверждаю город")
    public FdmPersonalAreaPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Кликаю на кнопку Вход на главной странице")
    public FdmPersonalAreaPage clickOnEnter() {
        enter.shouldBe(Condition.exist, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Проверяю, что отобразилось модальное окно авторизации")
    public FdmPersonalAreaPage checkedAuthModal() {
        authModal.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }


    @Step("Ввожу валидный номер телефона")
    public FdmPersonalAreaPage insertValidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }


    @Step("Кликаю по кнопке Войти")
    public FdmPersonalAreaPage clickOnEntryBtn() {
        entryBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Ввожу код подтверждения")
    public FdmPersonalAreaPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }

    @Step("Кликаю по кнопке Войти (после ввода кода авторизации)")
    public FdmPersonalAreaPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.editable).click();
        return this;
    }

    @Step("Кликаю по кнопке - Заказы - и проверяю вход в личный кабинет")
    public FdmPersonalAreaPage clickOnOrders() {
        orders.shouldBe(Condition.exist, Duration.ofSeconds(30)).click();
        personalArea.shouldHave(Condition.text("Личный кабинет"));
        return this;
    }

    @Step("Перехожу в раздел - Корзина")
    public FdmPersonalAreaPage clickOnShoppingCart() {
        shoppingCart.shouldBe(Condition.exist, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Перехожу в раздел - Оплаченные заказы")
    public FdmPersonalAreaPage clickOnPaidOrders() {
        paidOrders.shouldBe(Condition.exist, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Перехожу в раздел - Образцы декоров")
    public FdmPersonalAreaPage clickOnDecorSamples() {
        decorSamples.shouldBe(Condition.exist, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Кликаю - Добавить в корзину - по рандомному бланку заказа")
    public FdmPersonalAreaPage getRandomOrderToCart() {
        SelenideElement element = RandomUtils
                .getRandomElementFromList(orderCart.shouldBe(CollectionCondition.sizeNotEqual(0)));
        element.click();
        return this;
    }

    @Step("Проверяю, что бланк заказа добавился в Корзину")
    public FdmPersonalAreaPage checkOrderOnCart() {
        orderTableInCart.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }

}
