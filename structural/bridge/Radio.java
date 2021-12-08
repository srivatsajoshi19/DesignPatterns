package bridge;

public class Radio implements Equipment{
    public void start(){
        System.out.println("Radio Started");
    }
    public void stop(){
        System.out.println("Radio Stopped");
    }
}
