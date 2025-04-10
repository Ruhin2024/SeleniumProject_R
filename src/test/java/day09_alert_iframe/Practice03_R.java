package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Practice03_R extends TestBase {

    @Test
    public void test1() {

        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        //Bold yazının "Editor" kelimesini içerdiğini doğrulayınız
        //Textboxun icindeki metnin 'Your content goes here.' Oldugunu test edin
        //Sayfadaki "Elemental Selenium" yazısının olduğunu doğrulayınız.

        driver.get("https://the-internet.herokuapp.com/iframe");
        String actualBoldText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertTrue(actualBoldText.contains("Editor"));

        driver.switchTo().frame("mce_0_ifr");
        String actualTextBox = driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
        String expectedTextBox = "Your content goes here.";
        Assertions.assertEquals(expectedTextBox,actualTextBox);

        driver.switchTo().parentFrame();
        String actualElementalSelenium = driver.findElement(By.xpath("//a[.='Elemental Selenium']")).getText();
        String expectedElementalSelenium = "Elemental Selenium";
        Assertions.assertEquals(expectedElementalSelenium,actualElementalSelenium);
    }
}
