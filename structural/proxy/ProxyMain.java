package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1");
        Image image2 = new ProxyImage("image2");

        image1.displayImage();
        image2.displayImage();
    }
}
