package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();


        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        // 4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());

        // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedURL = "https://testotomasyonu.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED");

        // 6. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());

        // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String pageSource = driver.getPageSource();

        if (pageSource.contains("otomasyon")){
            System.out.println("Page Source test PASSED");
        }else System.out.println("Page Source test FAILED");

        // 8. Sayfayi kapatin.

        Thread.sleep(3000);
        driver.quit();
        

    }
}
