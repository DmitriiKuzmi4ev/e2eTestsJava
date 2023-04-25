package ui.loginPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmLoginPage {
    /**
     * Блок с константами для сценариев на главной странице (надо вынести в отдельный класс Constants)
     */

    private static final String VALID_NUM = "9950378814";
    private static final String VALID_CODE = "1111";


    private static final String INVALID_NUM = "3454685722";
    private static final String INVALID_CODE = "2345235";

    /**
     * Блок с локаторами для сценариев авторизаци, навигации, формы обратной связи
     */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enter = $x("//body[(@class=\"body-page\")]//ancestor::a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement logOutBtn = $x("//header//ancestor::a[(@href=\"/personal/logout\")]");
    private final SelenideElement phoneError = $x("//div[(@class=\"form-group\")]//ancestor::div[(@id=\"invalidFeedback\")]");
    private final SelenideElement logOut = $x("//header//ancestor::a[(@class=\"header__user-links\")]");
    private final SelenideElement orders = $x("//body[(@class=\"body-page\")]//ancestor::a[(@href=\"/orders\")]");
    private final SelenideElement shoppingCart = $x("//a[@href=\"/main/basket/\"]");
    private final SelenideElement primeElement = $x("//a[(@href=\"/kontakty\")]");
    private final SelenideElement removeFromShoppingCart = $x("//a[(@class=\"btn btn-lg btn-clear w-100 clear-basket-js cart-clear\")]");
    private final SelenideElement homePage = $x("//a[(@class=\"header__logo g-logo\")]");

    /**
     * Блок с методами позитивных и негативных сценариев авторизации пользователя,
     * навигации и формы обратной связи
     */


    @Step("Подтверждаю город")
    public FdmLoginPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Кликаю на кнопку Вход на главной странице")
    public FdmLoginPage clickOnEnter() {
        Selenide.refresh();
        enter.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Проверяю, что отобразилось модальное окно авторизации")
    public FdmLoginPage checkedAuthModal() {
        authModal.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }


    @Step("Ввожу валидный номер телефона")
    public FdmLoginPage insertValidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }


    @Step("Кликаю по кнопке Войти")
    public FdmLoginPage clickOnEntryBtn() {
        entryBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Ввожу код подтверждения")
    public FdmLoginPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }


    @Step("Кликаю по кнопке Войти (после ввода кода авторизации)")
    public FdmLoginPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.editable).click();
        return this;
    }


    @Step("Проверяю, что авторизация прошла успешно - отображается кнопка Выход")
    public FdmLoginPage checkedLogOutBtn() {
        logOutBtn.shouldHave(Condition.exactText("Выход"));
        return this;
    }


    @Step("Ввожу не валидный номер телефона")
    public FdmLoginPage insertInvalidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(INVALID_NUM);
        return this;
    }


    @Step("Проверяю, что отобразилось сообщение - Неверный формат номера телефона")
    public FdmLoginPage checkedInvalidPhoneError() {
        phoneError.shouldHave(Condition.exactText("Неверный формат номера телефона"));
        return this;
    }


    @Step("Ввожу не верный код авторизации")
    public FdmLoginPage insertInvalidCode() {
        codeInput.shouldBe(Condition.editable).setValue(INVALID_CODE);
        return this;
    }


    @Step("Кликаю по кнопке - Выход")
    public FdmLoginPage clickOnLogOutBtn() {
        logOutBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }


    @Step("Проверяю, что осуществился выход из системы")
    public FdmLoginPage checkedLogOut() {
        logOut.shouldHave(Condition.exactText("Вход"));
        return this;
    }

    @Step("Проверяю, что кнопка Заказы активна и кликаю по ней")
    public FdmLoginPage clickOnOrders() {
        orders.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Проверяю, что кнопка Корзина активна и кликаю по ней")
    public FdmLoginPage goToShoppingCart() {
        shoppingCart.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Проверяю, если корзина не пустая - то кликаю по кнопке Очистить корзину")
    public FdmLoginPage removeFromCart() {
        primeElement.scrollTo();
        if (removeFromShoppingCart.isDisplayed()) {
            removeFromShoppingCart.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
            homePage.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        } else {
            homePage.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        }
        return this;
    }

}
