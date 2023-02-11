package _03_driverManageMetotlari;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBaseMetod;

public class selenium_manageMetotlari extends TestBaseMetod {

    @Test

    public void manageMetot() throws InterruptedException {

        // 1- Driver tarayıcıyı istenen url götür
        driver.get("https://www.amazon.com/");

        Thread.sleep(2000);

        // 2 - window  maximum boyutta position boyutunu yazdir
        // 2.1-  açılan pencerenin bulunduğu pozisyonu ve boyutlarını döndürür
        System.out.println("maximum boyutta position:" +driver.manage().window().getPosition());
        System.out.println("maximax boyutta size" +driver.manage().window().getSize());

        // 3-  window fuulscren yapan komut
        driver.manage().window().fullscreen();

        // 2.1-  açılan pencerenin bulunduğu pozisyonu fuulscren boyutlarını yazdır
        System.out.println("fullscreen boyutta position:" +driver.manage().window().getPosition());
        System.out.println("fullscren boyutta size" +driver.manage().window().getSize());

        Thread.sleep(2000);

        // window istediğimiz boyuta ve konuma getirme komutu. genişlik ve yükseklik ver
        driver.manage().window().setSize(new Dimension(200,200));
        // window başlangıç noktasını belirleme
        driver.manage().window().setPosition(new Point(34,34));

        // 2.1-  açılan pencerenin boyutlarını yazdır
        System.out.println("istenen boyutta position:" +driver.manage().window().getPosition());
        System.out.println("istenen boyutta size" +driver.manage().window().getSize());
        Thread.sleep(2000);

    }
}
