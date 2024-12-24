package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.className("search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // bulunan urunlerin sayisini gosterilen urun resim adedine bakarak bulun

        // List<WebElement> elementList = driver.findElements(By.className("product-box my-2  py-1"));
        // By.className locator'i GENELDE benzer ozellikteki
        // Web elementleri gruplandirmak icin kullanilir
        // AMA bir kotu yani var, Eger Class attribute'unun degerinde space varsa
        // By.className buyuk ihtimalle calismaz

        List<WebElement> elementList = driver.findElements(By.className("prod-img"));

        // kac urun bulunabildigini yazdirin
        System.out.println("Bulunan urun sayisi: " + elementList.size());

        // urun bulunabildigini test edin
        int actualProductCount = elementList.size();

        System.out.println(actualProductCount>0?"Urun arama testi PASSED" : "Urun arama testi FAILED");

        //? bulunan urunlerin isimlerini yazdirin

        // ilk urunu tiklayin
        // listede 0. indexteki elementi click yapabiliriz

        elementList.get(0).click();

        // acilan urun sayfasindaki urun isminde

        // case sensitive olmadan "phone" kelimesi gectigini test edin

        String expectedName = "phone";

        WebElement urunDetayElementi = driver.findElement(By.className("prod-detail"));

        String urunDetayi = urunDetayElementi.getText().toLowerCase();

        if (urunDetayi.contains(expectedName)){
            System.out.println("Urun detay testi PASSED");
        }else System.out.println("Urun detay testi FAILED");

        // sayfayi kapatin

        Thread.sleep(1500);
        driver.quit();




    }
}
