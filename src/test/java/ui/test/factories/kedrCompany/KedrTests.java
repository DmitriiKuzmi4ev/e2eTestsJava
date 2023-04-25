package ui.test.factories.kedrCompany;

import core.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.catalogFactories.KedrCompany.straightFacade.KedrPage;
import ui.loginPage.FdmLoginPage;

@Tag("Smoke")
@Feature("Оформление заказа")
public class KedrTests extends BaseTest {
    private KedrPage kedrPage;
    @BeforeEach
    public void setUp(){
        kedrPage = new KedrPage(); //инициализация страницы общей с Kedr

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
    @DisplayName("Тест - Кедр - заказ Фасады алюминиевый профиль - silver")
    public void kedrAluminiumSilverTest() {
        kedrPage.openCatalog()
                .openKedrFabric()
                .openPlasticFacade()
                .setAluminiumSilver() //выбор цвета silver
                .setRandomDecor()
                .continue1Click();

        kedrPage.setHeight();
        kedrPage.setWidth();
        kedrPage.setRandomEdge();

        kedrPage.calculateClick();
        kedrPage.addToBasketClick();
        kedrPage.goToBasketClick();
        kedrPage.goToCheckOutClick();
        kedrPage.qrCodeClick();
        kedrPage.deliveryCityClick();
        kedrPage.checkedPaymentBtn();
    }

    @Test
    @DisplayName("Тест - Кедр - заказ Фасады алюминиевый профиль - slim")
    public void kedrAluminiumSlimTest() {
        kedrPage.openCatalog()
                .openKedrFabric()
                .openPlasticFacade()
                .setAluminiumSlim() //выбор цвета slim
                .setRandomDecor()
                .continue1Click();

        kedrPage.setHeight();
        kedrPage.setWidth();
        kedrPage.setRandomEdge();
        kedrPage.calculateClick();
        kedrPage.addToBasketClick();
        kedrPage.goToBasketClick();
        kedrPage.goToCheckOutClick();
        kedrPage.qrCodeClick();
        kedrPage.deliveryCityClick();
        kedrPage.checkedPaymentBtn();
    }

    @Test
    @DisplayName("Тест - Кедр - заказ Фасады алюминиевый профиль - цветной")
    public void kedrAluminumColorTest() {
        kedrPage.openCatalog()
                .openKedrFabric()
                .openPlasticFacade()
                .setAluminiumColor() //выбор цвета цветной
                .setRandomDecor()
                .continue1Click();

        kedrPage.setHeight();
        kedrPage.setWidth();
        kedrPage.setRandomEdge();
        kedrPage.calculateClick();
        kedrPage.addToBasketClick();
        kedrPage.goToBasketClick();
        kedrPage.goToCheckOutClick();
        kedrPage.qrCodeClick();
        kedrPage.deliveryCityClick();
        kedrPage.checkedPaymentBtn();
    }

    @Test
    @DisplayName("Тест - Кедр - заказ Фасады без окромления")
    public void kedrFacadeWithOutEdgeTest() {
        kedrPage.openCatalog()
                .openKedrFabric()
                .openPlasticFacade()
                .setFacadeWithOutEdge() //выбор без окромления
                .setRandomDecor()
                .continue1Click();

        kedrPage.setHeight();
        kedrPage.setWidth();
        kedrPage.calculateClick();
        kedrPage.addToBasketClick();
        kedrPage.goToBasketClick();
        kedrPage.goToCheckOutClick();
        kedrPage.qrCodeClick();
        kedrPage.deliveryCityClick();
        kedrPage.checkedPaymentBtn();
    }

    @Test
    @DisplayName("Тест - Кедр - заказ Фасады с кромкой ПВХ")
    public void kedrFacadeWithEdgeTest() {
        kedrPage.openCatalog()
                .openKedrFabric()
                .openPlasticFacade()
                .setFacadeWithEdge() //выбор без окромления
                .setRandomDecor()
                .continue1Click();

        kedrPage.setHeight();
        kedrPage.setWidth();
        kedrPage.setRandomEdge();
        kedrPage.calculateClick();
        kedrPage.addToBasketClick();
        kedrPage.goToBasketClick();
        kedrPage.goToCheckOutClick();
        kedrPage.qrCodeClick();
        kedrPage.deliveryCityClick();
        kedrPage.checkedPaymentBtn();
    }

}
