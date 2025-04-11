package day12_actions_faker_files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_FilesExists {

    @Test
    public void test01() {
        /*
        Bilgisayarimizdaki herhangi bir dosyanin varligini test edebilmek icin;
        1- Oncelikle varligini test etmek istedigimiz dosyanin yoluna ihtiyacimiz var, ama (C:\Users\mua\Downloads\logo.png)
        bu sekilde hard code olarak yazarsak bu pathn sadece benim bilgisayarimda gecerli olur,
        Ayrica stringler case sensitivedir, bu ifadeyi yazarken değisiklik yapmamaliyiz. pathi oldugu gibi herhangi bir string
        manipulation yapmadan oldugu gibi vermeliyiz
        2)Pathi dynamic olarak herkesin bilgisarinda calisabilmesi icin uygun bir formata getirmeliyiz
        Dynamic hale getirebilmek icin komutlarimiz:
            a) System.getProperty("user.home") ==> bilgisayarimizda bulunan home directory i verir(C:\Users\mua)
            b) System.getProperty("user.dir") ==> current working directory yi verir, yani javanin suanda calistigi dizini verir
         */

        boolean dosyaVarmi =Files.exists(Paths.get("C:\\Users\\mua\\ownloads\\logo.png"));
        System.out.println("dosyaVarmi = " + dosyaVarmi);
        System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));

        //C:\Users\tgbrk\Downloads\logo.png
        //C:\Users\ROOT\Downloads\logo.png
        //C:\Users\Elise\Downloads\logo.png
        //C:\Users\mua\Downloads\logo.png

        String dynamicPath = System.getProperty("user.home") + "\\Downloads\\logo.png";
        Assertions.assertTrue(Files.exists(Paths.get(dynamicPath)));

    }
}