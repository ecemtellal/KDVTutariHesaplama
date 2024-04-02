import java.util.Scanner;
public class AnaClass {
    public static void main(String[] args) {
        double  kdvsizTutar,kdvTutar, kdvOrani= 0.18, kdvliTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        kdvsizTutar= input.nextDouble();

        kdvOrani=(0 < kdvsizTutar && kdvsizTutar <=1000 )? 0.18:  0.08;

        kdvTutar=kdvOrani*kdvsizTutar;
        kdvliTutar= kdvsizTutar + kdvTutar;

        System.out.println("KDV'siz Tutar:" +kdvsizTutar);
        System.out.println("KDV Tutar:" +kdvTutar);
        System.out.println("KDV'Lİ Tutar:" +kdvliTutar);
        System.out.println("KDV Oranı:" +kdvOrani);


    }
}
