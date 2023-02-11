package List_WebElement;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

import java.util.List;

public class AutomationExercise extends TestBaseMetod {

    @Test

    public void TestBaseMetod(){

        // BU Testcase de web sitesinde 147 tane link olduğunu test ediyoruz
        // tagname "a"  olanlar link dir

        driver.get("https://automationexercise.com/");

        List<WebElement> linkelementlistesi = driver.findElements(By.tagName("a"));

        int expectedlinksayisi=147;
        int actuallinksayisi= linkelementlistesi.size();

        // if ile karşılaştırma yapıyoruz

        if (expectedlinksayisi==actuallinksayisi){

            System.out.println("Link sayisi testi PASSED");
        }else{

            System.out.println("belirtilen sayida link yok test FAILD");

            // linke tıklama kodu

            WebElement productsLinki = driver.findElement(By.linkText(" Products"));

            // products tıklama kodu
            productsLinki.click();

            // 1 - bir websitesinde bir yerin göründüğünü test etme kodu (genel)

            WebElement logo = driver.findElement(By.id("sale_image"));

            if (logo.isDisplayed()){
                System.out.println("logo göründü ise TEST PASSED") ;
            }else{
                System.out.println("logo görünmedi ise TEST FAİLD ") ;

                // BURDAN DEVAM ET 3 VİDEO
            }


        }


    }


}
