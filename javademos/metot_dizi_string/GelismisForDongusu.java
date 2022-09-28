package metot_dizi_string;

public class GelismisForDongusu {
    public static void main(String[] args) {
        int[] sayilar = {1,5,7,-9,62};
        for(int i=0; i< sayilar.length; i++)
            System.out.println("eleman : " + sayilar[i]);

        for(int oankiSayi : sayilar)
            System.out.println("for each eleman:" + oankiSayi);

        String isimler[] = {"emre", "harun", "hasan"};
        diziYazdir(isimler);
    }
    public static void diziYazdir(String isimler[]){
        for (String s: isimler)
            System.out.println("for each  isim : " + s);
    }
}
