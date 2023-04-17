package ui.registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;


public class FdmRegistrationPage {

    /**
     * Блок с константами для сценариев регстрации (надо вынести в отдельный класс Constants)
     * */

    private static final String VALID_LAST_NAME = "Тестировщик";
    private static final String VALID_NAME = "Тестировщик";
    private static final String VALID_PATRONYMIC = "Тестировщик";
    private static final String VALID_NUM = "9950378814";
    private static final String VALID_EMAIL = "aaaaa@gmail.com";
    private static final String VALID_REGISTERED_EMAIL = "komradekuzmi4ev@gmail.com";


    private static final String INVALID_LAST_NAME = ")$%/'lk";
    private static final String INVALID_NAME = ")$%/'lk";
    private static final String INVALID_PATRONYMIC = ")$%/'lk";
    private static final String INVALID_EMAIL = "aaaaagmail.com";

    /**
     * Блок с локаторами для сценариев регстрации
     * */

    private final SelenideElement applyCity = $x("//*[@id=\"closeSelectCityModal\"]");
    private final SelenideElement registration = $x("//div[(@class=\"g-icon-text\")]//ancestor::a[(@href=\"/personal/registration\")]");
    private final SelenideElement lastname = $x("//input[(@id=\"user_profile_lastname\")]");
    private final SelenideElement name = $x("//input[(@id=\"user_profile_name\")]");
    private final SelenideElement patronymic = $x("//input[(@id=\"user_profile_patronymic\")]");
    private final SelenideElement userphone = $x("//input[(@id=\"user_profile_phone\")]");
    private final SelenideElement email = $x("//input[(@id=\"user_profile_email\")]");
    private final SelenideElement promocode = $x("//input[contains(@id, \"user_profile_promoCode\")]");
    private final SelenideElement agreeTerms = $x("//input[(@id=\"user_profile_agreeTerms\")]");
    private final SelenideElement agreeTermsCheckbox = $x("//input[(@id=\"user_profile_agreeTerms\")]");
    private final SelenideElement agreeTermsPolitics = $x("//input[(@id=\"user_profile_agreeTermsPolitic\")]");
    private final SelenideElement agreeTermsPoliticsCheckbox = $x("//input[(@id=\"user_profile_agreeTermsPolitic\")]");
    private final SelenideElement registrarionBtn = $x("//form[(@name=\"user_profile\")]//ancestor::button[contains(@class, \"btn g-btn g-btn--orange\")]");
    private final SelenideElement agreeTermsHref = $x("//a[(@href=\"/docs/agreement.pdf?v3\")]");
    private final SelenideElement agreeTermsPoliticsHref = $x("//a[(@href=\"/docs/privacy.pdf?v3\")]");

