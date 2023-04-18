package ui.navigationPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmNavigationPage {
    /**
     * Блок с константами для сценариев на главной странице (надо вынести в отдельный класс Constants)
     */
    private static final String VALID_NUM = "9950378814";
    private static final String VALID_CODE = "1111";


    /**
     * Блок с локаторами для сценариев навигации
     */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enter = $x("//nav[(@class=\"header__nav nav\")]//ancestor::a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");

    private final SelenideElement catalogBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement deliveryBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement payBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");
    private final SelenideElement returnBtn = $x("//header//ancestor::a[(@href=\"/main/factory/select-factory/\")]");

    private final SelenideElement promo1 = $x("//a[(@class=\"item promo-1\")]");
    private final SelenideElement promo2 = $x("//a[(@class=\"item promo-2\")]");
    private final SelenideElement promo3 = $x("//a[(@href=\"/furnitura-na-3000r-v-podarok\")]");

    private final SelenideElement swiper = $x("//div[(@class=\"swiper-navigation swiper-button-next\")]");

    private final SelenideElement sliderOnMainPage = $x("//div[(@class=\"main-producers\")]");
    private final SelenideElement sliderButton = $x("//div[(@class=\"swiper-navigation swiper-button-next producers-next\")]");

    private final SelenideElement itemPrices = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item prices\")]");
    private final SelenideElement itemPayment = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item payment\")]");
    private final SelenideElement itemComplaints = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item complaints\")]");
    private final SelenideElement itemProduction = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item production\")]");
    private final SelenideElement itemControl = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item control\")]");
    private final SelenideElement itemSamples = $x("//div[(@class=\"main-benefits\")]//ancestor::div[(@class=\"item samples\")]");

    private final SelenideElement personalPoliticDataHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/docs/personal.pdf?v3\")]");
    private final SelenideElement privacyPoliticHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/docs/privacy.pdf?v3\")]");
    private final SelenideElement legalEntityHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/docs/offer_legal_entity.pdf\")]");
    private final SelenideElement offerHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/offer.pdf\")]");
    private final SelenideElement paymentsHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/kontakty\")]");
    private final SelenideElement aboutHref = $x("//div[(@class=\"footer__politic\")]//ancestor::a[(@href=\"/o-nas\")]");

    /**
     * Блок с методами позитивных и негативных сценариев навигации
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
        entryBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Ввод валидного когда авторизации*/
    public FdmNavigationPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }

    /*Кнопка ВОЙТИ основная*/
    public FdmNavigationPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.enabled).click();
        return this;
    }

    /*Клик по кнопке Каталог*/
    public FdmNavigationPage clickOnCatalogBtn() {
        catalogBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Клик по кнопке Доставка*/
    public FdmNavigationPage clickOnDeliveryBtn() {
        deliveryBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Клик по кнопке Оплата*/
    public FdmNavigationPage clickOnPayBtn() {
        payBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Клик по кнопке Возврат*/
    public FdmNavigationPage clickOnReturnBtn() {
        returnBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по баннеру 1*/
    public FdmNavigationPage clickOnPromo1() {
        promo1.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по баннеру 2*/
    public FdmNavigationPage clickOnPromo2() {
        promo2.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Клик по баннеру 3*/
    public FdmNavigationPage clickOnPromo3() {
        promo3.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Переход к свайперу*/
    public FdmNavigationPage clickSwipeNext() {
        swiper.scrollTo();
        swiper.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        return this;
    }
    /*Проверка слайдера на главной*/
    public FdmNavigationPage checkedSliderOnMainPage() {
        sliderOnMainPage.scrollTo();
        sliderButton.shouldBe(Condition.enabled);
        return this;
    }
    /*Проверка отображения элементов после слайдера*/
    public FdmNavigationPage checkedElements() {
        itemPrices.scrollTo();
        itemPrices.shouldBe(Condition.visible);
        itemPayment.shouldBe(Condition.visible);
        itemComplaints.shouldBe(Condition.visible);
        itemProduction.shouldBe(Condition.visible);
        itemControl.shouldBe(Condition.visible);
        itemSamples.shouldBe(Condition.visible);
        return this;
    }
    /*Переход ссылкам в футере*/
    public FdmNavigationPage checkFooterLinks() {
        personalPoliticDataHref.should();
        personalPoliticDataHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        privacyPoliticHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        legalEntityHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        offerHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        paymentsHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        aboutHref.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        return this;
    }









}
