import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {
        int ay, gun;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogdugunuz ay: ");
        ay = scanner.nextInt();

        System.out.println("Dogdugunuz gun: ");
        gun = scanner.nextInt();

        if (gun >= 1 && gun <= 31) {

            if (ay == 1) {
                if (gun < 21) {
                    System.out.println("Oglak burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else if (ay == 2) {
                if (gun <= 28) {
                    if (gun < 20) {
                        System.out.println("Kova burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                }
            }
            else if(ay==3 ){
                if(gun<21){
                    System.out.println("Balik burcu");
                }
                else {
                    System.out.println("Koc Burcu");
                }
            }
            else if(ay ==4) {
                if (gun < 21) {
                    System.out.println("Koc burcu");
                }else {
                    System.out.println("Boga burcu");
                }
            }
            else if(ay == 5){
                if (gun < 22) {
                    System.out.println("Boga burcu");
                }else {
                    System.out.println("Ikizler Burcu");
                }
            }
            else if(ay == 6) {
                if(gun <23) {
                    System.out.println("Ikizler Burcu");
                }else {
                    System.out.println("Yengec Burcu");
                }
            } else if (ay == 7) {
                if (gun < 23) {
                    System.out.println("Yengec Burcu");
                } else{
                    System.out.println("Aslan Burcu");
                }
            } else if (ay == 8)  {
                if(gun<23) {
                    System.out.println("Aslan Burcu");
                }
                else {
                    System.out.println("Basak Burcu");
                }
            }else if (ay == 9){
                if (gun < 23) {
                    System.out.println("Basak Burcu");
                }else {
                    System.out.println("Terazi Burcu");
                }
            }
            else if (ay == 10) {
                if(gun<23) {
                    System.out.println("Terazi Burcu");
                }else {
                    System.out.println("Akrep Burcu");
                }
            }else if (ay == 11) {
                if (gun< 22){
                    System.out.println("Akrep Burcu");
                }else {
                    System.out.println("Yay Burcu");
                }
            }else if(ay == 12) {
                if(gun<22) {
                    System.out.println("Yay Burcu");
                }else {
                    System.out.println("Oglak Burcu");
                }
            }
            else{
                System.out.println("Boyle bir ay yok!");
            }
        }
        else {
            System.out.println("Yanlis gun girdiniz!");
        }
    }

}
