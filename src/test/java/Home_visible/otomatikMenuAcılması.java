package Home_visible;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class otomatikMenuAcılması extends TestBaseMetod {

    @Test

    public void menuAcilmasi(){

        // açılır menü

        // Account List menüsünün açılması için mouse menü üzerine getirme kodu

        driver.get("https://www.amazon.com");

        WebElement accountListElementi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(accountListElementi).perform();


    }
}
