package JUnitTest.JUnit;

public class Calculator {

    public static void main(String[] args) {

        Calc c = new Calc();
        System.out.println(c.summ(5,7));
        System.out.println(c.div(10,5));
        System.out.println(c.pow(2,3));
    }



    static class Calc {

        public int summ(int a, int b) {
            return a + b;
        }

        public int div(int a, int b) {
            return a / b;
        }

        public int pow(int a, int b) {
            return (int) Math.pow(a, b);
        }
    }
}
