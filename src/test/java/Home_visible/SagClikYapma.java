package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class SagClikYapma extends TestBaseMetod {

    @Test

    // mouse ile sağ clik yapma kodu

    public void sagClik(){

        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement buton = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions =new Actions(driver);

        actions.contextClick(buton).perform();

        // not: actions ile biten tüm kodlar "perform()" ile bitmek zorunda
    }


}
