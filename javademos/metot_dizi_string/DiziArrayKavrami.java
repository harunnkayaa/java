package metot_dizi_string;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DiziArrayKavrami {
    public static void main(String[] args) {
        /*
        int sayilar[]=new int[10];// sayilar değerim int olacak bu int 10 tane sayı heat içinde saklanacak new old için heatte saklanıyor
        önce diziyi oluşturup sonra elemanlar atılacaksa indexleri kullanman gerek ve indexler 0 dan başlar
        sayilar[0] =1;
        sayilar[1] =2;
        sayilar[2] =3;
        sayilar[3] =4;
        sayilar[4] =5;
        // oluşturulan dizi içine new ve index kullanmadan sayilari yazabiliriz.
        int[] sayilar4 = {1,2,3,4,5}; // bunlar altalta yazılamaz düz bir şekilde böyle yazılmalı.
         */


        //CÖZÜM1
        int sayilar[]=new int[10];
        for(int index=0; index<sayilar.length; index++){
            //index sayinin o anki degeri
            //sayilar[index]=index*index;
            sayilar[index]=(int) Math.pow(index,2);
            System.out.println("eleman : " + sayilar[index]);
        }

        //CÖZÜM2
        //String[] aylar=new String[12];
        String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Agustos", "Eylül", "Ekim", "Kasim0", "Aralik"};
        Scanner tara = new Scanner(System.in);
        System.out.println("LUTFEN HANGI AYDA OLDUGUNUZU GIRINIZ");
        int ay = tara.nextInt();

        System.out.println("Sectiginiz ay : " + aylar[ay-1]);

        //COZUM3
        System.out.println("kac tane sayinin ortalamasini bulmak istiyorsun?");
        int sayi= tara.nextInt();

        int kullaniciSayilari[] = new int[sayi];

        double ortalama = 0;
        for(int i=0; i<sayi; i++){
            System.out.println("sayi giriniz : \n");
            kullaniciSayilari[i]= tara.nextInt();
            ortalama = ortalama+ kullaniciSayilari[i];
        }
        System.out.println("Girdiginiz sayilarin ortalamasi : " + (ortalama/ kullaniciSayilari.length));

    }
}
