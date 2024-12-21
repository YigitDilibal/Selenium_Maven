package day02_WebDriverOlusturmaVeKullanma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageWindowMethodlari {

    public static void main(String[] args) throws InterruptedException {

        // gerekli ayarlari yapip
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println("Baslangicta size: " + driver.manage().window().getSize());
        System.out.println("Baslangicta konum: " + driver.manage().window().getPosition());

        // testotomasyonu anasayfaya gidin.

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(500);

        // browser'i maximize yapin
        driver.manage().window().maximize();

        System.out.println("size: " + driver.manage().window().getSize());
        System.out.println("konum: " + driver.manage().window().getPosition());

        Thread.sleep(500);

        // browser'i fullscreen
        driver.manage().window().fullscreen();

        System.out.println("size: " + driver.manage().window().getSize());
        System.out.println("konum: " + driver.manage().window().getPosition());

        //browser'in baslangic pixel'ini 300,300
        // ve boyutunu 500x500 yapin

        driver.manage().window().setPosition(new Point(300,300));
        driver.manage().window().setSize(new Dimension(500,500));

        Thread.sleep(5000);
        driver.quit();


    }
}
