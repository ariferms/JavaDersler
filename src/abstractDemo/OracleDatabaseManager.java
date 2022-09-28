package abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void codeType(String message) {
        System.out.println("Database Oracle: " + message);
    }
}
