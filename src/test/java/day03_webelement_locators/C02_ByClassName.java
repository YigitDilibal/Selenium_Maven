package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ByClassName {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.className("search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        // submit isleminin bir alternatifi de arama kutusuna Keys.ENTER yollamaktir.


        // arama sonucunda bulunan bulunan urun sayisini yazdirin
        WebElement aramaSonucYaziElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucYaziElementi.getText());


        //arama sonucunda urun bulunabildigini test edin

        String aramaSonucYazisi = aramaSonucYaziElementi.getText();

        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D","");

        int aramaSonucSayisi = Integer.parseInt(aramaSonucYazisi);

        System.out.println(aramaSonucSayisi>0?"Arama testi PASSED":"Arama testi FAILED");

        //sayfayi kapatin.
        driver.quit();




    }

}
