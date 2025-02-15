package testNG;

import org.testng.annotations.*;

public class AnnotationsHierarchyExample {

    @Test
    public void test01() {
        System.out.println("I,m Test 01");
    }

    @Test
    public void test02() {
        System.out.println("I,m Test 02");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("I,m Before Method");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("I,m After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I,m Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I,m After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I'm Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I'm After Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I'm Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I'm After Suite");
    }

}

