package adapter;

public class DuckSimulator {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();

    }
}

//Output:
// Beep beep beep
//Rotors are spinning
//Taking off
