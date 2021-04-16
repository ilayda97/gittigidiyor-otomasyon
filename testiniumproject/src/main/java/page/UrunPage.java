package page;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrunPage extends PageBase {
    public UrunPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement iconBasket(){
        return driver.findElement(By.xpath("//a[@class='dIB']"));
    }
    public WebElement productPrice(){
        return driver.findElement(By.id("sp-price-discountPrice"));
    }
    public WebElement btnBasket(){
        return driver.findElement(By.id("add-to-basket"));
    }
}
