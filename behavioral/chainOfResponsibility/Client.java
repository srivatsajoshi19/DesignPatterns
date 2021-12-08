package chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        DocumentHandler chain = new SpreadsheetHandler(new SlideshowHandler(new TextHandler(null)));
        chain.openDocument("xlsx");
        chain.openDocument("ppt");
    }
}
