package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ByID_ByName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // TestOtomasyonu anasayfaya gidin.
        driver.get("https://www.testotomasyonu.com/");

        // arama kutusunu locate edip kaydedin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        // arama kutusuna phone yazdirin
        aramaKutusu.sendKeys("phone");

        //arama yapilmasi icin ENTER tusuna basin
        aramaKutusu.submit();

        //sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();





    }

}
