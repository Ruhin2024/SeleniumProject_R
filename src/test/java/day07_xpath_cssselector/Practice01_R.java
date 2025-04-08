package day07_xpath_cssselector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01_R {

    @Test
    public void test1() {
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
        WebElement buttonDelete = driver.findElement(By.xpath("//button[contains(text(),'Del')]"));
        buttonDelete.click();
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3[contains(text(),'A')]"));
        Assertions.assertTrue(addRemoveElement.isDisplayed());
        //driver.quit();

    }
}
