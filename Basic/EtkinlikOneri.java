import java.util.Scanner;

public class EtlinlikOnerme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;

        System.out.println("Sicaklagi girinz: ");
        heat = scanner.nextInt();

        if(heat <5) {
            System.out.println("Arkadaslarinla kayak yapabilirsin!");
        }else if(heat <15) {
            System.out.println("Tam sinemalik hava! Bir Top Gun'a gidilir!");
        }else if(heat <25) {
            System.out.println("Ailenle vakit gecirmeyeli zaman olmussa eger bugun bir piknik yapilir!");
        }else {
            System.out.println("Bugun ya gunese ates edeceksin ya da denize gideceksin baska care yok!!");
        }
    }
}
