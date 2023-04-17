package ui.feedbackFormPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ui.navigationPage.FdmNavigationPage;

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
     * Блок с локаторами для сценариев навигации
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

    /*Подтверждение города*/
    public FdmFeedbackFormPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }
    /*Кнопка Вход*/
    public FdmFeedbackFormPage clickOnEnter() {
        enter.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Проверка - модальное окно входа появилось*/
    public FdmFeedbackFormPage checkedAuthModal() {
        authModal.shouldBe(Condition.visible, Duration.ofSeconds(30));
        return this;
    }

    /*Ввод номера валидного номер телефона*/
    public FdmFeedbackFormPage insertValidPhone() {
        phoneInput.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }

    /*Кнопка ВОЙТИ*/
    public FdmFeedbackFormPage clickOnEntryBtn() {
        entryBtn.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Ввод валидного когда авторизации*/
    public FdmFeedbackFormPage insertValidCode() {
        codeInput.shouldBe(Condition.editable).setValue(VALID_CODE);
        return this;
    }

    /*Кнопка ВОЙТИ основная*/
    public FdmFeedbackFormPage clickOnEntryBtnPrimary() {
        entryBtnPrimary.shouldBe(Condition.enabled).click();
        return this;
    }
    /*Форма обратной связи - заполнение полей*/
    public FdmFeedbackFormPage checkedFormField() {
        feedbackForm.scrollTo();
        nameField.shouldBe(Condition.editable).setValue(VALID_FEED_NAME);
        numberField.shouldBe(Condition.editable).setValue(VALID_FEED_NUMBER);
        textArea.shouldBe(Condition.editable).setValue(VALID_FEED_MESSAGE);
        return this;
    }
    /*Форма обратной связи - отправка сообщения*/
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
