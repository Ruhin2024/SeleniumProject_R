package day03_drivermethods_implicitlywait_junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice03_R {
    public static void main(String[] args) {

        //Go to TechProEducation page
        //test that the page title contains TechPro Education
        //go to facebook page
        //test that the page url contains facebook
        //go back to techpro page
        //Test that you are back
        //close the page


        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("Title = " + driver.getTitle());
        if (driver.getTitle().contains("TechPro Education")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        System.out.println("//------------------------------");

        driver.get("https://facebook.com");
        
        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        System.out.println("//---------------------------");

        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.techproeducation.com/")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.quit();
    }

    //Go to TechProEducation page
    //test that the page title contains TechPro Education
    //go to facebook page
    //test that the page url contains facebook
    //go back to techpro page
    //Test that you are back
    //close the page

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        driver.get("https://www.techproeducation.com/");

        if (driver.getTitle().contains("TechPro Education")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }

    @Test
    public void slp_R() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.techproeducation.com/");
        driver.get("https://facebook.com");

        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("Test Pasend");
        } else {
            System.out.println("Test Failed");
        }
        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.techproeducation.com/")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();

    }
}
