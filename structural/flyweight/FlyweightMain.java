package flyweight;

public class FlyweightMain {
    public static void main(String[] args) {


        VariableAddress vaibhav = new VariableAddress("Vaibhav");
        VariableAddress roshan = new VariableAddress("Roshan");
        VariableAddress srivatsa = new VariableAddress("Srivatsa");

        display(vaibhav);
        display(roshan);
        display(srivatsa);
    }
    public static void display(VariableAddress v){
        System.out.println("---------------------------");
        System.out.println(v.getName());
        System.out.println(v.address().buildingNumber);
        System.out.println(v.address().city);
        System.out.println(v.address().pinCode);
        System.out.println(v.address().country);
    }

}
