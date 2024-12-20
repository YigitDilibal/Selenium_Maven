package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        1.Youtube ana sayfasina gidin . https://www.youtube.com/

        driver.navigate().to("https://www.youtube.com/");

//        2.url’in “youtube” icerdigini test edin.

        String expectedURL = "youtube";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL test PASSED");
        }else System.out.println("URL test FAILED");

//        3. Testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/

        driver.navigate().to("https://www.testotomasyonu.com/");

//        4. Title’in “Test Otomasyonu” icerdigini test edin.

        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED");

//        5. Tekrar YouTube’sayfasina donun.
        driver.navigate().back();

//        6. Title’in “YouTube” oldugunu test edin
        String expectedTitleYT = "YouTube";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitleYT)){
            System.out.println("Youtube Title test PASSED");
        }else System.out.println("Youtube Title test FAILED");

//        7. Sayfayi Refresh(yenile) yapin.
        driver.navigate().refresh();

//        7. Sayfayi kapatalim / Tum sayfalari kapattin.

        driver.quit();



    }
}
