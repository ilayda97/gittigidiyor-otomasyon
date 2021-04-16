package page;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  extends PageBase {

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement txtEmail(){
        return driver.findElement(By.id("L-UserNameField"));
    }
    public WebElement txtSifre(){
        return driver.findElement(By.id("L-PasswordField"));
    }
    public WebElement btnGiris(){
        return driver.findElement(By.id("gg-login-enter"));
    }
}
