package day11_cookies_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class PracticeAction03_R extends TestBase {

    @Test
    public void test1() {

        //Go to Amazon https://www.amazon.com/
        //Go to the "Account & Lists" menu in the upper right section and click on the "Account" option
        //Verify that the title of the opened page contains "Your Account"

        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.navigate().refresh();
        waitForSecond(3);

        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        driver.findElement(By.xpath("//*[.='Account']")).click();

        Assertions.assertEquals("Your Account",driver.getTitle());

    }
}
