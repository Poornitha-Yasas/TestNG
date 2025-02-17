package testNG.listners;

import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ListenersTest {

    @Test
    public void test1() {
        System.out.println("I,m Inside testMethod1");
    }

    @Test
    public void test2() {
        System.out.println("I,m Inside testMethod2");
    }

    @Test
    public void test3() {
        System.out.println("I,m Inside testMethod3");
    }

    @Test
    public void test4() {
        System.out.println("I,m Inside testMethod4");
    }

}
