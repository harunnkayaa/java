package operatorler;

public class IslemOnceligi {
    public static void main(String[] args) {

        /*
        İşlem önceliği sırası büyükten küçüğe doğru şu şekildedir:
        1.() önce parantez içi hesaplanır
        2. ++ ve -- (eğer değişkenden önce ise)
        3. çarpma ve bölme
        4. toplama ve çıkarma
        5. = atama işlemi
        6. ++ ve -- (eğer değişkenden sonra ise)
         */

        int sayi1= 15;
        int sayi2 = 5;
        int sonuc = 0;

        sonuc = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1;
        System.out.println("Sonuc 1: " + sonuc);

        sonuc = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1; //sayi1++ ve sayi2 çarpılırken sayi1 ve sayi2 çarpılır sonra sayi1 in değeri 1 arttırılır çarpma işleminin sonucu değil dikkat.
        System.out.println("Sonuc 2: " + sonuc);

    }

}
