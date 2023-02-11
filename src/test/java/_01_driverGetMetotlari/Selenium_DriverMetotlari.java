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

        // Gidilen Web sayfasinin title bilgisini döndür - yazdırır
        System.out.println(driver.getTitle());


    }


}
