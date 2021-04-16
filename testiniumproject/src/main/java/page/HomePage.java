package page;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List<WebElement> productsList(){
        return driver.findElements(By.xpath("//div[@class='cell-border-css']"));
    }

    public WebElement searchInput(){
        return driver.findElement(By.cssSelector("input[name='k']"));
    }
    public WebElement iconClick(){
        return driver.findElement(By.xpath("//button[@data-cy='search-find-button']"));
    }
    public WebElement twoPage(){
        return driver.findElement(By.xpath(".//a[text()='2']"));
    }
}
