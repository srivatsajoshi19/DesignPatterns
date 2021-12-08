package chainOfResponsibility;

public class SpreadsheetHandler extends DocumentHandler{

    public SpreadsheetHandler(DocumentHandler next){
        super(next);
    }

    public void openDocument(String fileExtension){
        if(fileExtension.equals("xlsx")){
            System.out.println("Opening SpreadSheet");
        }
        else{
            super.openDocument(fileExtension);
        }
    }
}
