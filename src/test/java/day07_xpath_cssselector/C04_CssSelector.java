package day07_xpath_cssselector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    /*
    SYNTAX:
    1) tagName [ attributeName = 'attributeValue' ]
    2) Eger id ile css locate almak isterseniz #idAttriubuteDegeri
    3) Eger class ile css locate almak isterseniz .classAttributeDegeri

    X Path ile CSS SELECTOR arasindaki farklar

    1- XPath ile bir webelemeneti sadece text i ile locate edebiliriz
        Ama CSS Selector ile bunu yapamayiz

    2- XPath ile bir webelementi sadece index belirterek teke indirgeyebiliriz
        Ama Css Selector ile index kullanamayiz

    3- CSS Selector XPatha göre daha HIZLIDIR.

    4- Syntax olarak farklar var.(//, @)
     */

    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        //Delete butonu'nun gorunur oldugunu test edin
        //Delete tusuna basin
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        //sayfayı kapatınız

        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        deleteButton.click();
        driver.findElement(By.cssSelector("h3"));
        WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveElements.isDisplayed());
        driver.quit();
    }
}