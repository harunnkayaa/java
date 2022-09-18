package metot_dizi_string;

import java.util.Arrays;

public class ArraysSinifKullanimi {
    public static void main(String[] args) {
        int[] sayilar ={8,7,2,-8,14,19,11};
        int[] sayilar2 ={8,7,2,-8,14,19,11};
        System.out.println("Siralama oncesi dizi");
        diziYazdir(sayilar);

        //Arrays.sort(sayilar);
        //Arrays.sort(sayilar, 2, 5);// 2 ve 5 arasındaki sayilari siralar digerleri yine aynı şekilde yazılır. ctrl p ye basmalı mı ?
        Arrays.parallelSort(sayilar);// islemcinde birden fazla çekirdek varsa bu kod daha etkili çalışabilir.
        Arrays.parallelSort(sayilar2);
        System.out.println("\n Siralama sonrası dizi");
        diziYazdir(sayilar);


        int sonuc = Arrays.binarySearch(sayilar, 11);
        System.out.println("Sonuc : " + sonuc);

        System.out.println("Sayilar ve Sayilar2 esit mi? " + Arrays.equals(sayilar,sayilar2)); //içine yazılan eşitse true değilse false dönmeye yarar equals

        int[] yeniDizi = new int[20];
        // Arrays.fill(yeniDizi, 50);// 20 tane 50 ata
        Arrays.fill(yeniDizi,0, 5,95); // 0 ile 5 rasındaki degerlere 95 ata
        System.out.println("\nYeni dizi\n");
        diziYazdir(yeniDizi);

    }

    public static void diziYazdir(int[]dizi){
        for (int i: dizi){
            System.out.println( i + ",");
        }
    }
}
