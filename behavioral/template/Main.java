package template;

public class Main {

  public static void main(String[] args) {
    VegetarianPizza vegetarian = new VegetarianPizza();
    vegetarian.makeBase();
    vegetarian.addToppings();
    vegetarian.cook();

    System.out.println();

    MeatPizza meatFeast = new MeatPizza();
    meatFeast.makeBase();
    meatFeast.addToppings();
    meatFeast.cook();
  }

}
