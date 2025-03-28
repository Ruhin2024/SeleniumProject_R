package day04_junit_webelements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork {

    /*
    Interview Sorusu:
    Bir classta 4 tane test methodu, 1 tane BeforeEach 1 tane AfterEach method varsa
    classta toplam kac method calisir? =>12
     */

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test1() {
        driver.get("https://techproeducation.com");
        //assertionlar yapiyoruz
    }

    @Test
    public void test2() {
        driver.get("https://facebook.com");
        //assertionlar yapiyoruz
    }

    @Test
    public void test3() {
        driver.get("https://google.com");
        //assertionlar yapiyoruz
    }

    @Test
    public void test4() {
        driver.get("https://amazon.com");
        //assertionlar yapiyoruz
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }



}