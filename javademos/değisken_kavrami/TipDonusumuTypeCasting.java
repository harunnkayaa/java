package değisken_kavrami;

public class TipDonusumuTypeCasting {
    public static void main(String[] args) {
        int sayi=10;
        float noktaliSayi=130.25f;

        /*
        noktaliSayi=sayi;
        System.out.println("Noktali Sayinin Degeri : "+ noktaliSayi);
        küçük olan veri türünü otamatik olarak eşitlik şeklinde yazdığımda hata vermez ama küçüğü büyük içine yazmak istediğimde
        büyük olan eşitliğin önüne hangi türden olduğunu yazmam gerek. Aşağıda örneği var.
        */

        sayi=(int) noktaliSayi;
        System.out.println("Sayi Degeri : "+ sayi);

        byte byteSayi = 5;

        byteSayi = (byte)noktaliSayi;
        System.out.println("Byte sayinin degeri : "+ byteSayi);


        
           }
}

