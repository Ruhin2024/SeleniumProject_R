package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Practice02_R extends TestBase {

    @Test
    public void test1() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        //Başlığın "TechPro Education" icerdigini doğrulayın
        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        //techproeducation sayfasına geçiniz,
        //youtube sayfasına geçiniz,
        //linkedIn sayfasına geçiniz

        driver.get("https://www.techproeducation.com");

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");

        Set<String> windowHandels = driver.getWindowHandles();
        List<String> window = new ArrayList<>(windowHandels);

        waitForSecond(2);
        driver.switchTo().window(window.get(0));

        waitForSecond(2);
        driver.switchTo().window(window.get(1));

        waitForSecond(2);
        driver.switchTo().window(window.get(2));
    }

    @Test
    public void test2() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        //Başlığın "TechPro Education" icerdigini doğrulayın
        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        //techproeducation sayfasına geçiniz,
        //youtube sayfasına geçiniz,
        //linkedIn sayfasına geçiniz

        driver.get("https://www.techproeducation.com");

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    }

    @Test
    public void test3() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        //Başlığın "TechPro Education" icerdigini doğrulayın
        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        //techproeducation sayfasına geçiniz,
        //youtube sayfasına geçiniz,
        //linkedIn sayfasına geçiniz

        driver.get("https://www.techproeducation.com");

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(" https://www.youtube.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        waitForSecond(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());

    }
}
