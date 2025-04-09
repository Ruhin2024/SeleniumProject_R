package day07_xpath_cssselector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice04_R {

    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        //Delete tusuna basin
        deleteButton.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        driver.findElement(By.cssSelector("h3"));
        WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveElements.isDisplayed());
        //sayfayı kapatınız
        driver.quit();
    }

    @Test
    public void test2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        //Delete tusuna basin
        deleteButton.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        driver.findElement(By.cssSelector("h3"));
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveElement.isDisplayed());
        //sayfayı kapatınız
        //driver.quit();

    }
}
