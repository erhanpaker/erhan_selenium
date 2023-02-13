package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class İlkArama extends TestBaseMetod {

    @Test

    public void ilkUrunuArama(){

        // Bu method'da ilk Nutella urunune tiklayip
        //   urun isminin Nutella icerdigini test ediyoruz

        driver.get("https://www.amazon.com");


        // arama kutusu locate ettim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusunu nutella yazdırdım
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        // ilk ürünü aramak için bu xpath sonuna dikkat et!
        WebElement ilkUrunElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]"));

        ilkUrunElementi.click();


        String actualUrunIsmi= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();

        // urun isminin Nutella icerdigini test eden kob blogu!!

        String expectedIcerik="Nutella";

        if (actualUrunIsmi.contains(expectedIcerik)){
            System.out.println("Ilk urun testi PASSED");
        }else{
            System.out.println("Ilk urun testi FAILED");
        }
    }

}


