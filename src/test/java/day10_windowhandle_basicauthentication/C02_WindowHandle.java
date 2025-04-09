package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C02_WindowHandle extends TestBase {


    @Test
    public void test01() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        /*
       Açılmış olan tüm pencerelerin window handle degerlerini getWindowHandles() methodu ile aldik.
       Bu method bir Set return eder, ancak setler de index kullanarak istedigimiz bir elemani secmek mümkün degildir
       bu nedenle bizde bu seti kullanarak bir tane List olusturduk.
       List lerde get methodu sayesinde index ile istediğimiz pencereye çok rahat geçişler yapabiliriz
        */

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        //techproeducation sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(windows.get(0));
        //youtube sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(windows.get(1));
        //linkedIn sayfasına geçiniz
        waitForSecond(2);
        driver.switchTo().window(windows.get(2));
    }

    @Test
    public void test02() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        //techproeducation sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        //youtube sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        //linkedIn sayfasına geçiniz
        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    }


}