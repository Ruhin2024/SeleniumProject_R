package day03_drivermethods_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethods {

    //Go to TechPro page. https://www.techproeducation.com/
    //Print the page position and size
    //Minimize the page
    //Wait 3 seconds in minimized mode and maximize the page
    //Print the page position and size in maximized mode
    //Make the page fullscreen
    //Print the page position and size in fullscreen mode
    //Close the page


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TechPro sayfasina gidelim. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu =>" + driver.manage().window().getPosition());
        System.out.println("Sayfanin Olculeri" + driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000); //kodu seyfeni istenilen qeder dayandirir.
                                  // Test mutexesisleri olaraq Thredden istifade etmezler

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin konumu =>" + driver.manage().window().getPosition());
        System.out.println("Sayfanin Olculeri" + driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin konumu =>" + driver.manage().window().getPosition());
        System.out.println("Sayfanin Olculeri" + driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();


    }
}