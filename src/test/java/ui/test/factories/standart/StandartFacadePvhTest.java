package ui.test.factories.standart;


import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.catalogFactories.StandartCompany.StandartPage;
import ui.loginPage.FdmLoginPage;

@Tag("Smoke")
@Feature("Оформление заказа")
public class StandartFacadePvhTest extends BaseTest {

    private StandartPage standartPage;

    @BeforeEach
    public void setUp(){
        standartPage = new StandartPage(); //инициализация страницы общей с Стандарт

        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.clickOnApplyCity();
        fdmLoginPage.clickOnEnter();
        fdmLoginPage.checkedAuthModal();
        fdmLoginPage.insertValidPhone();
        fdmLoginPage.clickOnEntryBtn();
        fdmLoginPage.insertValidCode();
        fdmLoginPage.clickOnEntryBtnPrimary();
        fdmLoginPage.clickOnOrders();
        fdmLoginPage.goToShoppingCart();
        fdmLoginPage.removeFromCart();
    }

    @Test
    @DisplayName("Тест - Стандарт - заказ Фасады ПВХ")
    public void standartPvhTest() {
        standartPage.openCatalog()
                .openStandartFabric()
                .openFacadePvh()
                .setStraightFacade() //выбор Фасады прямые
                .setRandomDecor()
                .continue1Click();

        standartPage.setRandomMilling();
        standartPage.continue2Click();
        standartPage.setHeight();
        standartPage.setWidth();

        standartPage.calculateClick();
        standartPage.addToBasketClick();
        standartPage.goToBasketClick();
        standartPage.goToCheckOutClick();
        standartPage.qrCodeClick();
        standartPage.deliveryCityClick();
        standartPage.checkedPaymentBtn();
    }
}
