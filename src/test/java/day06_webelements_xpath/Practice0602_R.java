package day06_webelements_xpath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice0602_R {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Go to https://testcenter.techproeducation.com/index.php
        //Test whether the "Back to TechProEducation.com" button is enabled for user access
        // Test whether the "Applications lists" title is visible by locating it with the tagname

        driver.get("https://testcenter.techproeducation.com/index.php");
        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation"));
        Assertions.assertTrue(backToButton.isDisplayed());

        WebElement applicationsListText = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsListText.isDisplayed());
        driver.quit();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Go to https://testcenter.techproeducation.com/index.php
        //Test whether the "Back to TechProEducation.com" button is enabled for user access
        // Test whether the "Applications lists" title is visible by locating it with the tagname

        driver.get("https://testcenter.techproeducation.com/index.php");
        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isDisplayed());
        WebElement applicationsListVisible = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsListVisible.isDisplayed());
        driver.quit();
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Go to https://testcenter.techproeducation.com/index.php
        //Test whether the "Back to TechProEducation.com" button is enabled for user access
        // Test whether the "Applications lists" title is visible by locating it with the tagname

        driver.get("https://testcenter.techproeducation.com/index.php");
        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation"));
        Assertions.assertTrue(backToButton.isDisplayed());
        WebElement applicationsListVisible = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsListVisible.isDisplayed());
        driver.quit();
    }
}
