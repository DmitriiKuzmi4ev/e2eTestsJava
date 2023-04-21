package ui.test.feedbackFormTest;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.feedbackFormPage.FdmFeedbackFormPage;

@Tag("Smoke")
public class FdmFeedbackFormTest extends BaseTest {
    private FdmFeedbackFormPage fdmFeedbackFormPage;
    @BeforeEach
    public void setUp(){
        fdmFeedbackFormPage = new FdmFeedbackFormPage(); //инициализация главной страницы
        fdmFeedbackFormPage.clickOnApplyCity();
    }
    @Test
    @DisplayName("Тест - Форма обратной связи - видимость на странице")
    public void feedbackFormCheckTest() {
        fdmFeedbackFormPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedForm();
    }
    @Test
    @DisplayName("Тест - Форма обратной связи - заполнение полей")
    public void feedbackFormFillTest() {
        fdmFeedbackFormPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedFormField();
    }
    @Test
    @DisplayName("Тест - Форма обратной связи - отправка сообщения")
    public void feedbackFormSubmitTest() {
        fdmFeedbackFormPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedSendMessage();
    }
}
