public class AdvanceLearning extends Learning {

    @Override
    public void anyMethod() {
        this.anyMethod();
    }

    public static void main(String[] args) {
        Address adr  = new Address(5380,"Bushelgrove","Mississauga","L5N");
        //Person person = new Person("Ajay", adr);
    }
}
