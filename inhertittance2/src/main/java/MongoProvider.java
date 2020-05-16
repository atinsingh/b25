public class MongoProvider extends DatabaseProvider {
    @Override
    public String getDBType() {
        return "MYSQL";
    }

    @Override
    public int getNum() {
        return 0;
    }
}
