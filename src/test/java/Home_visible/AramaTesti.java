package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class AramaTesti extends TestBaseMetod {

    @Test

    public void amazonUrunArama(){

        driver.get("https://www.amazon.com");

        // . method'da arama kutusuna Nutella yazip aratin
        //    ve sonuc yazisinin Nutella icerdigini test edin
        // Farklı poje de kullanmak için URL ve XPATH değişmesi gerekiyor!

         // 1 - arama kutusunu locate ettim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        // 2 - nutella arattım
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // 3 - nutella xpath bu
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        // 4 - Altdaki kod bloğu sonucun Nutella içerdiğini test ediyor!!

        String expectedIcerik= "Nutella";
        String actualSonucYazisi= sonucYaziElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella arama testi PASSED");
        }else{
            System.out.println("Nutella arama testi FAILED");
        }


    }

}


