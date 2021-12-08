package interpreter;

public class DayExpression extends AbstractExpression {

    public void evaluate(Context objContext) {
        String strTemp = objContext.strExpression;
        objContext.strExpression = strTemp.replace("dd", "26");
    }
}
