package ui.test.standart;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.CatalogFactories.StandartCompany.StandartPage;
import ui.mainPage.FdmLoginPage;

public class StandartFacadePvhTest extends BaseTest {
    private StandartPage standartPage;
    @BeforeEach
    public void setUp(){
        standartPage = new StandartPage(); //инициализация страницы общей с Kedr

        FdmLoginPage fdmLoginPage = new FdmLoginPage();
        fdmLoginPage.applyCity();
        fdmLoginPage.clickEnter();
        fdmLoginPage.insertNumber();
        fdmLoginPage.clickEntering();
        fdmLoginPage.insertCode();
        fdmLoginPage.clickMainEnter();
        fdmLoginPage.clickOnOrders();
        fdmLoginPage.clickOnBasket();
        fdmLoginPage.scrollToClearDo();
    }

    @Test
    @DisplayName("Standart - заказ Фасады ПВХ")
    public void standartPvhTest() {
        standartPage.openCatalog()
                .openStandartFabric()
                .openFacadePvh()
                .setStraightFacade() //выбор Фасады прямые
                .setRandomDecor()
                .continue1Click();

        standartPage.setRandomEdge();
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
