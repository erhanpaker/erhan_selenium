package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBaseMetod {

    // bu pojenin içindeki utilities package kopyalıp farklı junit projesinde kullanabilirsin

    protected WebDriver driver;
    @Before
    // BeforeClass olunca static olmak zorunda

    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // BeforeClass yaptık. Altına AfterClass yapalım

    }

    @After

    public  void teardown(){

        driver.quit();





    }

}
