package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class yaziDogrulukTesti extends TestBaseMetod {

    // sayfa'daki yazının "Opening a new window olduğunu test ediyoruz"

    @Test

    public void yaziTesti() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/windows");

        Thread.sleep(1000);

        WebElement yaziElementi = driver.findElement(By.tagName("h3"));

        String expectedYazi = "Opening a new window";
        String actualYazi = yaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);
    }
}
