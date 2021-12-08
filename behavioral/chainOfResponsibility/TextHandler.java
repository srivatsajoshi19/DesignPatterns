package chainOfResponsibility;

public class TextHandler extends DocumentHandler{

    public TextHandler(DocumentHandler next){
        super(next);
    }
    public void openDocument(String fileExtension){
        if(fileExtension.equals("txt")){
            System.out.println("Opening text document");
        }
        else{
            super.openDocument(fileExtension);
        }
    }
}
