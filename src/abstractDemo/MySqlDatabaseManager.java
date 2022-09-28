package abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void codeType(String message) {
        System.out.println("Database MySQL: " + message);
    }
}
