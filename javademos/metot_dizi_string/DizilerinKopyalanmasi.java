package metot_dizi_string;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
        int[] anaDizi = {1, 7, 9, 10};
        int[] kopyaDizi = new int[anaDizi.length];

        // Manuel kopyalama
        for (int index = 0; index < anaDizi.length; index++) {
            kopyaDizi[index] = anaDizi[index];
        }
        //Arraycopy
        int kopyaDizi2[] = new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);
        //diziYazdir(kopyaDizi2);

        int denemeDizisi[] = new int[anaDizi.length];

        denemeDizisi = anaDizi;
        //1,7,9,10     //1,7,9,10
        diziYazdir(denemeDizisi);
        System.out.println("**********************");
        diziYazdir(anaDizi);

        anaDizi[0] = 100;
        System.out.println("Ana dizideki ilk eleman degistirildi");
        diziYazdir(anaDizi);
        System.out.println("**********************");
        System.out.println("Deneme dizisi yazdiriliyor");
        diziYazdir(denemeDizisi);
    }

        public static int[] tersiniOlustur(int[] dizi) {
            int[] olusanDizi = new int[dizi.length];
            for (int i = 0, j = dizi.length - 1; i < dizi.length; i++, j--) {
                olusanDizi[j] = dizi[i];

            }
            return olusanDizi;
        }


        public static void diziYazdir ( int[] yazdirilacakDizi){
            for (int sayi : yazdirilacakDizi) {
                System.out.println("Kopya Dizi Elemanı : " + sayi);
            }
        }

    }

