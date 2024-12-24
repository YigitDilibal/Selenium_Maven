package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Test Otomasyonu")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi failed");

        //6- Furniture linkine tiklayin

        driver.findElement(By.xpath("(//a[.='Furniture'])[3]"))
                .click();

        //7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin

        driver.findElement(By.xpath("//*[@*='form-control minPrice']")).clear();
        driver.findElement(By.xpath("//*[@*='form-control minPrice']")).sendKeys("40");

        driver.findElement(By.xpath("//*[@*='form-control maxPrice']")).clear();
        driver.findElement(By.xpath("//*[@*='form-control maxPrice']")).sendKeys("200");

        driver.findElement(By.xpath("//*[@*='price-range-button']")).click();

        //8- filtreleme sonucunda urun bulunabildigini test edin

        List<WebElement> bulunanUrunListesi = driver.findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));



        if (!bulunanUrunListesi.isEmpty()){
            System.out.println("Urun bulunabilme testi PASSED");
        }else System.out.println("Urun bulunabilme testi FAILED");

        //9-Ilk urunu tiklayin

        bulunanUrunListesi.get(0).click();

        //10- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin

        WebElement fiyatElementi = driver.findElement(By.id("priceproduct"));
        String urunFiyatiStr = fiyatElementi.getText();

        urunFiyatiStr = urunFiyatiStr.replaceAll("\\D","");
        double urunFiyati = Double.parseDouble(urunFiyatiStr) / 100;

        if (urunFiyati>=40 && urunFiyati<=200){
            System.out.println("Urun fiyat testi PASSED");
        }else System.out.println("Urun fiyat testi FAILED");


        //11-Sayfayi kapatin
        driver.quit();




    }


}
