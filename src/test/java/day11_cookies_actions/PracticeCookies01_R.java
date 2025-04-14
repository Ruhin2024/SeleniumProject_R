package day11_cookies_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;
import java.util.concurrent.Callable;

public class PracticeCookies01_R extends TestBase {

    @Test
    public void test1() {
        //1-Go to Amazon homepage
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();
        waitForSecond(3);

        //2-print all cookies in the console with a loop
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int counter = 1;
        for (Cookie w : cookieSet){
            System.out.println(counter + "cookie" + w);
            counter++;
        }

        //3-Test that the number of cookies on the page is greater than 5
        int actualSize = cookieSet.size();
        Assertions.assertTrue(actualSize>5);

        //4-Test that the value of the cookie named i18n-prefs is USD
        String actualCookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assertions.assertEquals("USD",actualCookieValue);

        //5-Create a cookie with the name "my favorite cookie" and the value "chocolate" and add it to the page
        Cookie cookie = new Cookie("my favorite cookie","chocolate");
        driver.manage().addCookie(cookie);
        Set<Cookie> cookieSet1 = driver.manage().getCookies();
        int counter2 = 1;
        for (Cookie w : cookieSet1){
            System.out.println(counter2 + " . cookie" + w);
            System.out.println(counter2 + " . cookie" + w.getName());
            System.out.println(counter2 + " . cookie" + w.getValue());
            counter2++;
        }

        //6-Test that the cookie you added has been added to the page
        Assertions.assertTrue(cookieSet.contains(cookie));

        //7-delete the cookie named skin and test whether it is deleted
        driver.manage().deleteCookieNamed("skin");
        Assertions.assertNull(driver.manage().getCookieNamed("skin"));

        //8-delete all cookies and test if they are deleted
        driver.manage().deleteAllCookies();
        cookieSet = driver.manage().getCookies();
        Assertions.assertNull(cookieSet.isEmpty());
    }
}
