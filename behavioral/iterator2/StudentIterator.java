package iterator2;

import java.util.ArrayList;
import java.util.List;

public class StudentIterator {
    private int currIndex = 0;

    private List<Student> objList = new ArrayList<Student>();

    public void addItems(){
        Student item1 = new Student("Srivatsa", 1);
        Student item2 = new Student("Roshan", 2);
        Student item3 = new Student("Vaibhav", 3);
        objList.add(item1);
        objList.add(item2);
        objList.add(item3);
    }

    public Student getByIndex(int index){
        if(index > objList.size() || index <0){
            System.out.println("Invalid index");
        }
        currIndex = index;
        return objList.get(index);

    }

    public Student prev(){
        int temp = currIndex;
        temp--;
        return objList.get(temp);
    }
    public Student next(){
        int temp = currIndex;
        temp++;
        return objList.get(temp);
    }
    public Student getFirst(){
        return objList.get(0);
    }
    public  Student getLast(){
        return objList.get(objList.size()-1);
    }
}
