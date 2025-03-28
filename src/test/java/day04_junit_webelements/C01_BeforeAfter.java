package day04_junit_webelements;

import org.junit.jupiter.api.*;

public class C01_BeforeAfter {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll notasyonuna sahip olan bir method classtaki tum test methodlarindan once bir kez calistirilir");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach notasyonuna sahip olan bir method her test methodundan önce bir kez calistirilir");
    }

    @Test
    public void test01() {
        System.out.println("test01 methodu calisti");
    }

    @Test
    public void test02() {
        System.out.println("test02 methodu calisti");
    }

    @Test @Disabled//bir test methodunu devre disi birakmak icin kullanilir
    public void test03() {
        System.out.println("test03 methodu calisti");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach notasyonuna sahip olan bir method her test methodundan sonra bir kez calistirilir");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll notasyonuna sahip olan bir method classtaki tum test methodlarindan sonra bir kez calistirilir");
    }


}