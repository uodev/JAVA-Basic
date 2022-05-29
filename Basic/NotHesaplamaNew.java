import java.util.Scanner;

public class NotHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematikNot, fizikNot, turkeNot, kimyaNot, muzikNot;
        double ortalama;

        System.out.println("Matematik Notu: ");
        matematikNot = scanner.nextInt();

        System.out.println("Fizik Notu: ");
        fizikNot = scanner.nextInt();

        System.out.println("Turkce Notu: ");
        turkeNot = scanner.nextInt();

        System.out.println("Kimya Notu: ");
        kimyaNot = scanner.nextInt();

        System.out.println("Muzik Notu: ");
        muzikNot = scanner.nextInt();

        if(matematikNot>=0&&matematikNot <= 100 && fizikNot>=0 && fizikNot<=100 & turkeNot>=0 && turkeNot<= 100 && kimyaNot>=0 && kimyaNot<=100&&muzikNot>=0 && muzikNot<=100) {
            ortalama = (matematikNot+fizikNot+turkeNot+kimyaNot+muzikNot) / 5;
            if(ortalama>=55){
                System.out.println("Ortalama: " + ortalama);
                System.out.println("Gectiniz...");
            }else {
                System.out.println("Ortalama: " + ortalama);
                System.out.println("Kaldiniz...");
            }
        }
        else {
            System.out.println("Gecersiz not girildi!");
        }
    }
}
