package day03_drivermethods_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_JunitFirstTest {

    /*
   Projectimizde Junit kullanmak istiyorsak öncelikle dependency yi Pom.xml
   dosyamiza eklemeliyiz, junit sayesinde artik main method, if else gibi
   yapilardan kurtulacağız, artik junit sayesinde testlerimizi daha profosyonel
   bir sekilde yapmaya baslayacağız
    */

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        driver.quit();
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        driver.quit();
    }

    @Test
    public void test3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        driver.quit();
    }

    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        driver.quit();
    }


}
