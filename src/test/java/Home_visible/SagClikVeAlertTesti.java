package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class SagClikVeAlertTesti extends TestBaseMetod {

    @Test

    // mouse ile sağ clik yapma kodu ve Alert çıkan yazının context olduğunu test etme

    public void sagClik(){

        // bu 1 adım: not: actions ile biten tüm kodlar "perform()" ile bitmek zorunda

        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement buton = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions =new Actions(driver);

        actions.contextClick(buton).perform();



        // bu 2 adım - Alert'te çıkan yazinin "You selected a context menu" olduğunu test kod bu

        String expectedAlertYazisi  ="You selected a context menu";
        String actualAlertYazisi = driver.switchTo().alert().getText();

        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);

        // 3 - Tamam diyerel Alert kapatıyoruz

        driver.switchTo().alert().accept();


    }


}
