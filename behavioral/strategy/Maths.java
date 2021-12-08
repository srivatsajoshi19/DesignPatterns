package strategy;

public class Maths {
    public int num1 = 0;
    public int num2 = 0;

    public Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public int calculate(){
        return strategy.calculate(num1,num2);
    }
}
