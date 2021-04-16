package test;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import page.UrunPage;

public class UrunTest extends TestBase {
    public  String price;

    public void addToBasket() throws InterruptedException {
        UrunPage urun=new UrunPage(driver,wait);
        Thread.sleep(3000);
        price=urun.productPrice().getText();
        logger.info("ürün sayfasındaki fiyat: "+price);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        urun.btnBasket().click();
    }
}
