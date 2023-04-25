package ui.test.fdmPesronalAreaTest;

import core.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.personalArea.FdmPersonalAreaPage;

@Tag("Smoke")
@Feature("Блок личного кабинета пользователя")
public class FdmPersonalAreaTest extends BaseTest {

    private FdmPersonalAreaPage fdmPersonalAreaPage;
    @BeforeEach
    public void setUp(){
        fdmPersonalAreaPage = new FdmPersonalAreaPage(); //инициализация главной страницы (лк)
        fdmPersonalAreaPage.clickOnApplyCity();
    }

    @Test
    @DisplayName("Тест - Личный кабинет -  переход по кнопке Заказы")
    public void personalAreaOrdersTest() {
        fdmPersonalAreaPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnOrders();
    }

    @Test
    @DisplayName("Тест - Личный кабинет -  переход по кнопке Корзина в л/к")
    public void personalAreaShoppingCartTest() {
        fdmPersonalAreaPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnOrders()
                .clickOnShoppingCart();
    }

    @Test
    @DisplayName("Тест - Личный кабинет -  переход по кнопке Оплаченные заказы в л/к")
    public void personalAreaPaidOrdersTest() {
        fdmPersonalAreaPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnOrders()
                .clickOnPaidOrders();
    }

    @Test
    @DisplayName("Тест - Личный кабинет -  переход по кнопке Образцы декоров в л/к")
    public void personalAreaDecorSamplesTest() {
        fdmPersonalAreaPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnOrders()
                .clickOnDecorSamples();
    }

}
