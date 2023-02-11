package _01_driverGetMetotlari;

import org.junit.Test;
import utilities.TestBaseMetod;

public class Selenium_DriverMetotlari extends TestBaseMetod {

    @Test

    public void driverGetMetot(){

        // 1- Driver istenen url götür
        driver.get("https://www.amazon.com/");

        // 2-  Gidilen Web sayfasının URL bilgisini döndürür
        driver.getCurrentUrl();


    }


}
