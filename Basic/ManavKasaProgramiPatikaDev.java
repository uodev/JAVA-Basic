import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        double toplamTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kac Kilo: ");
        armutKilo = scanner.nextDouble();
        System.out.print("Elma Kac Kilo: ");
        elmaKilo=scanner.nextDouble();
        System.out.print("Domates Kac Kilo: ");
        domatesKilo = scanner.nextDouble();
        System.out.print("Muz Kac Kilo: ");
        muzKilo = scanner.nextDouble();
        System.out.print("Patlican Kac Kilo: ");
        patlicanKilo = scanner.nextDouble();

        toplamTutar = (armut*armutKilo) + (elma*elmaKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo);

        System.out.println("Odenecek Toplam Tutar: " + toplamTutar);
    }
}
