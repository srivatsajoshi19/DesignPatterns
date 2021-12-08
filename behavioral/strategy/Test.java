package strategy;

public class Test {
    public static void main(String[] args) {
        Maths maths = new Maths();
        maths.num1 = 5;
        maths.num2 = 18;

        maths.setStrategy(new AddStrategy());
        System.out.println(maths.calculate());
    }
}
