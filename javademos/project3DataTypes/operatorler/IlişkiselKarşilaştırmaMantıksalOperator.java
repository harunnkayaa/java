package operatorler;

public class IlişkiselKarşilaştırmaMantıksalOperator {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 11;

        System.out.println("Sayi 1 esit mi Sayi 2 " + (sayi1==sayi2));
        System.out.println("Sayi 1 kücük mi Sayi 2 " + (sayi1<sayi2));
        System.out.println("Sayi 1 büyük mi Sayi 2 " + (sayi1>sayi2));
        System.out.println("Sayi 1 kücük eşit mi Sayi 2 " + (sayi1<=sayi2));
        System.out.println("Sayi 1 büyük esit mi Sayi 2 " + (sayi1>=sayi2));
        System.out.println("Sayi 1 esit değil mi Sayi 2 " + (sayi1!=sayi2));

        // sağa dönük çengelli parantez için alt gr  ve 0 a basılır, sola dönük için altgr ve 7 ye basılır.
        if (sayi1<sayi2)
            System.out.println("s1 s2den kucuktur ");
        else
            System.out.println("s1 s2den buyuktur ");

            boolean deger1 = true;
            boolean deger2 = false;

            System.out.println("deger1 ve deger2 and durumu : " + (deger1 && deger2));
            System.out.println("deger1 ve deger2 or durumu : " + (deger1 || deger2));

            int benimYaşim=30;
            int onunYaşi=25;

            if(benimYaşim < 40 && onunYaşi >20 );

        System.out.println("birinci ifade calisti");

        if (benimYaşim < 25 || onunYaşi >25 );
            System.out.println("ikinci ifade calisti");





    }
}
