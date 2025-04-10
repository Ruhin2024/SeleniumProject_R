package day11_cookies_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C04_ActionsTest extends TestBase {
    @Test
    public void test01() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Sayfayı istediğimiz bir miktar aşağıya doğru scroll yapalım
        Actions actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            waitForSecond(1);
        }

        //Sayfayı istediğimiz bir miktar yukarıya doğru scroll yapalım
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            waitForSecond(1);
        }
    }

    @Test
    public void test02() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //sayfanin en sonuna scroll yapiniz
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        waitForSecond(3);

        //sayfanin en basina scroll yapiniz
        actions.sendKeys(Keys.HOME).perform();
    }


    @Test
    public void test03() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Events yazısına kadar scroll yapalım
        WebElement eventsWebElement = driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(eventsWebElement).perform();
    }

    @Test
    public void test04() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //sayfanin en sonuna scroll yapiniz
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,1500).perform();

    }


}