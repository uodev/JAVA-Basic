import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvlitutar,toplam,kdv;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutari giriniz: ");
        tutar = scanner.nextDouble();
        kdv = tutar < 1000 ? 0.18 : 0.08;
        if(tutar < 1000){
            kdvlitutar=tutar*kdv;
        }
        else {
            kdvlitutar=tutar*kdv;
        }

        toplam = kdvlitutar+tutar;
        System.out.println("Toplam: "+toplam);
    }
}
