package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

        String pageSource = driver.getPageSource(); // tum sayfa kaynagini getirir.

        System.out.println(driver.getWindowHandle());
        //0A88A0AE094D44DB4B393C5C7A841B1F
        // WebDriver olusturulan her bir window'u takip edebilmek icin
        // ona ozel bir Window hande Degeri atamasi yapar
        // WHD anlamsizdir, unique'dir ve her calistiginda farkli bir deger verir.

        System.out.println(driver.getWindowHandles());
        // test sirasinda birden fazla window acilirsa
        // tum windowslar icin ayni degeri Set<String> olarak getirir.


        Thread.sleep(3000);
        driver.quit();




    }
}
