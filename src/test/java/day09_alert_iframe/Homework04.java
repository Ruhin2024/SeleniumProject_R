package day09_alert_iframe;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Homework04 extends TestBase {
     /*
        //https://html.com/tags/iframe   sayfasina gidiniz
        // sayfada bulunan youtube videosunu baslatiniz
         */

    @Test
    public void test1() {

        driver.get("https://html.com/tags/iframe ");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
    }
}
