public class PrinterManager {
    private int counter;
    public void print(IPrint obj){
        counter++;
        obj.print();
    }
}
