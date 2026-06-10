interface Document{
    void open();
}
class WordDocument implements Document{
    public void open(){
        System.out.print("Openeing Word Document");
    }
}
class PdfDocument implements Document{
    public void open(){
        System.out.print("Opening Pdf Document");
    }
}
class ExcelDocument implements Document{
    public void open(){
        System.out.print("Opening Excel Document");
    }
}
abstract class DocumentFactory{
    abstract Document createDocument();
}
class WordFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
class PdfFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}