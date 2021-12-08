package abstractFactory2;

public class ClsButtonFactory extends ClsAbstractFactory {
    public static InterfaceRender getButtonObject() {
        return new ClsButton();
    }
}

