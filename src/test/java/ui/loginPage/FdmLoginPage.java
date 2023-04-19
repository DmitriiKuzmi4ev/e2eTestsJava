package ui.loginPage;

import com.codeborne.selenide.Condition;
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
    private final SelenideElement enter = $x("//header[(@class=\"header\")]//ancestor::a[(@data-link=\"/personal/login_modal\")]");
    private final SelenideElement authModal = $x("//div[(@id=\"auth-modal\")]//ancestor::div[(@class=\"modal-body form-container\")]");
    private final SelenideElement phoneInput = $x("//input[(@id=\"phoneInput\")]");
    private final SelenideElement entryBtn = $x("//div[(@class=\"col center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement codeInput = $x("//input[(@id=\"codeInput\")]");
    private final SelenideElement entryBtnPrimary = $x("//div[(@class=\"center\")]//ancestor::button[(@type=\"submit\")]");
    private final SelenideElement logOutBtn = $x("//header//ancestor::a[(@href=\"/personal/logout\")]");
    private final SelenideElement phoneError = $x("//div[(@class=\"form-group\")]//ancestor::div[(@id=\"invalidFeedback\")]");
    private final SelenideElement logOut = $x("//header//ancestor::a[(@class=\"header__user-links\")]");


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


//    /*Отчество*/
//    public FdmMainPage insertPatronymic() {
//        patronymic.shouldBe(Condition.editable).setValue(VALID_PATRONYMIC);
//        return this;
//    }
//
//    /*Номер телефона*/
//    public FdmMainPage insertNumber() {
//        userphone.shouldBe(Condition.editable).setValue(VALID_NUM);
//        return this;
//    }
//
//    /*Почта*/
//    public FdmMainPage insertEmail() {
//        email.shouldBe(Condition.editable).setValue(VALID_EMAIL);
//        return this;
//    }
//
//    /*Промокод*/
//    public FdmMainPage checkedPromocodeField() {
//        promocode.shouldBe(Condition.editable);
//        return this;
//    }
//
//    /*Условия пользовательского соглашения*/
//    public FdmMainPage clickOnAgreeTerms() {
//        agreeTerms.shouldBe(Condition.enabled).click();
//        return this;
//    }
//
//    /*Проверка чекбокса Условия пользовательского соглашения*/
//    public FdmMainPage checkedAgreeTermsCheckbox() {
//        agreeTermsCheckbox.shouldBe(Condition.selected);
//        return this;
//    }
//
//    /*Условия политики конфеденциальности и обработки персональных данных*/
//    public FdmMainPage clickOnAgreeTermsPolitics() {
//        agreeTermsPolitics.scrollTo();
//        agreeTermsPolitics.shouldBe(Condition.enabled).click();
//        return this;
//    }
//
//    /*Проверка чекбокса Условия политики конфедециальных данных*/
//    public FdmMainPage checkedAgreeTermsPoliticsCheckbox() {
//        agreeTermsPoliticsCheckbox.shouldBe(Condition.selected);
//        return this;
//    }
//
//    /*Кнопка регистрации*/
//    public FdmMainPage checkedRegistrationBtn() {
//        registrarionBtn.shouldBe(Condition.enabled);
//        return this;
//    }
//
//    /*Проверка ссылки в элементе - Условия пользовательского соглашения*/
//    public FdmMainPage checkedLinkOnAgreeTerms() {
//        agreeTermsHref.scrollTo();
//        agreeTermsHref.shouldHave(Condition.href("/docs/agreement.pdf?v3"));
//        return this;
//    }
//
//    /*Проверка ссылки в элементе - Условия политики конфеденциальности и перс. данных*/
//    public FdmMainPage checkedLinkOnAgreeTermsPolitics() {
//        agreeTermsPoliticsHref.shouldHave(Condition.href("/docs/privacy.pdf?v3"));
//        return this;
//    }
//
//    /*Клик по кнопке Зарегестрироваться с пропущенными обязательными полями*/
//    public FdmMainPage clickOnRegistrationBtn() {
//        registrarionBtn.scrollTo();
//        registrarionBtn.shouldBe(Condition.enabled).click();
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Фамилия*/
//    public FdmMainPage checkedLastNameError() {
//        Selenide.refresh();
//        errorLastName.shouldHave(Condition.text("Заполните поле Фамилия"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Имя*/
//    public FdmMainPage checkedNameError() {
//        errorName.shouldHave(Condition.text("Заполните поле Имя"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Отчетсво*/
//    public FdmMainPage checkedPatronymicError() {
//        errorPatronymic.shouldHave(Condition.text("Заполните поле Отчество"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Номер телефона*/
//    public FdmMainPage checkedNumberError() {
//        errorNumber.shouldHave(Condition.text("Телефон введен некорректно"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Email*/
//    public FdmMainPage checkedEmailError() {
//        errorEmail.shouldHave(Condition.text("Заполните поле Email"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Условия пользовательского соглашения*/
//    public FdmMainPage checkedAgreeTermsError() {
//        agreeTerms.scrollTo();
//        errorAgreeTerms.shouldHave(Condition
//                .text("Для продолжения Вам необходимо согласиться с условиями пользовательского соглашения"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Условия политики конфеденциальности*/
//    public FdmMainPage checkedAgreeTermsPoliticsError() {
//        errorAgreeTermsPolitics.shouldHave(Condition
//                .text("Для продолжения Вам необходимо согласиться с условиями политики конфиденциальности"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки, что номер телефона уже занят*/
//    public FdmMainPage checkedRegisteredNumberError() {
//        errorRegisteredNumber.shouldHave(Condition.text("Указанный телефон уже занят"));
//        return this;
//    }
//
//    /*Уже зарегестрированная почта*/
//    public FdmMainPage insertRegisteredEmail() {
//        email.shouldBe(Condition.editable).setValue(VALID_REGISTERED_EMAIL);
//        return this;
//    }
//
//    /*Проверка вывода ошибки, что данная почта уже занята*/
//    public FdmMainPage checkedRegisteredEmailError() {
//        errorRegisteredEmail.shouldHave(Condition.text("Указанный email уже занят"));
//        return this;
//    }
//
//    /*Фамилия*/
//    public FdmMainPage insertInvalidLastName() {
//        lastname.shouldBe(Condition.editable).setValue(INVALID_LAST_NAME);
//        return this;
//    }
//
//    /*Имя*/
//    public FdmMainPage insertInvalidName() {
//        name.shouldBe(Condition.editable, Duration.ofSeconds(30)).setValue(INVALID_NAME);
//        return this;
//    }
//
//    /*Отчество*/
//    public FdmMainPage insertInvalidPatronymic() {
//        patronymic.shouldBe(Condition.editable).setValue(INVALID_PATRONYMIC);
//        return this;
//    }
//
//    /*Почта*/
//    public FdmMainPage insertInvalidEmail() {
//        email.shouldBe(Condition.editable).setValue(INVALID_EMAIL);
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Фамилия*/
//    public FdmMainPage checkedInvalidLastNameError() {
//        Selenide.refresh();
//        errorInvalidLastName.shouldHave(Condition.text("Использованы недопустимые символы"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Имя*/
//    public FdmMainPage checkedInvalidNameError() {
//        Selenide.refresh();
//        errorInvalidName.shouldHave(Condition.text("Использованы недопустимые символы"));
//        return this;
//    }
//
//    /*Проверка вывода ошибки Поле Отчество*/
//    public FdmMainPage checkedInvalidPatronymicError() {
//        Selenide.refresh();
//        errorInvalidPatronymic.shouldHave(Condition.text("Использованы недопустимые символы"));
//        return this;
//    }


    /**
     * Разработать функционал рандомной генераций данных для регистрационных действий
     * */


//    /*Ввод адреса почты без символа @*/
//    public FdmRegistrationPage insertInvalidEmail() {
//        email.shouldBe(Condition.editable).setValue(INVALID_EMAIL);
//        return this;
//    }
//    /*Проверка вывода ошибки, что почта введена без символа @*/
//    public FdmRegistrationPage checkedInvalidEmailError() {
//        errorRegisteredEmail.shouldHave(Condition.text("Указанный email уже занят"));
//        return this;
//    }


//    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор*/
//    public FdmRegistrationPage setRandomDecor() {
//        SelenideElement element = RandomUtils
//                .getRandomElementFromList(decorCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
//        element.click();
//        return this;
//    }
//
//    /*Срабатывает утильный рандомайзер из класса RandomUtils - чтобы кликнуть на рандомный декор кромки*/
//    public void setRandomEdge() {
//        SelenideElement element1 = RandomUtils
//                .getRandomElementFromList(edgeCollection.shouldBe(CollectionCondition.sizeNotEqual(0)));
//        element1.click();
//    }
}
