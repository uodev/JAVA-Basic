import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dbkadi="test",dbsifre="12345";
        String kadi="",sifre="";
        String secenek;

        System.out.println("Kullanici Adi: ");
        kadi = scanner.nextLine();

        System.out.println("Sifre: ");
        sifre = scanner.nextLine();
        System.out.println(sifre + " "+kadi);

        if(kadi.equals(dbkadi.toString())&& sifre.equals(dbsifre.toString())) {
            System.out.println("Giris basarili");
        }
        else if(kadi.equals(dbkadi.toString()) && !sifre.equals(dbsifre.toString())){
            System.out.println("Sifre hatali!");
            System.out.println("Yeni sifre olusturmak icin evet, cikis yapmak icin hayir yaziniz: ");
            secenek = scanner.nextLine();
            if(secenek.equals("evet")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                sifre = scanner.nextLine();
                if(sifre.equals(dbsifre.toString())) {
                    System.out.println("Yeni sifre eski sifreyle ayni olamaz!");
                }else {
                    System.out.println("Sifre basariyla degistirildi!");
                }
            }
        }
    }
}
