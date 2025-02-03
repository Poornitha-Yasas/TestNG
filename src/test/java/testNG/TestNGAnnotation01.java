package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation01 {
    public static void main(String[] args) {
        System.out.println("This is not a testNG test 01");
    }

    public void notATestNGMethod() {
        System.out.println("This is not a testNG test 02");
    }

    @Test
    public void test(){

    }
}
