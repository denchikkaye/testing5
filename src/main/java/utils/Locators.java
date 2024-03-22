package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//div[@class='flex items-center justify-center'][contains(text(),'Выделенные серверы')])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//div[@itemprop='name'][contains(text(),'Выделенные серверы')])[1]");
    }

}