package _01_driverGetMetotlari;

import org.junit.Test;
import utilities.TestBaseMetod;

public class Selenium_DriverMetotlari extends TestBaseMetod {

    @Test

    public void driverGetMetot(){

        // 1- Driver tarayıcıyı istenen url götürür
        driver.get("https://www.amazon.com/");

        // 2-  Gidilen Web sayfasının URL bilgisini döndürür - yazdırır
        System.out.println(driver.getCurrentUrl());

        // 3- Gidilen Web sayfasinin title bilgisini döndür - yazdırır
        System.out.println(driver.getTitle());

        // 4 - Gidilen Web sayafasinin kaynak kodunu yazdir (not; kod uzun olduğu açıklama
        //   System.out.println(driver.getPageSource());

        // 5- Açılan pencere de işletim sistemi tarafindan verilen unique değeri yazdır
        System.out.println(driver.getWindowHandle());

        // 6- Test sırasında driver birden fazla window açtıysa bir set olarak tümü yazdırır
        System.out.println(driver.getWindowHandles());



    }


}
