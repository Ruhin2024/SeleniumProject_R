package day08_dropdown_testbase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Practice03_R extends TestBase {

    @Test
    public void test1() {
        driver.get("https://google.com");
    }

    @Test
    public void test2() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        waitForSecond(2);
        year.sendKeys("2000");

        waitForSecond(2);
        month.sendKeys("May");

        waitForSecond(2);
        day.sendKeys("18");
    }

}
