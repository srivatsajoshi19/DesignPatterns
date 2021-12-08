package strategy;

public class AddStrategy extends Strategy {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
