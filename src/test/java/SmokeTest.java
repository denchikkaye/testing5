import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MainPage;

public class SmokeTest {

    private WebDriver browser;

    @Before
    public void precondition() {

        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://timeweb.com/");
    }

    @Test
    public void checkSiteSearcher() {
        MainPage mainPage = new MainPage(browser);

        String headerText = mainPage
                .clickInButtonField()
                .clickInButtonField2()
                .getHeaderText();
        String assertionError = null;
        try {
            Assert.assertEquals(headerText,"VDS и VPS");
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }

        if (assertionError != null) {
            System.out.println(assertionError);
        }
        else {
            System.out.println("Тестирование прошло успешно");
        }
    }




    @After
    public void postCondition() {
        browser.quit();

    }

}
