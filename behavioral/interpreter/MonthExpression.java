package interpreter;

public class MonthExpression extends AbstractExpression {
    @Override
    public void evaluate(Context objContext) {
        String strTemp = objContext.strExpression;
        objContext.strExpression = strTemp.replace("mm", "09");
    }
}
