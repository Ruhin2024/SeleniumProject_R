package day05_webelements_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    //Go to Amazon page
    //Locate the search box and print and search for iPhone
    //close the page

    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        Thread.sleep(3000); //bu sureyi sackpeyi hendl edebilmek icin qullandiq

        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
       /* 1 ci yol
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit(); //==>Enter tusuna basdiq
         */
        /*
        Eger bir searBox locat edib bir text gondersek 2 sekilde enter tusuna basabilerik
        1)submit() methodu ==> Enter tusuna basdiq
        2)Keys.Enter(==>ENUM)
         */

        //2 ci yol
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //3 cu yol
        driver.findElement(By.name("field-keywords")).sendKeys("iphone",Keys.ENTER);

        //sayfayı kapatınız
        //driver.quit();


    }
}