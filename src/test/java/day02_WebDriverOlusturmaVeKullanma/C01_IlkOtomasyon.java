package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {

        // otomasyon yapmak uzere olusturdugumuz bir class'da
        // ilk yapmamiz gereken sey: Web driver objesi edinmektir.

        WebDriver driver = new ChromeDriver();
        //baska hicbir sey yapmasak bile
        // bu satir bir browser olusturur ve bizim emrimizi bekler



        // olusturdugumuz driver objesi
        // bizim elimiz ve gozumuz gibidir,
        // klavye ve mouse kullanarak yaptigimiz islemlerin
        // buyuk bir bolumunu driver objesiyle yapabiliriz.



        // testotomasyonu anasayfaya gidin
        driver.get("https://testotomasyonu.com");
        // get() icerisinde Url yazilirken www yazilmasa da olur
        // ancak https:// yazilmazsa kod calismaz


        Thread.sleep(3000); // Kodlari yazilan milisaniye miktarinca bekletir.

        // test sirasinda birden fazla window acilirsa
        // driver.close(); // sadece sonuncu browseri kapatir
        driver.quit(); // tum browserleri kapatir.




    }
}
