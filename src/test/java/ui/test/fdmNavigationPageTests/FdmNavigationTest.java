package ui.test.fdmNavigationPageTests;
import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.navigationPage.FdmNavigationPage;

@Tag("Smoke")
public class FdmNavigationTest extends BaseTest {
    private FdmNavigationPage fdmNavigationPage;
    @BeforeEach
    public void setUp(){
        fdmNavigationPage = new FdmNavigationPage(); //инициализация главной страницы
        fdmNavigationPage.clickOnApplyCity();
    }

    @Test
    @DisplayName("Тест - Навигация -  переход по кнопке - Каталог")
    public void catalogBtnTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnCatalogBtn();
    }
    @Test
    @DisplayName("Тест - Навигация -  переход по кнопке - Доставка")
    public void deliveryBtnTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnDeliveryBtn();
    }
    @Test
    @DisplayName("Тест - Навигация -  переход по кнопке - Оплата")
    public void payBtnTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnPayBtn();
    }
    @Test
    @DisplayName("Тест - Навигация -  переход по кнопке - Возврат")
    public void returnBtnTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnReturnBtn();
    }
}
