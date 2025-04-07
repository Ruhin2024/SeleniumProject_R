
package day08_dropdown_testbase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C03_TestBaseUsage extends TestBase {


    @Test
    public void test01() {
        driver.get("https://google.com");
    }

    @Test
    public void test02() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        // 1.Method:
        // a. Yil,ay,gün dropdown menu'leri locate ediniz
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));


        waitForSecond(3);
        selectVisible(year, "1999");

        waitForSecond(3);
        selectVisible(month, "May");

        waitForSecond(3);
        selectVisible(day, "19");


    }


}