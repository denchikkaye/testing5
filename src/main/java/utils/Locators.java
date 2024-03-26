package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//div[@class='flex items-center justify-center'][contains(text(),'Хостинг')])[1]");
        By BUTTON2 = By.xpath("(//div[@class='flex items-center justify-center'][contains(text(),'VDS и VPS')])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//div[@itemprop='name'][contains(text(),'VDS и VPS')])[1]");
    }

}
