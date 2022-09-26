package polimorphismCreditOfNeed;

public class OgretmenKrediManager extends BaseKrediManager{
    private String ogretmen = "Öğretmen Kredisi: ";
    public double hesapla(double tutar){
        System.out.print(this.ogretmen);
        return tutar * 1.12;
    }
}
