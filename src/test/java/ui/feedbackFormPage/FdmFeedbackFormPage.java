package ui.feedbackFormPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class FdmFeedbackFormPage {
    /**
     * Блок с константами для сценариев на главной странице (надо вынести в отдельный класс Constants)
     */
    private static final String VALID_NUM = "9950378814";
    private static final String VALID_CODE = "1111";
    private static final String VALID_FEED_NAME = "Тест";
    private static final String VALID_FEED_NUMBER = "5647874590";
    private static final String VALID_FEED_MESSAGE = "Произвольный текст";

    /**
     * Блок с локаторами для сценариев формы обратной связи
     */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement enter = $x("//nav[(@class=\"header__nav nav\")]//ancestor::a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");

    private final SelenideElement feedbackForm = $x("//form[(@class=\"main-feedback-form\")]");
    private final SelenideElement nameField = $x("//input[(@name=\"name\")]");
    private final SelenideElement numberField = $x("//input[(@name=\"tel\")]");
    private final SelenideElement textArea = $x("//textarea[(@name=\"message\")]");
    private final SelenideElement agreementCheckbox = $x("//input[(@id=\"agreement-checkbox\")]");
    private final SelenideElement submitBtn = $x("//button[(@class=\"send-btn\")]");
    private final SelenideElement successSubmit = $x("//div[(@class=\"success-message\")]//ancestor::div[(@class=\"title\")]");


    /**
     * Блок с методами позитивных и негативных сценариев формы обратной связи
     */

    @Step("Подтверждаю, что город выбран верно")
    public FdmFeedbackFormPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Кликаю на кнопку Вход на главной странице")
    public FdmFeedbackFormPage clickOnEnter() {
        enter.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Проверяю, что отобразилось модальное окно авторизации")
    public FdmFeedbackFormPage checkedAuthModal() {
        authModal.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }

    @Step("Ввожу валидный номер телефона")
    public FdmFeedbackFormPage insertValidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }

    @Step("Кликаю по кнопке Войти")
    public FdmFeedbackFormPage clickOnEntryBtn() {
        entryBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    @Step("Ввожу код подтверждения")
    public FdmFeedbackFormPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }

    @Step("Кликаю по кнопке Войти (после ввода кода авторизации)")
    public FdmFeedbackFormPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step("Скролю страницу до формы обратной связи. Проверяю доступной полей и заполняю их")
    public FdmFeedbackFormPage checkedFormField() {
        feedbackForm.scrollTo();
        nameField.shouldBe(Condition.editable).setValue(VALID_FEED_NAME);
        numberField.shouldBe(Condition.editable).setValue(VALID_FEED_NUMBER);
        textArea.shouldBe(Condition.editable).setValue(VALID_FEED_MESSAGE);
        return this;
    }

    @Step("Кликаю на кнопку - Отправить сообщение и проверяю, что выводится - Сообщение отправлено!")
    public FdmFeedbackFormPage checkedSendMessage() {
        feedbackForm.scrollTo();
        nameField.shouldBe(Condition.editable).setValue(VALID_FEED_NAME);
        numberField.shouldBe(Condition.editable).setValue(VALID_FEED_NUMBER);
        textArea.shouldBe(Condition.editable).setValue(VALID_FEED_MESSAGE);
        agreementCheckbox.isSelected();
        submitBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        successSubmit.shouldHave(Condition.text("Сообщение отправлено!"));
        return this;
    }





}
