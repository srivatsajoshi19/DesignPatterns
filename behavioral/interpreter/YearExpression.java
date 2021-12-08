package interpreter;

public class YearExpression extends AbstractExpression {
    @Override
    public void evaluate(Context objContext) {
        String strTemp = objContext.strExpression;
        objContext.strExpression = strTemp.replace("yyyy", "2021");
    }
}
