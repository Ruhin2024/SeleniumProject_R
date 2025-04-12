package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Practice04_R extends TestBase {

    @Test
    public void test1() {
        //Aşağıdaki bilgileri kullanarak authentication yapınız:

        //    Url: https://the-internet.herokuapp.com/basic_auth
        //    Username: admin
        //    Password: admin
        //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
        //Elemental Selenium linkine tıklayınız
        //Başlığın Elemental Selenium içerdiğini test edelim

        driver.get("https://the-internet.herokuapp.com/basic_auth");

        String expectedText = "Congratulations! You must have the proper credentials.";
        String actualText = driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals(expectedText,actualText);

        driver.findElement(By.partialLinkText("Elemental Selenium")).click();

        switchToWindowByIndex(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }

    @Test
    public void test2() {
        //Aşağıdaki bilgileri kullanarak authentication yapınız:

        //    Url: https://the-internet.herokuapp.com/basic_auth
        //    Username: admin
        //    Password: admin
        //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
        //Elemental Selenium linkine tıklayınız
        //Başlığın Elemental Selenium içerdiğini test edelim

        driver.get("https://the-internet.herokuapp.com/basic_auth");

        String expectedText = "Congratulations! You must have the proper credentials.";
        String actualText = driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals(expectedText,actualText);

        driver.findElement(By.partialLinkText("Elemental Selenium")).click();

        switchToWindowByIndex(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));

    }
}
