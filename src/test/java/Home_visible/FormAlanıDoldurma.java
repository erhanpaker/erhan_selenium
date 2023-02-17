package Home_visible;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMetod;

public class FormAlanıDoldurma extends TestBaseMetod {

    @Test

    public void form() throws InterruptedException {

        // websitesine kayıt olurken isim, mail gibi  tek tek locate almak yerine taba bas
        // 1 tane xpath aldıktan sonra tab ile ilerliyoruz
        // facebook gidip form doldurup kayıt oluyoruz
        // isim ve bilgiler verilmemişse pom.xml faker ekle


        // form alanına bilgileri rast gele giricek fakeR
        Faker faker =new Faker();

        driver.get("https://www.facebook.com");
        Thread.sleep(5000);

        // YENİ kayıt oluştur buton locate ettim
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));


        // acilan formda sadece ilk gelen name yani isim locatini aldım diğerlerini tab ile geçicem
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));


        Actions actions = new Actions(driver);

        // faker her seferinde farklı mail ürettiği için, aynı mail iki kez giremezsin
        // aynı mail iki kez girmemiz için string oluşturdum
        String mail=faker.internet().emailAddress();
        Thread.sleep(1000); ;

        // isim kutusuna click yaptım ve senkey içine faker yazıp ne göndermek istersin
        actions.click(isimKutusu)
                 .sendKeys(faker.name().firstName())
                // .sendKeys(Keys.TAB)  <--- basıp soyadı kısmına geçmelisin
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                // aynı email iki kez girmen lazım,yukarıda bu kodu oluşturdum
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12")
                .sendKeys(Keys.TAB)
                .sendKeys("feb")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                // SAĞ TARAFA SEÇMEYE YARIYOR -- ARROW_RIGHT
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                // BUTONA BAS
                .sendKeys(Keys.ENTER).perform();
            // ACTİON İLE BAŞLAYAN KOD  perform(); İLE BİTER









    }


}
