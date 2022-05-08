import java.util.Scanner;

public class HipotenusBulma {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int islem;
        System.out.print("Hipotenus bulmak icin 1\nAlan bulmak icin 2 yazip entera basin");
        islem=scanner.nextInt();
        if(islem==1){
            double birinciKenar,ikinciKenar,hipotenus;


            System.out.print("Birinci Kenari Giriniz: ");
            birinciKenar=scanner.nextDouble();
            System.out.print("Ikinci Kenari Giriniz: ");
            ikinciKenar=scanner.nextDouble();

            double sonuc = (birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar);
            hipotenus = Math.sqrt(sonuc);
            System.out.println("Hiptoneus: "+hipotenus);
        } else if (islem==2) {
            double yukseklik,taban,alan;
            System.out.print("Yukseklik giriniz: ");
            yukseklik = scanner.nextDouble();

            System.out.print("Tabani giriniz: ");
            taban = scanner.nextDouble();

            alan = (taban*yukseklik)/2;
            System.out.println("Alan: "+ alan);
            
        }else {
            System.out.println("Boyle bir islem yok!");
        }

    }
}
