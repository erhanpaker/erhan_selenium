package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMetod;

public class test extends TestBaseMetod {

    @Test

    public void test01(){

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        aramaKutusu.sendKeys("nutella" + Keys.ENTER);


        WebElement aramaSonuc =  driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String expected = "nutella";
        String actualSonucYazisi = aramaSonuc.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expected));


        //




    }



}
