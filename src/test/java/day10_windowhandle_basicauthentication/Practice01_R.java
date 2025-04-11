package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.List;

public class Practice01_R extends TestBase {

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
        String techproeducationWindowHandels = driver.getWindowHandle();

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandel = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandel = driver.getWindowHandle();

        waitForSecond(2);
        driver.switchTo().window(techproeducationWindowHandels);

        waitForSecond(2);
        driver.switchTo().window(youtubeWindowHandel);

        waitForSecond(2);
        driver.switchTo().window(linkedinWindowHandel);
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
        String techproeducationWindowHandel = driver.getWindowHandle();

        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandel = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandel = driver.getWindowHandle();

        waitForSecond(1);
        driver.switchTo().window(techproeducationWindowHandel);

        waitForSecond(1);
        driver.switchTo().window(youtubeWindowHandel);

        waitForSecond(1);
        driver.switchTo().window(linkedinWindowHandel);
    }
}
