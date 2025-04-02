package day04_junit_webelements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Practice02_R {

    WebDriver driver;

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void practice1(){
        driver.get("https://google.com");
    }

    @Test
    public void practice2(){
        driver.get("https://techproeducation.com");
    }

    @Test
    public void practice3(){
        driver.get("https://amazon.com");
    }

    @Test
    public void practice4(){
        driver.get("https://facebook.com");
    }

    @AfterEach
    void tearmDown(){
        driver.quit();
    }


}
