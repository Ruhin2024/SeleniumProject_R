package day07_xpath_cssselector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XpathClassWork {

    //Go to https://the-internet.herokuapp.com/add_remove_elements/
    //Press the Add Element button
    //Test that the delete button is visible
    //press the delete key
    //Test that the "Add/Remove Elements" text is visible
    //close the page

    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //Add Element butonuna basin
        //Delete butonu'nun gorunur oldugunu test edin
        //Delete tusuna basin
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        //sayfayi kapatin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        deleteButton.click();
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3[contains(text(),'A')]"));
        Assertions.assertTrue(addRemoveElement.isDisplayed());
        driver.quit();
    }
}