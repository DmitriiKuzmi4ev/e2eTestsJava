package ui.test.factories.demfa;


import core.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.catalogFactories.DemfaCompany.DemfaPage;
import ui.loginPage.FdmLoginPage;

@Tag("Smoke")
@Feature("Оформление заказа")
public class DemfaEmalTest extends BaseTest {
    private DemfaPage demfaPage;
    @BeforeEach
    public void setUp(){
        demfaPage = new DemfaPage(); //инициализация страницы общей с Demfa

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
    @DisplayName("Тест - DEMFA - заказ Фасады эмаль полуматовая")
    public void demfaSemiMateEmalTest() {
        demfaPage.openCatalog()
                .openDemfaFabric()
                .openEmalFacade()
                .setSemiMate()
                .setRandomDecor()
                .continue1Click()
                .setRandomMilling()
                .continue2Click();

        demfaPage.setHeight();
        demfaPage.setWidth();
        demfaPage.calculateClick();
        demfaPage.addToBasketClick();
        demfaPage.goToBasketClick();
        demfaPage.goToCheckOutClick();
        demfaPage.qrCodeClick();
        demfaPage.deliveryCityClick();
        demfaPage.checkedPaymentBtn();
    }
    @Test
    @DisplayName("Тест - DEMFA - заказ Фасады эмаль матовая")
    public void demfaMateEmalTest() {
        demfaPage.openCatalog()
                .openDemfaFabric()
                .openEmalFacade()
                .setMate()
                .setRandomDecor()
                .continue1Click()
                .setRandomMilling()
                .continue2Click();

        demfaPage.setHeight();
        demfaPage.setWidth();
        demfaPage.calculateClick();
        demfaPage.addToBasketClick();
        demfaPage.goToBasketClick();
        demfaPage.goToCheckOutClick();
        demfaPage.qrCodeClick();
        demfaPage.deliveryCityClick();
        demfaPage.checkedPaymentBtn();
    }
    @Test
    @DisplayName("Тест - DEMFA - заказ Фасады эмаль глянцевый лак")
    public void demfaGlossEmalTest() {
        demfaPage.openCatalog()
                .openDemfaFabric()
                .openEmalFacade()
                .setGloss()
                .setRandomDecor()
                .continue1Click()
                .setRandomMilling()
                .continue2Click();

        demfaPage.setHeight();
        demfaPage.setWidth();
        demfaPage.calculateClick();
        demfaPage.addToBasketClick();
        demfaPage.goToBasketClick();
        demfaPage.goToCheckOutClick();
        demfaPage.qrCodeClick();
        demfaPage.deliveryCityClick();
        demfaPage.checkedPaymentBtn();
    }




}
