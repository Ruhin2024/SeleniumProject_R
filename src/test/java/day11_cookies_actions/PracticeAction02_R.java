package day11_cookies_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class PracticeAction02_R extends TestBase {
    //Go to https://the-internet.herokuapp.com/context_menu
    //Right click on the box
    //Test that the text appearing in Alert is "You selected a context menu"
    //Close the alert by clicking OK


    @Test
    public void test1() {
        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions actions = new Actions(driver);
        WebElement box = driver.findElement(By.id("hot-spot"));
        actions.contextClick(box).perform();

        String expectedResult = "You selected a context menu";
        String actualResult = driver.switchTo().alert().getText();
        Assertions.assertEquals(expectedResult,actualResult);

        driver.switchTo().alert().accept();
    }
}
