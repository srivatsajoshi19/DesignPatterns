package bridge;

public class SwitchClass implements Switch{
    public Equipment equipmentObject;

    public void setEquipmentObject(Equipment equipmentObject){
        this.equipmentObject = equipmentObject;
    }

    public void on(){
        equipmentObject.start();
    }
    public void off(){
        equipmentObject.stop();
    }


}