    private final SelenideElement errorLastName = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Заполните поле Фамилия\"]");
    private final SelenideElement errorInvalidLastName = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Использованы недопустимые символы\"]");
    private final SelenideElement errorName = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Заполните поле Имя\"]");
    private final SelenideElement errorInvalidName = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Использованы недопустимые символы\"]");
    private final SelenideElement errorPatronymic = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Заполните поле Отчество\"]");
    private final SelenideElement errorInvalidPatronymic = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Использованы недопустимые символы\"]");
    private final SelenideElement errorNumber = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Телефон введен некорректно\"]");
    private final SelenideElement errorRegisteredNumber = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Указанный телефон уже занят\"]");
    private final SelenideElement errorEmail = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Заполните поле Email\"]");

    private final SelenideElement errorRegisteredEmail = $x("//div[(@class=\"error-field\")]//ancestor::span[text() = \"Указанный email уже занят\"]");
    private final SelenideElement errorAgreeTerms = $x("//span[text() = \"Для продолжения Вам необходимо согласиться с условиями пользовательского соглашения\"]");
    private final SelenideElement errorAgreeTermsPolitics = $x("//span[text() = \"Для продолжения Вам необходимо согласиться с условиями политики конфиденциальности\"]");


    /**
     * Блок с методами позитивных и негативных сценариев регистрации пользователя
     */


    /*Подтверждение города*/
    public FdmRegistrationPage clickOnApplyCity() {
        applyCity.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Кнопка Регистрация*/
    public FdmRegistrationPage openRegistration() {
        registration.shouldBe(Condition.enabled, Duration.ofSeconds(30)).click();
        return this;
    }

    /*Фамилия*/
    public FdmRegistrationPage insertLastName() {
        lastname.shouldBe(Condition.editable).setValue(VALID_LAST_NAME);
        return this;
    }

    /*Имя*/
    public FdmRegistrationPage insertName() {
        name.shouldBe(Condition.editable, Duration.ofSeconds(30)).setValue(VALID_NAME);
        return this;
    }

    /*Отчество*/
    public FdmRegistrationPage insertPatronymic() {
        patronymic.shouldBe(Condition.editable).setValue(VALID_PATRONYMIC);
        return this;
    }

    /*Номер телефона*/
    public FdmRegistrationPage insertNumber() {
        userphone.shouldBe(Condition.editable).setValue(VALID_NUM);
        return this;
    }

    /*Почта*/
    public FdmRegistrationPage insertEmail() {
        email.shouldBe(Condition.editable).setValue(VALID_EMAIL);
        return this;
    }

    /*Промокод*/
    public FdmRegistrationPage checkedPromocodeField() {
        promocode.shouldBe(Condition.editable);
        return this;
    }

    /*Условия пользовательского соглашения*/
    public FdmRegistrationPage clickOnAgreeTerms() {
        agreeTerms.shouldBe(Condition.enabled).click();
        return this;
    }

    /*Проверка чекбокса Условия пользовательского соглашения*/
    public FdmRegistrationPage checkedAgreeTermsCheckbox() {
        agreeTermsCheckbox.shouldBe(Condition.selected);
        return this;
    }

    /*Условия политики конфеденциальности и обработки персональных данных*/
    public FdmRegistrationPage clickOnAgreeTermsPolitics() {
        agreeTermsPolitics.scrollTo();
        agreeTermsPolitics.shouldBe(Condition.enabled).click();
        return this;
    }

    /*Проверка чекбокса Условия политики конфедециальных данных*/
    public FdmRegistrationPage checkedAgreeTermsPoliticsCheckbox() {
        agreeTermsPoliticsCheckbox.shouldBe(Condition.selected);
        return this;
    }

    /*Кнопка регистрации*/
    public FdmRegistrationPage checkedRegistrationBtn() {
        registrarionBtn.shouldBe(Condition.enabled);
        return this;
    }

    /*Проверка ссылки в элементе - Условия пользовательского соглашения*/
    public FdmRegistrationPage checkedLinkOnAgreeTerms() {
        agreeTermsHref.scrollTo();
        agreeTermsHref.shouldHave(Condition.href("/docs/agreement.pdf?v3"));
        return this;
    }

    /*Проверка ссылки в элементе - Условия политики конфеденциальности и перс. данных*/
    public FdmRegistrationPage checkedLinkOnAgreeTermsPolitics() {
        agreeTermsPoliticsHref.shouldHave(Condition.href("/docs/privacy.pdf?v3"));
        return this;
    }

    /*Клик по кнопке Зарегестрироваться с пропущенными обязательными полями*/
    public FdmRegistrationPage clickOnRegistrationBtn() {
        registrarionBtn.scrollTo();
        registrarionBtn.shouldBe(Condition.enabled).click();
        return this;
    }

    /*Проверка вывода ошибки Поле Фамилия*/
    public FdmRegistrationPage checkedLastNameError() {
        Selenide.refresh();
        errorLastName.shouldHave(Condition.text("Заполните поле Фамилия"));
        return this;
    }

    /*Проверка вывода ошибки Поле Имя*/
    public FdmRegistrationPage checkedNameError() {
        errorName.shouldHave(Condition.text("Заполните поле Имя"));
        return this;
    }

    /*Проверка вывода ошибки Поле Отчетсво*/
    public FdmRegistrationPage checkedPatronymicError() {
        errorPatronymic.shouldHave(Condition.text("Заполните поле Отчество"));
        return this;
    }

    /*Проверка вывода ошибки Поле Номер телефона*/
    public FdmRegistrationPage checkedNumberError() {
        errorNumber.shouldHave(Condition.text("Телефон введен некорректно"));
        return this;
    }

    /*Проверка вывода ошибки Поле Email*/
    public FdmRegistrationPage checkedEmailError() {
        errorEmail.shouldHave(Condition.text("Заполните поле Email"));
        return this;
    }

    /*Проверка вывода ошибки Поле Условия пользовательского соглашения*/
    public FdmRegistrationPage checkedAgreeTermsError() {
        agreeTerms.scrollTo();
        errorAgreeTerms.shouldHave(Condition
                .text("Для продолжения Вам необходимо согласиться с условиями пользовательского соглашения"));
        return this;
    }

    /*Проверка вывода ошибки Поле Условия политики конфеденциальности*/
    public FdmRegistrationPage checkedAgreeTermsPoliticsError() {
        errorAgreeTermsPolitics.shouldHave(Condition
                .text("Для продолжения Вам необходимо согласиться с условиями политики конфиденциальности"));
        return this;
    }

    /*Проверка вывода ошибки, что номер телефона уже занят*/
    public FdmRegistrationPage checkedRegisteredNumberError() {
        errorRegisteredNumber.shouldHave(Condition.text("Указанный телефон уже занят"));
        return this;
    }

    /*Уже зарегестрированная почта*/
    public FdmRegistrationPage insertRegisteredEmail() {
        email.shouldBe(Condition.editable).setValue(VALID_REGISTERED_EMAIL);
        return this;
    }

    /*Проверка вывода ошибки, что данная почта уже занята*/
    public FdmRegistrationPage checkedRegisteredEmailError() {
        errorRegisteredEmail.shouldHave(Condition.text("Указанный email уже занят"));
        return this;
    }

    /*Фамилия*/
    public FdmRegistrationPage insertInvalidLastName() {
        lastname.shouldBe(Condition.editable).setValue(INVALID_LAST_NAME);
        return this;
    }

    /*Имя*/
    public FdmRegistrationPage insertInvalidName() {
        name.shouldBe(Condition.editable, Duration.ofSeconds(30)).setValue(INVALID_NAME);
        return this;
    }

    /*Отчество*/
    public FdmRegistrationPage insertInvalidPatronymic() {
        patronymic.shouldBe(Condition.editable).setValue(INVALID_PATRONYMIC);
        return this;
    }

    /*Почта*/
    public FdmRegistrationPage insertInvalidEmail() {
        email.shouldBe(Condition.editable).setValue(INVALID_EMAIL);
        return this;
    }

    /*Проверка вывода ошибки Поле Фамилия*/
    public FdmRegistrationPage checkedInvalidLastNameError() {
        Selenide.refresh();
        errorInvalidLastName.shouldHave(Condition.text("Использованы недопустимые символы"));
        return this;
    }

    /*Проверка вывода ошибки Поле Имя*/
    public FdmRegistrationPage checkedInvalidNameError() {
        Selenide.refresh();
        errorInvalidName.shouldHave(Condition.text("Использованы недопустимые символы"));
        return this;
    }

    /*Проверка вывода ошибки Поле Отчество*/
    public FdmRegistrationPage checkedInvalidPatronymicError() {
        Selenide.refresh();
        errorInvalidPatronymic.shouldHave(Condition.text("Использованы недопустимые символы"));
        return this;
    }


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
