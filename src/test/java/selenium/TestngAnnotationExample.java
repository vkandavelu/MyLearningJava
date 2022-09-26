package selenium;

import org.testng.annotations.*;

public class TestngAnnotationExample {


    @BeforeMethod
    void bT()
    {
        System.out.println("Before test");
    }
    @Test
    void m1()
    {
        System.out.println("m1");
    }

    @Test(dependsOnMethods={"m1"})
    void m2()
    {
        System.out.println("m2");
    }

    @AfterMethod
   void aT()
    {
        System.out.println("After test");
    }
}
