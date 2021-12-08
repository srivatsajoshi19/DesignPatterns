package proxy;

public class HighResolutionImage  implements Image{
    private String filename;

    public HighResolutionImage(String filename){
        this.filename = filename;
        loadImageFromDisk();
    }
    public void loadImageFromDisk(){
        System.out.println("Loading: "+filename);
    }
    public void displayImage(){
        System.out.println("Displaying Image: "+filename);
    }
}
