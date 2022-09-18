package operatorler;

public class AritmetikAtama {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;
        sonuc += sayi1; // sonuc = sonuc + sayi1 sonuc = 10 oldu
        System.out.println("Sonuc : " + sonuc);

        sonuc -= sayi2; // sonuc = sonuc - sayi2 sonuc = -10 oldu
        System.out.println("Sonuc : " + sonuc);

        sonuc *= sayi1; // sonuc = sonuc * sayi1 sonuc = -100 oldu
        System.out.println("Sonuc : " + sonuc);

        sonuc /= sayi2; // sonuc = sonuc / sayi2 sonuc = -5 oldu
        System.out.println("Sonuc : " + sonuc);

        //Ödev
        double ondalikliSayi=6.50;
        double odevsonucu = 0;

        odevsonucu++;
        ondalikliSayi *= odevsonucu;

        System.out.println("Sonuc : " + ondalikliSayi);

        //Ödev

        int s1=10;
        int s2=6;

        s1++;
        --s2;// s2 buradan sonra 5 oldu
        s1 *= --s2; // s2 en son 5ti --s2 olduğu için yeni s2 4 oldu.

        System.out.println("S1 nin son degeri :" +s1);
        System.out.println("S2 nin son degeri :" +s2);


    }
}
