import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        int quiz,vize,sonSinav;
        double ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quiz notunuzu giriniz: ");
        quiz = scanner.nextInt();
        System.out.print("Vize notunu giriniz: ");
        vize = scanner.nextInt();
        System.out.print("Final notunu giriniz: ");
        sonSinav = scanner.nextInt();

        ortalama = (quiz*0.35)+(vize*0.45)+(sonSinav*0.5)/3;
        System.out.println("Ortalaman: "+ ortalama);
        String sonuc = (ortalama >=60?"Gectiniz" : "Kaldiniz");
        System.out.println(sonuc);
    }
}
