import java.util.Scanner;

public class kdv {

    public static void main(String[] args) {

        double tutar,kdvOrani,kdvTutar,kdvliTutar ;
        Scanner input= new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");

        tutar = input.nextDouble();


        if (tutar <=1000)
        {
            kdvOrani = 0.18;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar= tutar + kdvTutar;
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
        else
        {
            kdvOrani = 0.08;
            kdvTutar = tutar * kdvOrani;
            kdvliTutar= tutar + kdvTutar;
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
    }
}