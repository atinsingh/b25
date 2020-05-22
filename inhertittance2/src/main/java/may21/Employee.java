package may21;

public class Employee implements ContractEmployee {
    @Override
    public void defineTerm() {

    }

    public String manager(String name){
        return name;
    }

    @Override
    public void terminate() {

    }

    @Override
    public void replace() {

    }

    @Override
    public String hire() {
        return null;
    }
}
