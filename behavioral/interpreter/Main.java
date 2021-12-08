package interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context("dd mm yyyy");
        String a[] = context.strExpression.split(" ");
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        for(String str: a){
            if(str.equals("dd")){
                list.add(new DayExpression());
            }
            else if(str.equals("mm")){
                list.add(new MonthExpression());
            }
            else if(str.equals("yyyy")){
                list.add(new YearExpression());
            }
        }
        list.add(new Separator());
        for(AbstractExpression abs: list){
            abs.evaluate(context);
        }
        System.out.println(context.strExpression);

    }
}
