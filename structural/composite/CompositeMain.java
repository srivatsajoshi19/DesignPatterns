package composite;

import java.util.ArrayList;

public class CompositeMain {
    public static void main(String[] args) {
        ArrayList<IUserInterface> list = new ArrayList<>();
        IUserInterface circle = new Circle();
        IUserInterface line = new Line();
        IUserInterface square = new Square();

        list.add(circle);
        list.add(line);
        list.add(square);

        for(IUserInterface item: list){
            item.draw();
        }


    }
}

//output
//Draw a cicle
//Draw a Line
//Draw a Square