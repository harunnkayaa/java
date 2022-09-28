package metot_dizi_string;

import java.util.Scanner;

public class MetotOrnek {
    public static void main(String[] args) {

        int kullaniciSecimi = -1;
       /* while (kullaniciSecimi != 0){
            kullaniciSecimi = menuGoster(); // kullanıcı 0 a bastığında çıkmak için yapılan uygulamadır.
        }*/

        for(;;) {
            kullaniciSecimi = menuGoster();
            if (kullaniciSecimi == 0) {
                break; // bu da aynı şekilde 0 a basıldığında uygulamadan çıkmak için yapılan uygulamadır.
            }
            Scanner tara = new Scanner(System.in);
            System.out.println("Birinci sayiyi girin : ");
            int birinciSayi = tara.nextInt();
            System.out.println("Ikinci sayisi girin : ");
            int ikinciSayi = tara.nextInt();

            switch (kullaniciSecimi) {
                case 1 : ikiSayiyiCarp(birinciSayi, ikinciSayi);
                     break;
                case 2 :
                    int toplam = ikiSayiyininToplaminiBul(birinciSayi, ikinciSayi);
                    System.out.println("Sayilarin toplami : " + toplam);
                    break;
                case 3 :
                    ikiSayininKuvvetiniBul(birinciSayi, ikinciSayi);
                    break;
                case 4 :
                    double toplamDouble = ikiSayiyininToplaminiBul(5.9, 8.8);
                    System.out.println("Iki double sayini toplami : " + toplamDouble);
                    break;
                case 5:
                    String sonuc = isaretiBelirle(5);
                    System.out.println("sonuc : " + sonuc);
                    break;
                }
            }
        }

    private static String isaretiBelirle(int i) {
        if (i > 0) {
            return "Pozitif";
        }else if (i==0) {
            return "Sayi sifir";
        }else if (i<0){
            return "Negatif";
        }else
            return ""; //bu sonda yaptığımızın mantığı ben bunları döndüreceğim ama hiçbir şey olmazsa ne yapmam gerek gibi bir şeyo yüzden yazdık
    }

    public static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi) {
       double sonuc=  Math.pow(birinciSayi, ikinciSayi);
        System.out.println("Sayilarin kuvveti : " + sonuc);
    }

    public static int ikiSayiyininToplaminiBul(int birinciSayi, int ikinciSayi) {
        int toplam = birinciSayi + ikinciSayi;
        return  toplam;
    }
    public static double ikiSayiyininToplaminiBul(double birinciSayi, double ikinciSayi) {
        double toplamDouble = birinciSayi + ikinciSayi;
        return toplamDouble;
    }

    public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
        System.out.println("Sayilarin carpimi : " + birinciSayi*ikinciSayi);
    }

    public static int menuGoster (){

        System.out.println("******* MENU ********");
        System.out.println("1- iki sayinin carpimini bul ");
        System.out.println("2- iki sayinin toplamini bul ");
        System.out.println("3- iki sayinin kuvvetini bul ");
        System.out.println("4- Iki double sayinin toplamini bul ");
        System.out.println(" Cikmak icin 0 tuslayiniz ");


        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;
    }
}
