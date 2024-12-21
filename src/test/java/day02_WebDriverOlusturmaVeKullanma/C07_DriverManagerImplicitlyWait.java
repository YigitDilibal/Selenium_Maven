package day02_WebDriverOlusturmaVeKullanma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverManagerImplicitlyWait {

    public static void main(String[] args) {


        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://youtube.com");

        /*
        ImplicitlyWait
        Web sayfasinin yuklenmesi  ve
        WebElementlerin bulunmasi icin driver objesine sure tanimlamak icin kullanilir

        ImplicitlyWait esnek bir bekleme suresidir
        Oncelik bekleme degil islemin yapilmasidir.
        eger sayfa 0.1 saniyede yuklenirse
         */

        driver.quit();

    }
}
