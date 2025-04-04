package SeleniumDers01; // Java class-ın aid olduğu paket (folder)

import io.github.bonigarcia.wdm.WebDriverManager; // WebDriverManager kitabxanasını import edirik (driver-i avtomatik idarə edir)
import org.junit.jupiter.api.Test; // JUnit 5-in test annotasiyası
import org.openqa.selenium.*; // Selenium WebDriver və onun alt siniflərini import edirik
import org.openqa.selenium.chrome.ChromeDriver; // Chrome üçün driver sinfi
import org.openqa.selenium.interactions.Actions; // Mouse və klaviatura hərəkətləri üçün
import org.openqa.selenium.support.ui.ExpectedConditions; // Gözləmə şərtləri üçün
import org.openqa.selenium.support.ui.WebDriverWait; // Elementlərin yüklənməsini gözləmək üçün

import java.time.Duration; // Gözləmə müddəti üçün
import java.util.List; // Element siyahısı üçün

public class GoogleSearch { // Java class-ımızın adı

    @Test // Bu method test kimi işarələnir
    void searchWorldAndClickFirstImage() { // Test methodumuzun adı

        long startTime = System.currentTimeMillis(); // ⏱ Testin başlanma vaxtını qeyd edirik

        WebDriverManager.chromedriver().setup(); // ✅ WebDriverManager Chrome üçün driver-i avtomatik qurur

        WebDriver driver = new ChromeDriver(); // 🔧 Yeni ChromeDriver browser-i açırıq
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // ⌛ 15 saniyə gözləmə üçün timeout təyin edirik

        try {
            String keyword = "world"; // 🔎 Axtarılacaq söz
            driver.get("https://www.google.com/search?tbm=isch&q=" + keyword); // 🌍 Google-da şəkillər bölməsini açırıq

            // 🍪 Popup çıxarsa onu kliklə
            try {
                WebElement agree = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(text(),'Kabul') or contains(text(),'Ich stimme zu') or contains(text(),'I agree')]")));
                agree.click(); // ➕ "Kabul et" popup-a klikləyirik
            } catch (Exception e) {
                System.out.println("Popup çıxmadı."); // ⚠️ Popup çıxmadısa xəbərdarlıq ver
            }

            // 📷 Bütün şəkil elementlərini tapırıq
            List<WebElement> allImages = wait.until(
                    ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("img")));

            WebElement realImage = null; // 📌 Əsl şəkil üçün dəyişən

            for (WebElement img : allImages) { // 🔁 Bütün tapılmış şəkilləri gəz
                String src = img.getAttribute("src"); // 🔗 Hər bir şəkilin linkini al
                if (src != null && src.startsWith("https") && !src.contains("google")) {
                    realImage = img; // ✅ Google reklam olmayan real şəkili tap
                    break;
                }
            }

            if (realImage != null) { // ✅ Əgər uyğun şəkil tapılıbsa
                String imageUrl = realImage.getAttribute("src"); // 📷 Şəkilin linkini götür

                try {
                    new Actions(driver).moveToElement(realImage).click().perform(); // 🖱 Mouse ilə klik etməyə çalış
                } catch (Exception e) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", realImage); // 🛠 Əgər alınmazsa JavaScript ilə klik et
                }

                System.out.println("✅ İlk uyğun şəkilə klik olundu."); // 🟢 Uğur mesajı
                System.out.println("📷 Şəkilin linki: " + imageUrl); // 🔗 Linki çap et
            } else {
                System.out.println("❌ Uyğun şəkil tapılmadı."); // 🔴 Şəkil tapılmayıbsa mesaj ver
            }

            long endTime = System.currentTimeMillis(); // ⏱ Testin bitmə vaxtı
            System.out.println("✅ Bitdi. Keçən vaxt: " + ((endTime - startTime) / 1000.0) + " saniyə"); // 🕒 Testin nə qədər vaxt apardığını göstər

        } catch (Exception e) {
            System.out.println("❌ Xəta: " + e.getMessage()); // 🔴 Xəta baş verərsə konsola yaz
        } finally {
            driver.quit(); // 🛑 Test bitdikdən sonra browser-i bağla
        }
    }
}
