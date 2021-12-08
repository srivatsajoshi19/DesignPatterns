package iterator2;

public class IteratorMain {
    public static void main(String[] args) {
        StudentIterator studentIterator = new StudentIterator();
        studentIterator.addItems();
        display(studentIterator.getByIndex(2));
        display(studentIterator.getFirst());

    }

    public static void display(Student student){
        System.out.println(student.name + " " + student.id);
    }
}
