package metot_dizi_string;

public class MetotlaraDİziGondermekVeAlmak {
    public static void main(String[] args) {

        int sayilar[] = {1,2,3,};
        diziGoster(sayilar);//main içine yazılan bu sayilar kısmı metotlarda farklı isimle isimlendirilebilir mesela aşağıda dizi dedik.

        System.out.println("metottan once index 0 :" +sayilar[0]);
        degeriBirArttir(sayilar[0]);
        System.out.println("metottan sonra index 0 :" +sayilar[0]);

        System.out.println("Dizi degerlerini arttirmadan once " );
        diziGoster(sayilar);
        diziDegerleriniBirArttir(sayilar);
        System.out.println("Dizi degerlerini arttirdiktan sonra " );
        diziGoster(sayilar);

        toplaminiBul(5 ,7,10,78,45,95,-8);
        toplaminiBul(1);
    }

    private static void toplaminiBul(int...parametreListesi) { //... koyup bir isim yazdığında o mainde isim içine ne kadar sayı yazarsan yaz alıcak
        int toplam = 0;
        for (int oankiSayi : parametreListesi){
            //(toplam=toplam+oankiSayi;
            toplam += oankiSayi;
        }
        System.out.println("Parametre listesinin ilk elemanı : " +parametreListesi[0]);
        System.out.println("Gelen parametrelerin toplami : "+ toplam);
    }


    // parametre olarak kendisini gönderdiğimiz için yazılan değişiklik direkt mainde de gösteriliyor
     // dizilerde değişiklik olduğunda mainde göründü ama diğerinde gözüküyor.
    // adres değeri gönderilirse değişiklik gerçekleşir kopyası değiştirmez.
    private static void diziDegerleriniBirArttir(int[] sayilar) {
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }

    private static void degeriBirArttir(int i) {

        i++;

    }

    private static void diziGoster(int[] dizi) {
        for (int i: dizi){
            System.out.println("eleman : " +i);
        }
    }
}
