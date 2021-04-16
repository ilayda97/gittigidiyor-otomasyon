package test;

import base.TestBase;
import page.HomePage;
import page.LoginPage;


public class LoginTest extends TestBase {
    private String userEmail = "ilayda.cls97@gmail.com";
    private String userPassword = "ilayda1997";

    public void testGiris(HomePage home) throws Exception {

        LoginPage login = new LoginPage(driver,wait);
        login.txtEmail().sendKeys(userEmail);
        login.txtSifre().sendKeys(userPassword);
        login.btnGiris().click();
        Thread.sleep(3000);
    }
}
