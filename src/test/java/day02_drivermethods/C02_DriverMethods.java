package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Google sayfasina gidelim
        String googleUrl = "https://google.com";
        driver.get("https://google.com");

        //Sayfa başlığını konsola yazdıralım
        String actualGoogleTitle = driver.getTitle();
        System.out.println("actualGoogleTitle = " + actualGoogleTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualGoogleUrl = driver.getCurrentUrl();
        System.out.println("actualGoogleUrl = " + actualGoogleUrl);

        //Techproeducation sayfasına gidelim
        driver.get("https://techproedication.com");

        //Sayfa başlığını konsola yazdıralım
        String actualTechproTitle = driver.getTitle();
        System.out.println("actualTechproTitle = " + actualTechproTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualTechproUrl = driver.getCurrentUrl();
        System.out.println("actualtechproUrl = " + actualTechproUrl);




    }
}
