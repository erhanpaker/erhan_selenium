package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class FıyatTestı extends TestBaseMetod {

    @Test

    public void fıyat(){

        // BU KOD ÇALIŞIYOR DÜZENLEME YAPILCAK

        driver.get("https://www.amazon.com/");
        //3-  Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-  Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedIcerik= "Spend less";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title'da aranan icerik yok, Test FAILED ");
        }
        //6-  Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
        //7-  Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]")).click();
        //9-  Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcretElementi= driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));

        String expectedUcret="25$";
        String actualUcret=urunUcretElementi.getText();

        if (expectedUcret.equals(actualUcret)){
            System.out.println("Ucret testi PASSED");
        } else{
            System.out.println("Ucret istenenden farkli, Test FAILED");
            System.out.println("actual ucret : " + actualUcret);
        }

    }
}