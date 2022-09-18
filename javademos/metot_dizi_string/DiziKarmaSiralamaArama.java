package metot_dizi_string;

public class DiziKarmaSiralamaArama {
    public static void main(String[] args) {
        int sayilar[] = {1,9,5,2,7,9,60,120,55,-9};

        //diziYazdir(sayilar);
        diziYeriDegistir(sayilar);
        System.out.println("Yer degistirme metotundan sonra dizi ");
        diziYazdir(sayilar);
        selectionSortSiralama(sayilar);
        System.out.println("Siralama metotundan sonra dizi ");
        diziYazdir(sayilar);

        int sonuc = binarySearch(sayilar, 55);
        System.out.println("sonuc : " + sonuc);
        // geriye dönen eleman - bir sayi ise o eleman o dizi içinde yok, + bir deger var ise o o dizide var o sayıda



    }
    public static int binarySearch(int[]dizi, int aranacakEleman){
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length-1;
        while (enYuksekIndex >= enDusukIndex){

            int ortaIndex = (enDusukIndex+enYuksekIndex) /2;
            if(aranacakEleman < dizi[ortaIndex]){
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;// aranılacak elamanın bulunduğu indexi döndürür.
            }else {
                enDusukIndex = ortaIndex+1;
            }
        }
        return -enDusukIndex -1;
    }
    public static void selectionSortSiralama(int[] dizi){
        for( int i = 0; i<dizi.length-1; i++){

            // en küçük elamanın ve indexinin bulunması
            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukElemanınIndex = i;
            for(int j= i+1; j < dizi.length ; j++){
                if (oankiEnKucukSayi> dizi[j]){
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukElemanınIndex = j;
                }
            }

            if (oankiEnKucukElemanınIndex != i){
                dizi[oankiEnKucukElemanınIndex]=dizi[i];
                dizi[i]= oankiEnKucukSayi;
            }
        }
    }
    public static void diziYeriDegistir(int[] dizi){
        for (int i= dizi.length-1; i>0; i--){
            int rastgeleIndex = (int)(Math.random() * (i+1));

            int gecici =dizi[i];
            dizi[i]=dizi[rastgeleIndex];
            dizi[rastgeleIndex]=gecici;

        }

    }
    public static void diziYazdir(int[]dizi){
        for(int i : dizi){
            System.out.print( i + ",");
        }
    }
}
