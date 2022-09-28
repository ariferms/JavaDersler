package abstractDemo;

public class CustomerManager1 {
    public void addData(){
        System.out.println("Veri girişi yapıldı...");
        BaseDatabaseManager databaseManager;
        databaseManager = new SqlServerDatabaseManager();
        databaseManager.codeType("Veri girişi yapıldı...");
    }
}
