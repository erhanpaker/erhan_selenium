package _04_webElemetMetotlari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class selenium_webElement extends TestBaseMetod {

    @Test
    public void TestBaseMetot() throws InterruptedException {

        // 1- Driver tarayıcıyı istenen url götürür
        driver.get("https://www.amazon.com/");

        // En çok kullanılan bu komut web sayfasın da xpath aldığmız yere götürür bizi
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // Web element'e istenen metni yollayıp, enter tusuna basar
        aramakutusu.sendKeys("Nutella" + Keys.ENTER);


        // YUKARIDA yazdığın webelement komutunu 1 kez kullanabilirsin (kaldır)
         aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

         Thread.sleep(3000);

         // nutella yazısını arama kutusundan silme kodu
         aramakutusu.clear();

        // Web element'e istenen metni yollayıp, enter tusuna basar
        aramakutusu.sendKeys("süt" + Keys.ENTER);









    }


}
