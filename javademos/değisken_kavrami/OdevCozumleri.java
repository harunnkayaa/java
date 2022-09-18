package değisken_kavrami;

public class OdevCozumleri {

    public static void main(String[] args) {
        //Ödev 1 çözümü

        String stringDegiskeni = "150";
        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);

        //paeseınt, parsedouble.. valueof gibi yapılar stringleri integer floa byte gibi yapılarda saklamamızı sağlar.

        System.out.println("Integer degiskeni1 : " + integerDegiskeni);
        System.out.println("Integer degiskeni2 : " + integerDegiskeni2);

        stringDegiskeni = String.valueOf(integerDegiskeni);
        System.out.println("String degiskeninin son degeri : "+ stringDegiskeni);

        System.out.println("****************************************************");
        //Ödev 2 çözümü

        int sayi1 = 5 / 3 ;
        float sayi2 = 5f / 3f ; //float virgülden sonra 7 karaktere kdar saklamış.
        double sayi3 = 5d / 3d ; //doublede aslında sonsuza kadar giden 6 varmış ama onu bir üste atamış 7 yapmış

        System.out.println("Sayi 1 : "+ sayi1);
        System.out.println("Sayi 2 : "+ sayi2);
        System.out.println("Sayi 1 : "+ sayi3);

        System.out.println("****************************************************");
        //Ödev 3 çözümü

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //0.5 değerini görmeyi bekliyoruz. sonsuza kadar 0 yaptı ama sığdıramadığını bir üste yuvarladı.
        System.out.println(1.0 - 0.9); // 0.1 değerini görmeyi bekliyoruz.

        System.out.println("****************************************************");
        //Ödev 4 çözümü

        int s1 = 1;
        int s2 = 2;

        double ortalama = (s1+s2) / 2; //double olduğunu belirtmediğimiz için integer olarak atadı.
        System.out.println("ortalama 1 :" + ortalama);

        double ortalama2 = (s1+s2) / 2.0;
        System.out.println("ortalama 2 :" + ortalama2);










    }
}
