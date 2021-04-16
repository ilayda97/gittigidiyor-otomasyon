package base;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;

public class TestBase {
    // İndirdiğimiz Chrome_driver.exe dizini
    protected static String ChromePath = "C:\\testiniumproject\\properties\\driver\\chromedriver.exe";
    protected static ChromeDriverService service;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public final static Logger logger = Logger.getLogger(TestBase.class);


    @BeforeClass
    public static void Setup() {
        BasicConfigurator.configure(    );
        logger.info("Test başlatıldı.");
        // Chrome_driver.exe dizininden servisi oluştur ve başlat
        service = new ChromeDriverService.Builder().
                usingDriverExecutable(new File(ChromePath)).
                usingAnyFreePort().
                build();
        try {
            service.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", ChromePath);
        // Driver nesnesini service bilgilerini kullanarak koluştur
        driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        // Bütün sayfaları açarken 15ms bekle
        wait = new WebDriverWait(driver,15);
        // Penceri Büyüt
        driver.manage().window().maximize();


    }
    @AfterClass
    public static void Stop(){
        // Tarayıcıdan çıkış yapar
        driver.quit();
        // Servisi Durdurur
        service.stop();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
