package day06_webelements_xpath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0601_R {
    @Test
    public void test1(){

        //test01
        //go to techproeducation page
        //test that the tag name of the search box is input
        //test that the class attribute value of the search box is form-input

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();
        Assertions.assertEquals(expectedTagName,actualTagName);

        String expectedAttributeValue = "form-input";
        String actualAttributeValue = searchBox.getDomAttribute("class");
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //go to amazon site
        //type qa in the search box
        //test that qa can be successfully typed in the search box
        //close the page

        driver.get("https://amazon.com");
        //--------captcha yi handle etmek icin yazildi--------
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
        //--------captcha yi handle etmek icin yazildi--------

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("qa");
        String actualValue = searchBox.getDomProperty("value");
        Assertions.assertEquals("qa",actualValue);
        driver.quit();
    }

    @Test
    public void test3(){
        //test03
        //go to techproeducation page
        //test that the tag name of the search box is input
        //test that the class attribute value of the search box is form-input
        //close the page

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://techproeducation.com");
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();
        Assertions.assertEquals(expectedTagName,actualTagName);
        String expectedAttributeValue = "form-input";
        String actualAttributeValue = searchBox.getDomAttribute("class");
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);
        driver.quit();
    }

    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to amazon site
        //type qa in the search box
        //test that qa can be successfully typed in the search box
        //close the page

        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("qa");
        String actualValue = searchBox.getDomProperty("value");
        Assertions.assertEquals("qa",actualValue);
        driver.quit();

    }
}
