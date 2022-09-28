package abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void codeType(String message) {
        System.out.println("Database SQL Server: " + message);
    }
}
