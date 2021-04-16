package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public PageBase(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //Click Method
    public void click(By elementLocation) {
       driver.findElement(elementLocation).click();
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);

    }
    public void sendKeys(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

}