package Home_visible;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBaseMetod;

public class yeniTabAcma extends TestBaseMetod {

    @Test

    public void amazonGit(){

        driver.get("https://www.amazon.com");


    }

    @Test

    // YENİ BİR TAB da yeniden amazona gitme kodu

    public void tabAcma(){

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

    }


}
