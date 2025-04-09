package day10_windowhandle_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C01_WindowHandle extends TestBase {

    /*
    1- driver.switchTo().newWindow(WindowType.Window)==>Yeni bir pencere acar ve driveri bu yeni acilan pencereye gecirir
    2- driver.switchTo().newWindow(WindowType.Tab)==>Yeni bir SEKME acar ve driveri bu yeni acilan SEKMEYE gecirir
    3- driver.switchTo().window(Window handle degeri)==> Mevcut acik olan bir pencereye gecis yapmak icin o pencerenin parantez icinde handle degerini vermeliyiz
     */
    //On Windows 1, go to https://www.techproeducation.com
    //Verify that the title contains "TechPro Education"
    //Open https://www.youtube.com in Windows 2 (in a new window)
    //In Windows 3 (in a new window), open https://www.linkedin.com:
    //Go to the techproeducation page,
    //go to youtube page,
    //Go to LinkedIn page

    @Test
    public void test01() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //techproeducation sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(techproWindowHandle);

        //youtube sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(youtubeWindowHandle);

        //linkedIn sayfasına geçiniz
        waitForSecond(2);
        driver.switchTo().window(linkedinWindowHandle);

    }


    @Test
    public void test02() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //techproeducation sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(techproWindowHandle);

        //youtube sayfasına geçiniz,
        waitForSecond(2);
        driver.switchTo().window(youtubeWindowHandle);

        //linkedIn sayfasına geçiniz
        waitForSecond(2);
        driver.switchTo().window(linkedinWindowHandle);

    }







}