package abstractFactory2;

public abstract class ClsAbstractFactory {
        public static InterfaceRender getUIObject(int objectType){
            if(objectType == 1){
                return ClsButtonFactory.getButtonObject();
            }
            return ClsTextBoxFactory.getTextBoxObject();
        }
}

