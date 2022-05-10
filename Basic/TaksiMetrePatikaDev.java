import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args) {
        double kmBasina = 2.20;
        double minOdenecek = 20.0;
        double odenecekTutar;

        double gidilenYol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen km: ");
        gidilenYol = scanner.nextDouble();

        odenecekTutar = kmBasina*gidilenYol;
        if (odenecekTutar < minOdenecek) {
            odenecekTutar = minOdenecek;
            System.out.println("Tutar: " + odenecekTutar);
        }else {
            System.out.println("Tutat: "+ odenecekTutar);
        }
    }
}
