public abstract class DatabaseProvider extends Person {

    private String data;

    public abstract String getDBType();

    public abstract int getNum();


    public DatabaseProvider() {
    }

    public void insert(){
        if(getDBType().equals("MYSQL")){
            System.out.println("Insert into MYSQL");
        }
        if(getDBType().equals("MONGO")) {
            System.out.println("db.collection.save()");
        }
    }
}
