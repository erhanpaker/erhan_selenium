package Home_visible;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class butonSürükleyipBırakma extends TestBaseMetod {

    @Test
      // dragme butonunu tutup  drop here kutusunun üstüne bırakMA

    public void dragMe_dropHere() throws InterruptedException {

        driver.get("https://demoqa.com/droppable");

        WebElement  dragme =  driver.findElement(By.xpath("//div[@id='draggable'] "));

        WebElement drophere =  driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        Actions actions =new Actions(driver);

        actions.dragAndDrop(dragme,drophere).perform();

        Thread.sleep(5000);


    }
}
