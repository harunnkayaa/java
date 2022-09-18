package kontrol_yapilari;

public class MathSininfiKullanimi {
    public static void main(String[] args) {
        System.out.println("pi sayisi : " + Math.PI );
        System.out.println("pi sayisi : " + Math.E );

        System.out.println("-5 in mutlak degeri : " + Math.abs(-5) );
        System.out.println("4.6 nin yuvarlanmış degeri : " + Math.ceil(4.6) );
        System.out.println("-4.3 nin yuvarlanmış degeri : " + Math.ceil(-4.3) );
        System.out.println("2 nin küpü : " + Math.pow(2,3) );
        System.out.println("3 un karesi : " + Math.pow(3,2) );
        System.out.println("Hangisi daha buyuk 2 mi 3 mu : " + Math.max(2,3) );
        System.out.println("Hangisi daha buyuk 2 mi 3 mu : " + Math.min(2,3) );

        int onaKadarRastgeleSayi = (int) (Math.random() * 11); //0,0-0,99999999 aralığında değerlerle random işelm yapar
        System.out.println("Rastgele üretilen sayi : "+onaKadarRastgeleSayi);

        int ikiyeKadarSayiUret = (int) (Math.random() * 2 + 1);

        System.out.println("ikiye kadar uretilen sayi : "+ ikiyeKadarSayiUret);

        //eğer üretilecek rastgele sayinin 0 da olmasini istiyorsanız
        //Math.raandom() * (üst sinir+1)

        //eğer üretilecek rastgele sayinin 0 da olmasini istemiyorsanız
        //(Math.random() * üst sinir) +1

    }
}
