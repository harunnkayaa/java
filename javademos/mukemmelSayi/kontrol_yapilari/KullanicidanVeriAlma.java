package kontrol_yapilari;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        /* int kullanicininGirdigiSayi = tara.nextInt();
        System.out.println("Kullanicinin girdigi deger : " + kullanicininGirdigiSayi);

        double kullaniciDouble = tara.nextDouble();
        System.out.println("Kullanicinin girdigi double deger : " + kullaniciDouble);
        */


        // ödev yapımlarında bu konu daha anlaşılır.

        String isim = tara.next();
        System.out.println("girilen isim: "+isim);

        tara.nextLine();

        String isimSoyisim = tara.nextLine();
        System.out.println("girilen isim ve soyisim: "+isimSoyisim);

        char harf=tara.next().charAt(0);
        System.out.println("girilen harf: " + harf);

    }
}
