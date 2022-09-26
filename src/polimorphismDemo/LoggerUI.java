package polimorphismDemo;

public class LoggerUI {
    private BaseLogger logger;

    public LoggerUI(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi...");
        this.logger.log("Log mesajı");
    }
}
