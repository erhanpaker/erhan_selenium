package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class SeleniumDoğrulamaTesti extends TestBaseMetod {

    @Test

    public void sayfaBaslıgıDogrulama(){

        // Junit ile "assertion için en çok kullanılan metod

        //  1 Sayfa başlığının “YouTube” oldugunu test edin - iki farklı senaryo

        driver.get("https://www.youtube.com");

        String expectedTitle="https://www.youtube.com";

        String actualTitle= driver.getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);


    }

    @Test

    public void baslıkTestı(){


        // 2 sayfa url youtube olduğunu test edilmesini isteseydik altdaki kodu kullan
        String expectedTitle="youtube";

        String  actualUrl = driver.getCurrentUrl();
        Assert.assertFalse(actualUrl.contains(expectedTitle));



    }


}


