package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_Iframe extends TestBase {

    //Go to https://the-internet.herokuapp.com/iframe
    //Verify that the bold text contains the word "Editor"
    //Test that the text inside the textbox is 'Your content goes here.'
    //Verify that the text on the page is "Elemental Selenium".


    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Bold yazının "Editor" kelimesini içerdiğini doğrulayınız
        String actualBoldText = driver.findElement(By.tagName("h3")).getText();
        Assertions.assertTrue(actualBoldText.contains("Editor"));

        //Textboxun icindeki metnin 'Your content goes here.' Oldugunu test edin
        driver.switchTo().frame("mce_0_ifr");//id attribute value su ile iframe e gecis yaptik
        String actualTextBox = driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
        String expectedTextBox="Your content goes here.";
        Assertions.assertEquals(expectedTextBox,actualTextBox);

        //Sayfadaki "Elemental Selenium" yazısının olduğunu doğrulayınız.
        driver.switchTo().parentFrame();
        // driver.navigate().refresh();
        // driver.get(driver.getCurrentUrl());

        String actualElementalSeleniumText = driver.findElement(By.xpath("//*[.='Elemental Selenium']")).getText();
        String expectedElementalSeleniumText ="Elemental Selenium";
        Assertions.assertEquals(expectedElementalSeleniumText,actualElementalSeleniumText);
    }
}
        /*
        //https://html.com/tags/iframe   sayfasina gidiniz
        // sayfada bulunan youtube videosunu baslatiniz
         */