package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.Set;

public class Practice03_R extends TestBase {

    @Test
    public void test1() {

        //  https://the-internet.herokuapp.com/windows adresine gidin.
        //  ilk sayfasının Handle degerini alın yazdırın
        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        //  ilk sayfa Title'ının "The Internet" oldugunu test edin
        //  "Click Here" butonuna tıklayın.
        /*
        Handle degeri ilksayfaya esit olmayana gecis yap diyerek kontrolumüz dısında acilan
        pencereye driveri gecis yaptirdik
         */
        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        //  ikinci sayfaya tekrar geçin.
        //  ilk sayfaya tekrar dönün.

        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandeleDegeri = driver.getWindowHandle();

        String expectedText = "Opening a new window";
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals(expectedText,actualText);

       Assertions.assertTrue(driver.getTitle().contains("The Internet"));

       driver.findElement(By.partialLinkText("Click Here")).click();

       Set<String> windows = driver.getWindowHandles();
        for (String w : windows) {
            if (!w.equals(ilkSayfaHandeleDegeri)){
                driver.switchTo().window(w);
            }
        }

        String ikinciSayfaHandeleDegeri = driver.getWindowHandle();

        driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(driver.getTitle().contains("New Window"));

       driver.switchTo().window(ilkSayfaHandeleDegeri);
       Assertions.assertTrue(driver.getTitle().contains("The Internet"));

       waitForSecond(3);
       driver.switchTo().window(ikinciSayfaHandeleDegeri);

       waitForSecond(3);
       driver.switchTo().window(ilkSayfaHandeleDegeri);
    }

    @Test
    public void test2() {
        //  https://the-internet.herokuapp.com/windows adresine gidin.
        //  ilk sayfasının Handle degerini alın yazdırın
        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        //  ilk sayfa Title'ının "The Internet" oldugunu test edin
        //  "Click Here" butonuna tıklayın.
        /*
        Handle degeri ilksayfaya esit olmayana gecis yap diyerek kontrolumüz dısında acilan
        pencereye driveri gecis yaptirdik
         */
        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        //  ikinci sayfaya tekrar geçin.
        //  ilk sayfaya tekrar dönün.

        driver.get("https://the-internet.herokuapp.com/windows");

        String ilkSayfaHandeleDegeri = driver.getWindowHandle();

        String expectedTex = "Opening a new window";
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals(expectedTex,actualText);

        Assertions.assertTrue(driver.getTitle().contains("The Internet"));

        driver.findElement(By.partialLinkText("Click Here")).click();

        String ikinciSayfaHandeleDegeri = driver.getWindowHandle();
        switchToWindowByIndex(1);
        Assertions.assertEquals("New Window",driver.getTitle());

        switchToWindowByIndex(0);
        Assertions.assertEquals("The Internet",driver.getTitle());

        waitForSecond(2);
        switchToWindowByIndex(1);

        waitForSecond(2);
        switchToWindowByIndex(0);
    }
}
