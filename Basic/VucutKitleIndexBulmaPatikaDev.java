import java.util.Scanner;

public class VucutKitleIndex {

    public static void main(String[] args) {
        double boy;
        double kilo;

        double index;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu Girin(Metre Cinsinden virgulle ayirin): ");
        boy= scanner.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = scanner.nextDouble();

        index = kilo / boy*boy;

        System.out.println("Vucut Kitle Indexiniz: "+ index);

    }
}
