import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1,n2,select;

        System.out.println("Ilk sayiyi giriniz: ");
        n1 = scanner.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("Yapicalak islemi seciniz!\n1-)Toplama\n2-)Cikarma\n3-)Carpma\n4-)Bolme\n");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Sonuc: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Sonuc: "+ (n1*n2));
                break;
            case 4:
                System.out.println("Sonuc: "+ (n1/n2));
                break;
            default:
                System.out.println("Boyle bir islem secenegi yoktur!");
                break;
        }

    }


}
