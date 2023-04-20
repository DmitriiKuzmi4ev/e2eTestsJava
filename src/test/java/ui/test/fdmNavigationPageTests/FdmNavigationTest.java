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
    @Test
    @DisplayName("Тест - Навигация -  переход по баннеру 1 - выбрать производителя")
    public void promo1Test() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnPromo1();
    }
    @Test
    @DisplayName("Тест - Навигация -  переход по баннеру 2 - образцы в подарок")
    public void promo2Test() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnPromo2();
    }
    @Test
    @DisplayName("Тест - Навигация -  переход по баннеру 3 - текущая акция")
    public void promo3Test() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickOnPromo3();
    }
    @Test
    @DisplayName("Тест - Навигация - проверка слайдера на главной странице")
    public void checkedSliderInMainPage() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedSliderOnMainPage();
    }
    @Test
    @DisplayName("Тест - Навигация - проверка отображения элементов")
    public void elementsTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkedElements();
    }
    @Test
    @DisplayName("Тест - Навигация - проверка отображения и работы свайпера на главной")
    public void swiperTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .clickSwipeNext();
    }
    @Test
    @DisplayName("Тест - Навигация - проверка битых ссылок в футтере сайта")
    public void footerLinkTest() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkFooterLinks();
    }
    @Test
    @DisplayName("Тест - Навигация - проверка видимости производителей в разделе Каталог")
    public void checkCatalogList() {
        fdmNavigationPage.clickOnEnter()
                .checkedAuthModal()
                .insertValidPhone()
                .clickOnEntryBtn()
                .insertValidCode()
                .clickOnEntryBtnPrimary()
                .checkFactoryList();
    }


}
