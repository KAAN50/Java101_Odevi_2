import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvTutar;
        double kdvliTutar;
        double kdvOran=0.18;
        double kdvOran2=0.8;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Girinzi: ");
        tutar = input.nextDouble();

        if (tutar>= 0 && tutar<=1000)
        {
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
        }
        else
        {
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar +  kdvTutar;
        }

        System.out.println("KDV'li:  "+ kdvliTutar);

        System.out.println("KDV'siz: "+ tutar);
    }
}