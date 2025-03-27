package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice03_d2 {
    public static void main(String[] args) {
        // TechproEducation sayfasina gidin. https://www.techproeducation.com/
        // Sayfa basligini(title) yazdirin
        // Sayfa basliginin "IT" icerdigini test edin
        // Sayfa adresini(url) yazdirin
        // Sayfa url'inin "education" icerdigini test edin.
        // Sayfa handle degerini yazdirin
        // Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin
        // Sayfayi kapatin.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        String actualTitle = driver.getTitle();
        System.out.println("actualTechproTitle = " + actualTitle);

        if (actualTitle.contains("IT")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fail");
        }
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " +actualUrl);

        if (actualUrl.contains("edication")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fail");
        }
        String actualHandle = driver.getWindowHandle();
        System.out.println("actualHandle = " + actualHandle);

        String pageSource = driver.getPageSource();
        if (pageSource.contains("IT Programs")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fail");
        }

        driver.quit();

    }
}
