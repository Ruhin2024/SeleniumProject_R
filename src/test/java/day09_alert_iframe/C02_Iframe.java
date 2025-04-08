package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C02_Iframe extends TestBase {
    /*
       Bir HTML dökümanının içine yerleştirilmiş başka bir HTML dökümanına inline Frame(iframe) denir.
   Sayfadaki bir webelementi locate ettiğimizde nosuchelementexception alıyorsak önce locate'i kontrol ederiz,
   ve yine aynı hatayı alıyorsak locate etmek istediğimiz webelement iframe içinde olabilir.
   Dolayısıyla iframe içindeki bir webelementi locate etmek için driver'imizi iframe geçirmemiz gerekir.

       3 yöntem ile Iframe'e geçiş yapabiliriz.

       1) driver.switchTo.frame(sayfadaki iframe'in Index'i(index 0'dan başlar))
       2) driver.switchTo.frame(<iframe> tag'ındaki id/name attribute değeri)
       3) driver.switchTo.frame(iframe'in locate'i)

   Tekrar ana sayfaya geçmek istersek
     a) defaultContent() methodu ile iframe'den çıkıp anasayfaya geçeriz.
     b) Eğer içi içe iframe'lere geçiş yaptıysak ve bir üst frame tekrar driver'i taşımak istersek
     parentFrame() methodu ile bir üst frame'e geçiş yapabiliriz.
    */


    //https://testcenter.techproeducation.com/index.php?page=iframe
    //Test that the text 'An iframe with a thin black border:' on the home page contains 'black border'
    //Also test that the text 'Applications lists' is on the page
    //Test that there is an iframe text in the page


    @Test
    public void test01() {
        //https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin oldugunu test edin
        String actualText = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));

        driver.switchTo().frame(0);//index 0 dan baslar, birinci iframe e gecis yaptik

        //Ayrica 'Applications lists' yazisinin sayfada oldugunu test edin
        String actualApplicationsListsText = driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        Assertions.assertEquals("Applications lists",actualApplicationsListsText);

        //sayfada iframe yazısının olduğunu test edin

        driver.switchTo().defaultContent();

        String actualIframeText = driver.findElement(By.tagName("h3")).getText();
        String expectedIframeText="iframe";
        Assertions.assertEquals(expectedIframeText,actualIframeText);

    }
}