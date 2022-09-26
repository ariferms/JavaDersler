package polimorphismCreditOfNeed;

public class BaseKrediManager {
    private BaseKrediManager krediType;


    private String standart = "Standart Kredi: ";
    public double hesapla(double tutar){
        System.out.print(this.standart);
        return tutar * 1.18;
    }
}
