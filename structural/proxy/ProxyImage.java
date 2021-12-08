package proxy;

public class ProxyImage implements Image{
    private String filename;
    private Image image;


    public ProxyImage(String filename) {
        this.filename = filename;
    }


    public void displayImage() {
        image = new HighResolutionImage(filename);
        image.displayImage();
    }
}
