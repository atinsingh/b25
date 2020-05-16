public class MacPrinter implements IPrint {
    @Override
    public void print() {
        System.out.println("Printing from Mac");
    }

    @Override
    public void scan() {
        System.out.println("Scanning from Mac");
    }

    @Override
    public void fax() {
        System.out.println("Faxing from mac");
    }

    @Override
    public void copy() {
        System.out.println("Copying from mac");
    }
}
