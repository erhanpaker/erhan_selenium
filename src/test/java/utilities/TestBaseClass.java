package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBaseClass {

   protected static WebDriver driver;
    @BeforeClass
    // BeforeClass olunca static olmak zorunda
    // bu pojenin içindeki utilities package kopyalıp farklı junit projesinde kullanabilirsin

    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // BeforeClass yaptık. Altına AfterClass yapalım

    }

    @AfterClass

    public static void teardown(){
        driver.close();


    }
}
