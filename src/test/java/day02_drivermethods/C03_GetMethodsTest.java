package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethodsTest {

    // Go to TechproEducation page https://www.techproeducation.com/
    // Print the page title
    //Test if the page title contains "IT"
    // Print the page address (url)
    // Test that the page url contains "education".
    //Print the page handle value
    // Test whether the word "IT Programs" appears in the page HTML codes
    // Close the page.


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // TechproEducation sayfasina gidin. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com");

        // Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        // Sayfa basliginin "IT" icerdigini test edin
        if(actualTitle.contains("IT")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl(); // bu sayfanin icinde olan url getirir
        System.out.println("actualUrl = " + actualUrl);

        // Sayfa url'inin "education" icerdigini test edin.
        if (actualUrl.contains("edication")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Faild");
        }

        // Sayfa handle degerini yazdirin
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        // Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin
        String pageSource  = driver.getPageSource();
       if (pageSource.contains("IT Programs")){
           System.out.println("Test Passed");
       }else{
           System.out.println("Test Faild");
       }
        // Sayfayi kapatin.
        driver.quit();// aciq olan butun sayfalari bagliyir ve driveri sona yetirir.
        driver.close();//sadece axirinci driveri baglayar--

    }
}
