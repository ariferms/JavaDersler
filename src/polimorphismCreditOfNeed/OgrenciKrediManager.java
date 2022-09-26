package polimorphismCreditOfNeed;

public class OgrenciKrediManager extends BaseKrediManager{
    private String ogrenci = "Öğrenci Kredisi: ";
    public double hesapla(double tutar){
        System.out.print(this.ogrenci);
        return tutar * 1.08;
    }
}
