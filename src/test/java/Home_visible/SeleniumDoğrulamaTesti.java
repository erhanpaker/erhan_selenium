package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class SeleniumDoğrulamaTesti extends TestBaseMetod {

    @Test

    public void dogrulama(){

        // Sayfa başlığının “YouTube” oldugunu test edin

        driver.get("https://www.youtube.com");

        String expectedTitle="YouTube";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);


    }


}


