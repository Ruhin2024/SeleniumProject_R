package day09_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Tekrar_R extends TestBase {

    @Test
    public void acceptAlert() {
        //   https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        //Bir metod olusturun: acceptAlert
        //birinci butona tıklayın,
        //uyarıdaki OK butonuna tıklayın
        //result mesajının  "You successfully clicked an alert" oldugunu test edin.

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        String expectedResultMessage = "You successfully clicked an alert";
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertEquals(expectedResultMessage,actualResultMessage);
    }

    @Test
    public void dismissAlert() {
        //Bir metod olusturun: dismissAlert
        // ikinci butona tıklayın,
        // uyarıdaki Cancel butonuna tıklayın
        // result mesajının "successfuly" icermedigini test edin.

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        waitForSecond(3);
        String actualResaltMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertFalse(actualResaltMessage.contains("successfuly"));
    }

    @Test
    public void sendKeysAlert() {
        //Bir metod olusturun: sendKeysAlert
        // ucuncu butona tıklayın,
        // uyarıdaki  metin kutusuna isminizi yazin,
        // OK butonuna tıklayın
        // result mesajında isminizin görüntülendiğini doğrulayın.

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        waitForSecond(3);
        driver.switchTo().alert().sendKeys("Ruhin Valiyev");
        driver.switchTo().alert().accept();
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertTrue(actualResultMessage.contains("Ruhin Valiyev"));

    }
}
