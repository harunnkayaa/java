package operatorler;

public class ArttirmaAzaltma {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = ++sayi1;// sayı 1 bu işlemden sonra 11 oldu bu yüzden diğerr işlemi yaparken sayi1 yerine 11 değeri kullanılır
        int sayi3 = sayi1--;

        System.out.println("Sonuc : " + ((sayi1)+(--sayi2)+(sayi3++)));

        //sayi1++ ==> sayi1 =sayi1 + 1
        //sayi2-- ==> sayi2 =sayi2 - 1

        System.out.println(" Harun " + " Kaya");// + burada yan yana yazılan metinleri tek cümle gibi alır.
        System.out.println(sayi1 + sayi2);// + burada metin olmadığı için yan yana yazılan değerleri toplamak için kullanıldı.
        System.out.println("emre " + sayi1 + sayi2);
        System.out.println("emre "+ (sayi1 + sayi2));

    }
}
