package abstractFactory2;

public class ClsTextBoxFactory extends  ClsAbstractFactory{

    public static InterfaceRender getTextBoxObject(){
        return new ClsTextBox();
    }
}
