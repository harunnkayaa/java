package operatorler;

public class KodBloklari {
    public static void main(String[] args) {
        /*
        yazdığımız kodalrın çalışması için tanımlı olan bloğun(süslü prantez) içinde olması gerek
        eğer yazılan kod olmayan o bloğun içinde olmayan başka bir yerde çalıştırılmaya çalışırsa çalışmaz.
        ve aynı düzeyde olanlar çalışır yani alt alta yazılırken aynı hizada olanlar (bu bilgi beni şaşırttı yani dikkat.)
         şu son dikkat dediğim bilgiden emin değilim bir gözden geçirsen iyi olur.
         */
        int seviye1Blok1 = 1;
        {
            System.out.println(seviye1Blok1);
            //System.out.println(seviye2Blok1);

            int seviye2Blok1 =21;
            {
                System.out.println(seviye1Blok1);
                System.out.println(seviye2Blok1);
                //System.out.println(seviye3Blok1);

                int seviye3Blok1 = 31;
                System.out.println(seviye1Blok1);
                System.out.println(seviye2Blok1);
                System.out.println(seviye3Blok1);

            }
        }
    }
    int seviye1Blok2 = 12;
    {
        System.out.println(seviye1Blok2);




    }

}
