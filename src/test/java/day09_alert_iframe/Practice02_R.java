package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Practice02_R extends TestBase {

    @Test
    public void test1() {
        //https://testcenter.techproeducation.com/index.php?page=iframe webseyfesine get
        //Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin oldugunu test edin
        //Ayrica 'Applications lists' yazisinin sayfada oldugunu test edin
        //sayfada iframe yazısının olduğunu test edin

        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        String actualText = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));

        driver.switchTo().frame(0);
        String actualApplicationsListsText = driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        Assertions.assertEquals("Applications lists",actualApplicationsListsText);

        driver.switchTo().defaultContent();
        String actualIframeText = driver.findElement(By.xpath("//h3")).getText();
        String expectedIframeText = "iframe";
        Assertions.assertEquals(expectedIframeText,actualIframeText);
    }

    @Test
    public void test2() {
        //https://testcenter.techproeducation.com/index.php?page=iframe webseyfesine get
        //Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin oldugunu test edin
        //Ayrica 'Applications lists' yazisinin sayfada oldugunu test edin
        //sayfada iframe yazısının olduğunu test edin

        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        String actualMessageText = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualMessageText.contains("black border"));

        driver.switchTo().frame(0);
        String actualApplicationsListsText = driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        Assertions.assertEquals("Applications lists",actualApplicationsListsText);

        driver.switchTo().defaultContent();
        String actualIframeText = driver.findElement(By.xpath("//h3")).getText();
        String expectedIframeText = "iframe";
        Assertions.assertEquals(expectedIframeText,actualIframeText);
    }
}
