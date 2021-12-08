package bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Equipment fan = new Fan();
        Equipment radio = new Radio();
        SwitchClass switchObject = new SwitchClass();
        switchObject.setEquipmentObject(fan);
        switchObject.on();
        switchObject.off();

        switchObject.setEquipmentObject(radio);
        switchObject.on();
        switchObject.off();

    }
}
