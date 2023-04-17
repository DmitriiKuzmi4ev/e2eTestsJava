package ui.navigationPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmNavigationPage {
    /**
     * Блок с константами для сценариев на главной странице (надо вынести в отдельный класс Constants)
     * */

    private static final String VALID_LAST_NAME = "Тестировщик";
    private static final String VALID_NAME = "Тестировщик";
    private static final String VALID_PATRONYMIC = "Тестировщик";
    private static final String VALID_NUM = "9950378814";
    private static final String VALID_CODE = "1111";
    private static final String VALID_REGISTERED_EMAIL = "komradekuzmi4ev@gmail.com";


    private static final String INVALID_NUM = "3454685722";
    private static final String INVALID_CODE = "2345235";
    private static final String INVALID_PATRONYMIC = ")$%/'lk";
    private static final String INVALID_EMAIL = "aaaaagmail.com";

    /**
     * Блок с локаторами для сценариев навигации
     * */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enter = $x("//nav[(@class=\"header__nav nav\")]//ancestor::a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");

    private final SelenideElement catalogBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement catalogCheck = $x("//div[(@class=\"container catalog-header\")]");
    private final SelenideElement deliveryBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement deliveryCheck = $x("//div[(@class=\"container page-delivery-header\")]");
    private final SelenideElement payBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement payCheck = $x("//div[(@class=\"container page-pay-header\")]");
    private final SelenideElement returnBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement returnCheck = $x("//div[(@class=\"container page-refund-header\")]");

    /**
     * Блок с методами позитивных и негативных сценариев навигации
     *
     */

    /*Подтверждение города*/
    public FdmNavigationPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Кнопка Вход*/
    public FdmNavigationPage clickOnEnter() {
        enter.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Проверка - модальное окно входа появилось*/
    public FdmNavigationPage checkedAuthModal() {
        authModal.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }

    /*Ввод номера валидного номер телефона*/
    public FdmNavigationPage insertValidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }
    /*Кнопка ВОЙТИ*/
    public FdmNavigationPage clickOnEntryBtn() {
        entryBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Ввод валидного когда авторизации*/
    public FdmNavigationPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }
    /*Кнопка ВОЙТИ основная*/
    public FdmNavigationPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.editable).click();
        return this;
    }

    /*Клик по кнопке Каталог*/
    public FdmNavigationPage clickOnCatalogBtn() {
        catalogBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по кнопке Доставка*/
    public FdmNavigationPage clickOnDeliveryBtn() {
        deliveryBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по кнопке Оплата*/
    public FdmNavigationPage clickOnPayBtn() {
        payBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по кнопке Возврат*/
    public FdmNavigationPage clickOnReturnBtn() {
        returnBtn.shouldBe(Condition.editable, Duration.ofSeconds(30)).click();
        return this;
    }
}
