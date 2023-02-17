selenium
- webElement.click(); Web Element'e click yapar
- webElement.sendKeys("Metin" ); Parametre olarak yazilan metni Web Elemente gönderi
- webElement.submit(); Web element ile islem yaparken Enter tusuna basma gorevi yapar
- webElement.sendKeys("Metin" + Keys.ENTER ); Istedigimiz metni yollayip, sonra ENTER'a basar. -       webElement.getText(); Web Element uzerindeki yaziyi getirir.
- webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir
- webElement.getTagName(); Web elementin tag ismini getirir
- webElement.isEnable(); Web Element erisilebilir ise true yoksa false döner
- webElement.isDisplayed(); Web Element gorunur ise true yoksa false döner
- webElement.isSelected(); Web Element secili ise true yoksa false doner
-----------------------------------
* driver.get(String Url); --> String olarak girilen Url'e gider.
* driver.getTitle(); --> Icinde olunan sayfanin basligini String olarak getirir.
* driver.getCurrentUrl(); --> Icinde olunan sayfanin Url'ini String olarak getirir.
* driver.getPageSource(); --> Icinde olunan sayfanin kaynak kodlarini String olarak getirir.
* driver.getWindowHandle(); --> Icinde olunan sayfa ve/veya tab'larin --> Handle degerini getirir
* driver.getWindowHandles(); --> Browser'i maximize yapar. --> Browser'i minimize yapar.
* driver.manage().window().maximize(); * driver.manage().window().minimize(); * driver.manage().window().fullscreen(); * driver.mange().window().getPosition(); * driver.manage().window().getSize();


--> Browser'i full scren yapar.
--> Browser'in koordinatlarini verir.
--> Brovser'in olculerini verir
* driver.manage().window().setPosition(new x:80,y:0)); --> Browser'i istenen koordinata tasir
* driver.manage().timeouts().impkicitlyWait(Duration.ofSeconds(10)); lenen sureyi gosterir.
-- bir web elementini tanimlamak icin 8 tane selenium locator vardır 1- id
2- name
3- className
4- tagName
5- linkText
6- partialLinkText
7- xpath -> xpath yazmanin birden fazla yolu vardir
8- cssSelector -> css yazmanin birden fazla yolu vardir
--> Istenen sayfa acilana kadar max. beklen süreyi gösterir
1. assertEquals
assertEquals , beklenen sonucu gerçek sonuç ile karşılaştırmak için kullanılır. Beklenen sonuç ile gerçek sonuç eşit değil ise gerçekleştirilen test senaryosu sonucunda assertionError hatası fırlatır.
2. assertTrue
assertTrue, beklenen bir sonucun true olduğunun kabul edilmesi gerektiği zaman kullanılır. Parametre
olarak iki değer alır. İlk parametre de bir mesaj gönderilir ikinci parametrede ise gönderilen mesajın doğruluğu
için koşul belirlenir.
3. assertFalse
assertFalse, beklenen bir sonucun false olması durumunda kullanılır. İki parametre alır.
Parametrelerden biri mesajdır diğeri ise koşuldur. assertFalse ile koşul yerine getirilmez ise assertionError hatası fırl atır.
4.assertNull
assertNull, beklenen bir sonucun null olup olmadığı kontrol edilmesi için kullanılır. Bir nesneyi parametre olarak alır ve nesne null değil ise assertionError hatası fırlatır.
5.assertNotNull
assertNotNull, beklenen bir sonucun null olmadığını doğrulamak için kullanılır.
Bir nesneyi parametre olarak alır ve nesne null ise assertionError hatası fırlatır.
6.assertSame
assertSame, parametre olarak verilen iki nesnenin aynı nesneye karşılık gelip gelmediğini kontrol eder. Eğer nesneler aynı nesneyi karşılamıyor ise assertionError hatası fırlatır.
7.assertNotSame
assertNotSame, parametre olarak verilen iki nesnenin birbirine eşit olmadığı kontrolünü eder. Eğer aynı nesneye karşılık geliyor ise assertionError hatası fırlatır.
8.assertArrayEquals
assertArrayEquals, parametre olarak verilen iki dizinin eşit olup olmadığını kontrol eder.
Her iki dizi içinde null değeri var ise bunlar eşit olarak kabul edilir. Eğer eşit değil ise assertionError hatası fırlatır.
------------------------------
- driver.switchTo() methodu ile geçilebilecek 3 farklı yapı vardır:
1) alert
2) iframe
3) window (sonraki konu)
- Bir websitesi içinde farklı bir websitesi olabilir (embedded).
- Iframe genellkikle bir web sayfasına doküman, video veya interaktif medya gibi başka bir kaynaktan içerik eklemek için kullanılır.
- <iframe> tag'ı bir inline frame belirtir.
- iframe tagı'ı bulunan web sayfalarında locate işlemi yapabilmek için iframe'i handle etmek gerekir.
- Diğer bir deyişle, bir web sayfasında doğruluğundan emin olduğumuz bir locate işlemi varsa
ancak bu düzgün çalışmıyorsa, SAYFADA IFRAME TAG'I BULUNUP BULUNMADIĞINI KONTROL ETME
MİZ GEREKİR.
Bu durumda, önce iframe'i locate edip switchTo() method'u ile geçiş yapmamız gerekir.
- Bir web sayfasında iframe varsa switchTo() method'unu kullanmak gerekir. switchTo() method'u ile iframe'e geçmenin 3 yolu vardır:
1) index ile
driver.switchTo().frame(index of the iframe); //index 0'dan başlar
2) id veya name value ile driver.switchTo().frame("id of the frame");
3) WebElement ile driver.switchTo().frame(WebElement of the iframe);
- iframe'den çıkmak için 2 komut vardır:
1) driver.switchTo( ).parentFrame( ); ===> 1 ust seviyedeki frame'e cikartir
2) driver.switchTo( ).defaultContent( ); ===> En ustteki frame'e cikmak icin kullanilir
- Birden fazla iframe varsa gecislerde dikkatli olmak lazim. Gecisler her zaman basit olamayabilir
