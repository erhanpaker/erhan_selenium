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

        // Junit ile "assertion için en çok kullanılan 4 metod

        // 1- sonuç 20 olduğunu test et;
        // 1  Assert.assertEquals( sonuc , 20);

        // 2 - Sonucun Succesfull olmadığını test eden kod
        // 2 - Assert.assertNotEquals(sonuc , succesfull);

        // 3- Sayının 50 büyül olduğunu test eden kod
        // 3-  Assert.assertTrue(sayi> 50);

        // 4- Sayinın 50 den büyük olmadığını test edin
        // 4-    Assert.assertFalse(sayi>50);



        //  1 Sayfa başlığının “YouTube” oldugunu test edin - iki farklı senaryo

        driver.get("https://www.youtube.com");

        String expectedTitle="https://www.youtube.com";

        String actualTitle= driver.getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);


    }

    @Test

    public void test011(){


        // 2 sayfa url youtube olduğunu test edilmesini isteseydik altdaki kodu kullan
        String expectedTitle="youtube";

        String  actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedTitle));








    }


}


