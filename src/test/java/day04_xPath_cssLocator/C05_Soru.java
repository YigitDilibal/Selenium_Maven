package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Soru {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. http://zero.webappsecurity.com
        //   sayfasina gidin

        driver.get("http://zero.webappsecurity.com");


        //2. Signin buttonuna tiklayin

        driver.findElement(By.className("icon-signin")).click();

        //3. Login alanine  “username” yazdirin

        driver.findElement(By.id("user_login")).sendKeys("username");

        //4. Password alanina “password” yazdirin

        driver.findElement(By.id("user_password")).sendKeys("password");

        //5. Sign in buttonuna tiklayin

        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).submit();

        //6. Back tusu ile sayfaya donun

        driver.navigate().back();

        //7. Online Banking menusunden Pay Bills sayfasina gidin

        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).sendKeys("1000");

        //9. tarih kismina “2023-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2023-09-10");

        //10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin

        boolean gozuktuMu = driver.findElement(By.xpath("//*[.=\"The payment was successfully submitted.\"]")).isDisplayed();

        if (gozuktuMu){
            System.out.println("Odeme basarili yazisi testi PASSED");
        }else System.out.println("Odeme basarili yazisi testi FAILED");

        Thread.sleep(1000);
        driver.quit();







    }
}
