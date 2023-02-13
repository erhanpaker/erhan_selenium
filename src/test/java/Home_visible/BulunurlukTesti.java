package Home_visible;

import org.junit.Test;
import utilities.TestBaseMetod;

public class BulunurlukTesti extends TestBaseMetod {

    @Test
    public void amazonOldugumuTestEt(){

        /*
        NOT: JUnit'de @BeforeClass ve @AfterClass her iki  notasyonnin kullanildigi method'lar
        static olarak isaretlenmek zorundadir
     */

        //1. Bu method'da amazon anasayfaya gidip
        //   amazon'da oldugunuzu test edin
        driver.get("https://www.amazon.com");

        String expectedUrlIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Amazon testi PASSED");
        }else{
            System.out.println("Amazon testi FAILED");
        }




    }
}
