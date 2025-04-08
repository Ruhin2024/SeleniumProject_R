package day07_xpath_cssselector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice02_R {

    @Test
    public void testP1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to the given web page. https://the-internet.herokuapp.com/checkboxes
        // Locate checkbox1 and checkbox2 elements.
        // If Checkbox1 is not selected, click the checkbox
        // If Checkbox2 is not selected, click the checkbox
        // Close the page

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }
        driver.quit();
    }

    @Test
    public void testP2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Go to the given web page. https://the-internet.herokuapp.com/checkboxes
        // Locate checkbox1 and checkbox2 elements.
        // If Checkbox1 is not selected, click the checkbox
        // If Checkbox2 is not selected, click the checkbox
        // Close the page

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        if (checkbox2.isSelected()){
            checkbox2.click();
        }
        driver.quit();

    }

}
