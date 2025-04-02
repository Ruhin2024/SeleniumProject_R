package day04_junit_webelements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice04_R {

    // Go to Google Website
    //Verify that the page title is Google
    // Close the page

     // Go to Google Website
     // Verify that the page url is https://www.google.com/
     // Close the page


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

        String expectedData = "Google";
        String actualData = driver.getTitle();
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    public void practice2(){
        driver.get("https://google.com");

        String expectedData = "https://www.google.com/";
        String actualData = driver.getCurrentUrl();
        Assertions.assertEquals(expectedData,actualData);
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }


}
