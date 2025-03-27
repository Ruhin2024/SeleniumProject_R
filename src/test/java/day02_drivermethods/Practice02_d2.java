package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02_d2 {
    public static void main(String[] args) {

        //Google sayfasina gidelim
        //Sayfa başlığını konsola yazdıralım
        //Sayfanın Url'ini konsola yazdıralım
        //Techproeducation sayfasına gidelim
        //Sayfa başlığını konsola yazdıralım
        //Sayfanın Url'ini konsola yazdıralım

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        String actualGoogleTitle = driver.getTitle();
        driver.get("actualGoogleTitle = " + actualGoogleTitle);
        String actualGoogleUrl = driver.getCurrentUrl();
        driver.get("actualGoogleUrl = " + actualGoogleUrl);


       // ---------
        driver.get("https://github.com");
        String actualGithubTitle = driver.getTitle();
        driver.get("actualGithubTitle = " + actualGithubTitle);
        String actualGithubUrl = driver.getCurrentUrl();
        driver.get("actualGithubUrl = " + actualGithubUrl);
        String actualGithub = driver.getPageSource();
        driver.get("actualGithub = " + actualGithub);


    }
}
