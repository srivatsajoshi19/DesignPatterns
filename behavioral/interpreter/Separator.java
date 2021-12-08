package interpreter;

public class Separator extends AbstractExpression {
    @Override
    public void evaluate(Context objContext) {
        String strTemp = objContext.strExpression;
        objContext.strExpression = strTemp.replace(" " , "-");
    }
}
