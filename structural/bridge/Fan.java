package bridge;

public class Fan implements Equipment{
    public void start(){
        System.out.println("Fan started");
    }
    public void stop(){
        System.out.println("Fan stopped");
    }
}
