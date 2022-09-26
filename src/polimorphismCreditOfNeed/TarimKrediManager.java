package polimorphismCreditOfNeed;

public class TarimKrediManager extends BaseKrediManager{
    private String tarim = "Tarım Kredisi: ";
    public double hesapla(double tutar){
        System.out.print(this.tarim);
        return tutar * 1.10;
    }
}
