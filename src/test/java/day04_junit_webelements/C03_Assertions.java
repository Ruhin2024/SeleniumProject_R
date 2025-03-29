package day04_junit_webelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C03_Assertions {

      /*
    Junit 4 te assertion yapmak icin Assert classini kullaniyoruz
    Junit 5 te assertion yapmak icin Assertions classini kullaniyoruz
     */

    @Test
    public void test1() {
        String expectedData = "Junit4";
        String actualData = "Junit5";
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    public void test2() {
        Assertions.assertTrue("junit".contains("U")); //False olar yeni Xetaaa.
    }

    @Test
    public void test3() {
       Assertions.assertFalse("Junit".contains("U"));
    }

    @Test
    public void test4() {
        String expectedData = "Junit4";
        String actualData = "Junit5";
        Assertions.assertNotEquals(expectedData,actualData);
    }

    @Test
    public void test5() {
        //Nott iki Arrayin ayni olmasi ucun indexde eynilik mutleqdir.
        char[] expectedArray = {'j','a','v','a'};
        char[] actualArray = {'j','a','n','a'};
        Assertions.assertArrayEquals(expectedArray,actualArray);//Xeta
    }

    @Test
    public void test6() {
        //Assertions.assertNull(str); morterzede deger null ise gecer yoxsa qalacaq
       String str = "null";
       Assertions.assertNull(str);
    }

    @Test
    public void test7() {
        String str = "junit";
        Assertions.assertNotNull(str);
    }
}
