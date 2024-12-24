package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/");

        // 2- Add Element butonuna basin

        WebElement addButonu = driver.findElement(By.xpath("//button[@id=\"sub-btn\"]"));
        addButonu.click();
        Thread.sleep(1000);

        // 3- Remove butonu’nun gorunur oldugunu test edin

        WebElement removeButonu = driver.findElement(By.className("remove-btn"));
        if (removeButonu.isDisplayed()){
            System.out.println("Remove buton test PASSED");
        }else System.out.println("Remove buton test FAILED");

        // 4- Remove tusuna basin

        removeButonu.click();
        Thread.sleep(1000);

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYazisi = driver.findElement(By.xpath("//div[1]/h2"));

        if (addRemoveYazisi.isDisplayed()){
            System.out.println("Add/Remove yazisi test PASSED");
        } else System.out.println("Add/Remove yazisi test FAILED");

        Thread.sleep(1000);
        driver.quit();







    }


}
