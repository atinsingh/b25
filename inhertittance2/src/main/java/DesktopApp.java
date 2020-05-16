
public class DesktopApp implements IDummy, MouseInteractions {
    @Override
    public void dummyDisplay() {
        System.out.println("Dummy Display");
    }

    @Override
    public void singleClick() {
        System.out.println("Single click on the desktop app");
    }

    @Override
    public void rightClick() {
        System.out.println("Right click on desktop");
    }

    public static void main(String[] args) {
        DesktopApp provider = new DesktopApp();
    }
}
