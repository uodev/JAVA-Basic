import java.util.Scanner;

public class CemberAlanCevreBulma {


    public static void main(String[] args) {
        double pi = 3.14;
        double yariCap;
        double merkezAci;
        double cemberAlan;
        double cemberCevre;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaricapi giriniz: ");
        yariCap = scanner.nextDouble();

        System.out.print("Merkez Aci giriniz: ");
        merkezAci = scanner.nextDouble();

        cemberAlan = pi*yariCap*yariCap;
        cemberCevre = 2*pi*yariCap;

        double digerAlan = (pi*(yariCap*yariCap) * merkezAci ) /360;

        System.out.println("Cember Cevre: " + cemberCevre);
        System.out.println("Cember Alan: " + cemberAlan);
        System.out.println("Merkez Acili Alan: " + digerAlan);


    }
}


