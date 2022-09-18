package kontrol_yapilari;

public class IfElseKullanimi {
    public static void main(String[] args) {
        int benimYasim = 30;
        int onunYasi = 26;
        /*ifden sonra o ifadeyi yazdırmak için yeni kod bloğu a<çılır ve bu kod bloğu kapatıldıktan sonra( süslü parantezle
        açılır kapanır) ifin içine yazılanın dopğru olmadığı göz önüne alınarak else bloğu yazılır yine else bloğu yazılırken
        ayrıca kod bloğu açılır.

        ifden sonra direkt yazılmaz parantez içine yazılır.
        if ve else if kısmı değilse geriye bir ihtimal kalıyorsa o tek bir else içine yazdırılır

        ifli ifadenin souna noktalı virgül konulursa o ifin vermiş olduğu şartı sağlasada sağlamasada o kod orada biteceği için
        ve yeni bir kod bloğuna yazdırılma olacağı için direkt ne yazdırmaya çalıştıysan onu yazdıracaktır.

        else kısmı kendine en yakın olan if lkısmına aittir.

         */

        if (benimYasim > onunYasi){
            System.out.println("Benim senden buyugum");
        } else if (benimYasim < onunYasi){
            System.out.println("Ben senden kucugum");
        }
        else {
            System.out.println("Yaslarimiz ayni");
        }
        int a =10, b=6, c=0;
        if (a>b){
            c=a-b;
        }else{
            c=a+b;
        }
        System.out.println("c nin degeri : " + c);
         // soru işareti kontrol et anlamında iki nokta üst üste ise else anlamında kullanılır. Aşağıda ifin ten dökümğ vardır.

        c = (a>b) ? (a-b) : (a+b);
        System.out.println("C nin degeri : " + c);





    }
}

