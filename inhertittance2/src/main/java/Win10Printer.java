public class Win10Printer implements IPrint {
    @Override
    public void print() {
        System.out.println("Printing from Win10");
    }

    @Override
    public void scan() {
        System.out.println("Scanning from Win10");
    }

    @Override
    public void fax() {
        System.out.println("Faxing from Win10");
    }

    @Override
    public void copy() {
        System.out.println("Copying from Win10");
    }
}
