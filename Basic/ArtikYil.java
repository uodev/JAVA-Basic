import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yil;

        System.out.println("Yili giriniz: ");
        yil = scanner.nextInt();

        if(yil % 4 == 0 && yil % 100!=0) {
            System.out.println("Artik yildir!");
        }else if(yil % 100==0 && yil %400==0){
            System.out.println("Artik yildir!");
        }
        else{
            System.out.println("Artik yil degildir!");
        }
    }
}
