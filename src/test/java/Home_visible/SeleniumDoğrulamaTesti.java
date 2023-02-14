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

        //  1 Sayfa başlığının “YouTube” oldugunu test edin - iki farklı senaryo

        driver.get("https://www.youtube.com");

        String expectedTitle="youtube.com";

        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @Test

    public void test011(){


        // 2 sayfa url youtube olduğunu test edilmesini isteseydik altdaki kodu kullan
        String expectedTitle="youtube.com";

        String  actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedTitle));

    }


}


