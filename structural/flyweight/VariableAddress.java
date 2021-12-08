package flyweight;

public class VariableAddress {
    public String name;
    public VariableAddress(String name){
        this.name = name;
    }
    public StaticAddress address(){
        return ClsStatic.addressObject;
    }
    public String getName(){
        return name;
    }
}
