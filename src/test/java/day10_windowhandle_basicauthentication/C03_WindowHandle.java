package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class C03_WindowHandle extends TestBase {

    // Go to https://the-internet.herokuapp.com/windows.
    //get the Handle value of the first page and print it
    //test that the text on the first page is "Opening a new window".
    //test that the first page Title is "The Internet".
    // Click the "Click Here" button.
    //test that the second page Title is "New Window".
    // go back to the first page and test that the Title is "The Internet".
    // go to the second page again.
    // go back to the first page.


    @Test
    public void test01() {

        //  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //  ilk sayfasının Handle degerini alın yazdırın
        String ilkSayfaHandleDegeri = driver.getWindowHandle();

        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedText = "Opening a new window";
        Assertions.assertEquals(expectedText, actualText);

        //  ilk sayfa Title'ının "The Internet" oldugunu test edin
        Assertions.assertEquals("The Internet", driver.getTitle());

        //  "Click Here" butonuna tıklayın.
        driver.findElement(By.partialLinkText("Click Her")).click();


        /*
        Handle degeri ilksayfaya esit olmayana gecis yap diyerek kontrolumüz dısında acilan
        pencereye driveri gecis yaptirdik
         */
        Set<String> windows = driver.getWindowHandles();
        for (String w : windows) {
            if (!w.equals(ilkSayfaHandleDegeri)) {
                driver.switchTo().window(w);
            }
        }

        String ikinciSayfaninHandleDegeri = driver.getWindowHandle();

        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
        Assertions.assertEquals("New Window", driver.getTitle());

        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        waitForSecond(3);
        driver.switchTo().window(ilkSayfaHandleDegeri);
        Assertions.assertEquals("The Internet", driver.getTitle());

        //  ikinci sayfaya tekrar geçin.
        waitForSecond(3);
        driver.switchTo().window(ikinciSayfaninHandleDegeri);

        //  ilk sayfaya tekrar dönün.
        waitForSecond(3);
        driver.switchTo().window(ilkSayfaHandleDegeri);


    }

    @Test
    public void test02() {

        //  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //  ilk sayfasının Handle degerini alın yazdırın
        String ilkSayfaHandleDegeri = driver.getWindowHandle();

        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedText = "Opening a new window";
        Assertions.assertEquals(expectedText, actualText);

        //  ilk sayfa Title'ının "The Internet" oldugunu test edin
        Assertions.assertEquals("The Internet", driver.getTitle());

        //  "Click Here" butonuna tıklayın.
        driver.findElement(By.partialLinkText("Click Her")).click();

        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
        switchToWindowByIndex(1);//ikinci sayfaya gecis yaptik
        Assertions.assertEquals("New Window", driver.getTitle());

        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        waitForSecond(3);
        switchToWindowByIndex(0);//index 0 dan baslar, ilk sayfaya gecis yaptik
        Assertions.assertEquals("The Internet", driver.getTitle());

        //  ikinci sayfaya tekrar geçin.
        waitForSecond(3);
        switchToWindowByIndex(1);

        //  ilk sayfaya tekrar dönün.
        waitForSecond(3);
        switchToWindowByIndex(0);
    }
}