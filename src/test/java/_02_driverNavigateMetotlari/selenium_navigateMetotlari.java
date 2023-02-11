package _02_driverNavigateMetotlari;

import org.junit.Test;
import utilities.TestBaseMetod;

public class selenium_navigateMetotlari extends TestBaseMetod {

    @Test

    public void navigateMetot() throws InterruptedException {

        // 1- Driver tarayıcıyı istenen url götürür
        driver.get("https://www.amazon.com/");

        // 2- Taracıyı bekletme komutu
        Thread.sleep(2000);

        // 3-

        driver.navigate().to("https://wisequarter.com/");
        Thread.sleep(2000);

        // 4 - Taracıyı Tekrar amazona geri gitmesini sağlayan komut
        driver.navigate().back();
        Thread.sleep(2000);

        // forward kullanabilmen için back ile gelmiş olman lazım
        // 5 - Taracıyı Tekrar wisequarter gitmesini sağlayan komut
        driver.navigate().forward();
        Thread.sleep(2000);

        // Taracıyı yenieleme komutu
        driver.navigate().refresh();



        Thread.sleep(2000);







    }
}
