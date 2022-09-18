package kontrol_yapilari;

import java.util.Scanner;

public class OdevYapimlari2 {
    public static void main(String[] args) {
        int sansliSayi = (int) Math.random()*99 +1;

        System.out.println("Lutfen bir sayi giriniz: ");

        Scanner tara = new Scanner(System.in);
        int tahminEdilenSayi= tara.nextInt();

        int sansliSayiBirinciBasamak = sansliSayi / 10;
        int sansliSayiIkinciBasamak = sansliSayi % 10;

        int tahminEdilenSayiBirinciBasamak = sansliSayi / 10;
        int tahminEdilenSayiIkinciBasamak = sansliSayi % 10;


       if (sansliSayi==tahminEdilenSayi){
           System.out.println("10.000 tl kazandınız sanslı sayi: "+ sansliSayi + "sizin girdiginiz:" + tahminEdilenSayi);
       } else if (sansliSayiBirinciBasamak==tahminEdilenSayiIkinciBasamak && sansliSayiIkinciBasamak==tahminEdilenSayiBirinciBasamak) {

           {

           }
       }


    }
}
