package ui.LoginAndNavigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmLoginPage {

    private static final String AUTH_CODE = "1111";
    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement catalog = $x("//a[(@class=\"header__link nav__link nav__link--arrow \")]");
    private final SelenideElement enterBase = $x("//a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement inputNumber = $x("//*[@id=\"phoneInput\"]");
    private final SelenideElement entering = $x("//*[@id=\"loginForm\"]/div[2]/button");
    private final SelenideElement codeInput = $x("//*[@id=\"codeInput\"]");
    private final SelenideElement mainEnter = $x("//*[@id=\"auth-modal\"]/div/div/div/form[1]/div[2]/button");

    private final SelenideElement orders = $x("//a[(@href=\"/orders\")]");
    private final SelenideElement basket = $x("//ul[(@class=\"personal-block-nav\")]//ancestor::a[(@href=\"/main/basket/\")]");
    private final SelenideElement scrollToClear = $x("//a[(@data-href=\"/main/basket/1075/clear\")]");
    private final SelenideElement backToMain = $x("//a[(@href=\"/\")]");


    /*Город выбран верно*/
    public FdmLoginPage applyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Каталог*/
    public FdmLoginPage catalogClick() {
        Selenide.refresh();
        catalog.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        Selenide.back();
        return this;
    }
    /*Кнопка - Вход (на главной)*/
    public FdmLoginPage clickEnter() {
        enterBase.shouldBe(Condition.enabled, Duration.ofSeconds(30)).hover().click();
        return this;
    }

    /*Ввод номер телефона (зарегестрированного)*/
    public FdmLoginPage insertNumber() {
        inputNumber.shouldBe(Condition.enabled).setValue("9950378814");
        return this;
    }

    /*Кнопка - Войти*/
    public FdmLoginPage clickEntering() {
        entering.shouldBe(Condition.enabled).hover().click();
        return this;
    }

    /*Ввод 4х значного кода*/
    public FdmLoginPage insertCode() {
        codeInput.shouldBe(Condition.enabled).sendKeys(AUTH_CODE);
        return this;
    }

    /*Кнопка - Войти*/
    public FdmLoginPage clickMainEnter() {
        mainEnter.shouldBe(Condition.enabled).hover().click();
        return this;
    }

    /*Кнопка - Заказы*/
    public FdmLoginPage clickOnOrders() {
        orders.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Кнопка - Корзина*/
    public FdmLoginPage clickOnBasket() {
        basket.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Скролл к очистке*/
    public void scrollToClearDo() {
        if (scrollToClear.isDisplayed()) {
            System.out.println("Необходимо очистить корзину");
            scrollToClear.scrollTo();
            scrollToClear.shouldBe(Condition.enabled).click();
        } else {
            System.out.println("Корзина пуста.");
            backToMain.shouldBe(Condition.enabled).click();
        }

    }
}









