package ui.test.fdmMainPageTests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.mainPage.FdmMainPage;

public class FdmMainPageTest extends BaseTest {
    private FdmMainPage fdmMainPage;
    @BeforeEach
    public void setUp(){
        fdmMainPage = new FdmMainPage(); //инициализация главной страницы
        fdmMainPage.clickOnApplyCity();
    }

    @Test
    @Tag("Smoke")
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
    @Tag("Smoke")
    @DisplayName("Тест - Авторизация -  ввод невалидного номера телефона и кода авторизации")
    public void authorizationInvalidPhoneTest() {
        fdmMainPage.clickOnEnter()
                .checkedAuthModal()
                .insertInvalidPhone()
                .checkedInvalidPhoneError();
    }
    @Test
    @Tag("Smoke")
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
    @Tag("Smoke")
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
