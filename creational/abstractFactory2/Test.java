package abstractFactory2;

public class Test {
    public static void main(String[] args) {
        int objectType = 0;
        InterfaceRender UIObject;

        UIObject = ClsAbstractFactory.getUIObject(objectType);
        UIObject.render();


    }
}
