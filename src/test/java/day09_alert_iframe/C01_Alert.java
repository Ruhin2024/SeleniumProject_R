package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_Alert extends TestBase {
    /*
    Eğer bir sayfadaki bir butona tikladiktan sonra bir alert cikiyorsa ve bu cikan
    pencereye sag tiklayip locate alamiyorsak bu bir JS Alert tür

    ==>JS Alert ü handle edebilmek icin driver imizi o pencereye gecis yaptirmamiz gerekir
    =>Bunun icin driver objectimiz üzerinden switchTo() methoduyla alert() methodunu secerek
    js alert e gecis yapmis oluruz
    ==> accept () (onaylar) yada dissmis()(iptal eder) methodlariyla alertü onaylar yada iptal ederek kapatabiliriz
     */

    //   https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
    @Test
    public void acceptAlert() {
        //Bir metod olusturun: acceptAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //birinci butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        waitForSecond(3);
        //uyarıdaki OK butonuna tıklayın
        driver.switchTo()//gecis methodu
                .alert()//driverimizi alerte gecis yaptirdik
                .accept();// alertü onayladik

        //result mesajının  "You successfully clicked an alert" oldugunu test edin.
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        String expecatedResultMessage = "You successfully clicked an alert";
        Assertions.assertEquals(expecatedResultMessage, actualResultMessage);
    }

    @Test
    public void dismissAlert() {
        //Bir metod olusturun: dismissAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        // ikinci butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        // uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();//alerte gecis yaparak iptal tusuna bastik

        // result mesajının "successfuly" icermedigini test edin.
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertFalse(actualResultMessage.contains("successfuly"));
    }

    @Test
    public void sendKeysAlert() {
        //Bir metod olusturun: sendKeysAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //ucuncu butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        waitForSecond(2);
        //uyarıdaki  metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("mehmet");

        //OK butonuna tıklayın
        driver.switchTo().alert().accept();

        //result mesajında isminizin görüntülendiğini doğrulayın.
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertTrue(actualResultMessage.contains("mehmet"));

    }


}