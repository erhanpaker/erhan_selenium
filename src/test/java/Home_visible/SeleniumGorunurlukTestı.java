package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class SeleniumGorunurlukTestı extends TestBaseMetod {


    @Test


    public void test1() {

        driver.get("https://www.bestbuy.com/");

        // logoTesti => BestBuy logosunun görüntülendigini test ediyoruz
        WebElement logoElementi= driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));

        Assert.assertTrue(logoElementi.isDisplayed());

    }

}

