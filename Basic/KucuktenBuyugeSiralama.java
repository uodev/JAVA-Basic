import java.util.Scanner;

public class KucuktenBuyugeSiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;

        System.out.println("Birinci sayi: ");
        a = scanner.nextInt();

        System.out.println("Ikinci sayi: ");
        b = scanner.nextInt();

        System.out.println("Ucuncu sayi: ");
        c = scanner.nextInt();

        if(a<b && b<c) {
            System.out.println( "a < b < c" );
        }else if(b<a && a<c) {
            System.out.println("b < a < c");
        }else if (a<c && c<b) {
            System.out.println("a < c < b");
        }else if(b<c && c<a) {
            System.out.println("b < c < a");
        }else if(c<a && a<b){
            System.out.println("c < a < b");
        }else if(c<b && b<a) {
            System.out.println("c < b < a");
        }else {
            System.out.println("Tum sayilar esittir!");
        }

    }

}

