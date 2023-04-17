package ui.test.fdmLoginPageTests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.loginPage.FdmLoginPage;

@Tag("Smoke")
public class FdmLoginPageTest extends BaseTest {
    private FdmLoginPage fdmMainPage;
    @BeforeEach
    public void setUp(){
        fdmMainPage = new FdmLoginPage(); //инициализация главной страницы
        fdmMainPage.clickOnApplyCity();
    }

    @Test
    @DisplayName("Тест - Авторизация -  ввод валидного номера телефона и кода авторизации")
    public void authorizationPositiveTest() {
        fdmMainPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedLogOutBtn();
    }
    @Test
    @DisplayName("Тест - Авторизация -  ввод невалидного номера телефона и кода авторизации")
    public void authorizationInvalidPhoneTest() {
        fdmMainPage.clickOnEnter()
                .checkedAuthModal()
                .insertInvalidPhone()
                .checkedInvalidPhoneError();
    }
    @Test
    @DisplayName("Тест - Авторизация -  ввод неверного кода авторизации")
    public void authorizationInvalidCodeTest() {
        fdmMainPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertInvalidCode()
                .clickOnEntryBtnPrimary();
    }
    @Test
    @DisplayName("Тест - Авторизация -  выход из личного кабинета пользователя")
    public void logOutTest() {
        fdmMainPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedLogOutBtn()
                .clickOnLogOutBtn()
                .checkedLogOut();
    }

}
