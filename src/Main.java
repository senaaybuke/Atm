import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     int aktivbakiye = 1000;
        System.out.println("Bakiyeniz =" +aktivbakiye);
        System.out.println("Islemler");
        System.out.println("1.Para Cekme");
        System.out.println("2.Para Yatirma");
        System.out.println("3.Bakiye Ogrenme");
        System.out.println("Cikis");

        System.out.println("isleminizi seciniz:");
        int islem = scanner.nextInt();
        switch(islem) {
            case 1:
                System.out.println("Bakiyeniz = " + aktivbakiye);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                if(tutar > aktivbakiye) {
                    System.out.print("Yetersiz bakiye Tekrar giriniz: ");
                    tutar = scanner.nextInt();
                }
                aktivbakiye -= tutar;

                System.out.println("Yeni bakiyeniz = " + aktivbakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz = " + aktivbakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = scanner.nextInt();
                aktivbakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + aktivbakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz = " + aktivbakiye);
                break;
            case 4:
                System.out.println("Cikis yaptiniz");
            default:
                System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
        }
    }
    }
