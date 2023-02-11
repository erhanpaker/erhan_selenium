package Actual_Expected_Result;

import org.junit.Test;
import utilities.TestBaseMetod;

public class _01_Belirli_Kelimeyi_icerdiği extends TestBaseMetod {

    @Test
    public void test01(){

        // Bu test Case de gidilen web sayfasının title değerinin belirli kelimeyi içeridiğini test ediyoruz
        // expected ve actual değerleri kaydedip ilf else testi yapıp ve sonuç yazdırlır

        // 1- Driver tarayıcıyı istenen url götürür
        driver.get("https://www.trendyol.com/");



        // trendyol ana sayfayanın "En Trend Ürünler Türkiye'nin Online " kelimesi içerdiğini test et
        // Bir Tester olarak expected ile actual değeri karşılaştırmaktır

        String expectedTitle="En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Url test PASSED");

        }else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : " + actualTitle);
            System.out.println("Actual Url aranan " + expectedTitle + " kelimesini icermiyor");
        }



    }
}
