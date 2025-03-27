package day03_drivermethods_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_NavigateMethods {


    // go to techproeducation homepage https://www.techproeducation.com/
    //Go to Amazon page. https://www.amazon.com/
    //Go back to techproeducation page
    //Go to Amazon page again
    //Refresh the page
    //Close all pages


    //src/main/test/java/C01_NavigateMethods.java
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // techproeducation ana sayfasina gidelim . https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //Tekrar techproeducation sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //Tum sayfalari kapatalim
        driver.quit();

    }
}
