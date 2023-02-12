package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class GorunurlukTestı extends TestBaseMetod {

    @Test

    public void gorunurluk() throws InterruptedException {

        driver.get("https://www.trendyol.com/");

        // Bir vebsitesinin belirli bir yerin görünürlüğünü test etme


        //1- Trendyol yazisnın gorunur oldugunu test ediyoruz start
        // 1.1-  yukarı da yazılan url ve aşağı daki xpath değiştirip yeni proje de kullanabiliriz

        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//*[@id=\"logo\"]/img"));


        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Trendyol yazisi gorunuyor, test PASSED");
        }else{
            System.out.println("Trendyol yazisi gorunmuyor, Test FAILED");
        }

        Thread.sleep(2000);
    }


}
