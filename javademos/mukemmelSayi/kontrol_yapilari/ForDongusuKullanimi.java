package kontrol_yapilari;

public class ForDongusuKullanimi {
    public static void main(String[] args) {
        /*
        for(ilk_atama ; dongu_calismasinin_sarti ; her_calisma_sonrasi_neolacak);
        forun içine saklanacağı bir değişken atanır ve bu değişken bir şeye eşitlenip(i=10)
        bu eşitlik bir şarta bağlanır bu şart sayesinde nereye kadar çalışacapını bilir.(i<10)
        sonrasında nereeye kadar gideceği belirlenir ve oraya kadar artışını sağlayacak kural yazılır(i++).
       noktalı virgül buradada java da olduğu gibi kullanılamz kullanılırsa sadece forun olduğu kısmı çalıştırır.

        for (int i=0 ; i<10; i++){
            System.out.println("To practise For");
            System.out.println("I learn Java");
            System.out.println("Value of i : " +i);
        } */

        for(int i=0, j=0; (i+j <10 ); i++, j++){
        // Çalıştırılacak ifade ve bunun gibi karmaşık ifade çok çıkmaz.

        }
        // bir koşul, sınırlama olmadığı için sonsuza giden yapı oluşturur aşağıdaki örnek
        for (;;){
            System.out.println("Emre");
        }

         //for(int i = 0 ; i<10 ; i++); {
            //compiler hatası vermez ama mantık hatası vardır,} sonda noktalı virgül olduğu için hata veriyor.


        }
}
