package strategy;

public class SubtractStrategy extends Strategy {
    @Override
    public int calculate(int a, int b) {
        return a- b;
    }
}
