package metot_dizi_string;

public class MetotKavrami {
    public static void main(String[] args) {
       menuGoster();// bir şeyi main metoduna tanımlamazsan çalışmaz biz de bu parametreyi (menuGoster) buraya çalışması için yazıyoruz.
       sayilariTopla(10,15); //bu parametre değerlerini buraya yazdığımız başka metotlarda da çalışsın diye mi yazıyoruz?
       sayilariTopla(3,5);
       sayilariTopla(4,7);

       int sayi=5;
       sayiyiDegistir(sayi);// bçyle bir şey yazıp alt enter yaptığımızda otamatik olarak aşağıda uygun metotu oluştuur

        System.out.println("fark : " + sayilarinFarkinibul(10,6));
        int donulenDeger = sayilarinFarkinibul(10,6);
        System.out.println("donulen deger :" +donulenDeger);
    }
    // geriye değer döndüren parametreli metot
    public static int sayilarinFarkinibul(int a, int b) { // eğer geriye döndürme  varsa void yazılmaz sayıyı hangi değerde saklıyorsan
        System.out.println("sayilarin farki : " + (a-b));
        return (a-b);// main altında bu metotu tanımlayan yere bu değeri geri gönder demek
    }

    public static void sayiyiDegistir(int x) { // bu yazdığın x zaten yukarıda sayi olarak tanımlı yani x bir sembol sen istediğini yazabilirisin oraya
        x = x+ 10;
        System.out.println("gonderilen sayinin 10 fazlasi : " + x);
    }

    //parametre alan ve geriye değer döndürmeyen metot
    public static void sayilariTopla(int birinciSayi, int ikinciSayi){ //bu int tanımladığımız parametrelerdir
        System.out.println("toplam : " + (birinciSayi+ikinciSayi) );
    }
    // parametre almayan ve geriye değer döndürmeyen metot
    public static void menuGoster(){ //bu metot tanımından sonrada ; yok dikkat
        System.out.println("**** Menu *****");
        System.out.println("1- iki sayisinin toplamini bul");
        System.out.println("2- iki sayisinin farkini bul");
        System.out.println("3- iki sayisinin carpimini bul");
        System.out.println("4- iki sayisinin bolumunu bul");
    }
}
