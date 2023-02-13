package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class FıyatTestı extends TestBaseMetod {

    @Test

    public void fıyat() throws InterruptedException {


        driver.get("https://www.amazon.com/");

        // 1- Taracıyı refresh yapmayınca Test Faild Oluyor
        driver.navigate().refresh();

        //2-  Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();

        //3-  Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();

        //4-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]")).click();

        //5-  Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //6 -Urun ucretinin 25$ oldugunu test etmeye başlangıç kısmı!!
        WebElement urunUcretElementi= driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));

        // 7 - Ürün fiyatının 25$ dolar olduğunu test eden kod bloğum!

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