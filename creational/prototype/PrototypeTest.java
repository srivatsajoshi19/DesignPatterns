package prototype;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args){
        Employees emps = new Employees();
        emps.loadData();


        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Carl");
        List<String> list1 = empsNew1.getEmpList();
        list1.add("Raj");


        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}
