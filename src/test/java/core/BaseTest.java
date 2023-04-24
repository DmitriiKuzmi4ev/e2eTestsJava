package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    private static final String BASE_URL = "https://dev.allfdm.ru/";

    private void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Red\\chromedriver.exe");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 50000;
        Configuration.pollingInterval = 500;
        Configuration.fastSetValue = true;
        Configuration.screenshots = false;
        Selenide.clearBrowserCookies();
        Selenide.open(BASE_URL);
        Selenide.clearBrowserLocalStorage();
    }

    @BeforeEach
    public void initBrowser() {
        init();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
