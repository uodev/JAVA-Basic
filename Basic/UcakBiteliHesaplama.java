import java.util.Scanner;

public class UcakBiletiHesaplama {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yas,tip;
        double mesafeUcret = 0.10, km;
        double normalTutar,toplamTutar,indirimliTutar;
        double gidisDonusIndirim;

        System.out.println("Mesafeyi Giriniz: ");
        km = scanner.nextDouble();

        System.out.println("Yasinizi Giriniz: ");
        yas = scanner.nextInt();

        System.out.println("Yolculuk Tipi (1-Tek Yon 2-Gidis-Gelis): ");
        tip = scanner.nextInt();

        if(km>0 && yas>=0 && tip==1 || tip ==2){
            normalTutar = mesafeUcret*km;
            if(tip == 1){
                if(yas <12){
                    indirimliTutar = normalTutar * 0.50;
                    normalTutar -= indirimliTutar;
                    toplamTutar = normalTutar;
                }else if(yas<=24){
                    indirimliTutar = normalTutar* 0.10;
                    normalTutar -= indirimliTutar;
                    toplamTutar = normalTutar;
                }else if(yas>65) {
                    indirimliTutar = normalTutar * 0.30;
                    normalTutar -= indirimliTutar;
                    toplamTutar = normalTutar;
                }else {
                    toplamTutar = normalTutar;
                }
            }else {
                if(yas <12){
                    indirimliTutar = normalTutar * 0.50;
                    normalTutar -= indirimliTutar;
                    toplamTutar = normalTutar;
                }else if(yas<=24){
                    indirimliTutar = normalTutar* 0.10;
                    normalTutar -= indirimliTutar;
                    toplamTutar = normalTutar;
                }else if(yas>65) {
                    indirimliTutar = normalTutar * 0.30;
                    normalTutar-= indirimliTutar;
                    toplamTutar = normalTutar;
                }else {
                    toplamTutar = normalTutar;
                }
                gidisDonusIndirim = toplamTutar*0.20;
                toplamTutar -= gidisDonusIndirim;
                toplamTutar*=2;
            }

            System.out.println("Toplam Tutar: " + toplamTutar);


        }else{
            System.out.println("Hatali Veri Girisi");
        }

    }
}
