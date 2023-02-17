package Home_visible;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class SayafayıAsagıİndirme extends TestBaseMetod {

    @Test

    public void webSayfasiniAsagıİndir() throws InterruptedException {

        // .sendKeys(Keys.PAGE_DOWN) bu KODU nekadar fazla yazarsan sayfa o kadar aşağı iner!

        driver.get("https://www.amazon.com");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

            Thread.sleep(5000);


    }
}
