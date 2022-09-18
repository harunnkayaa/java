package kontrol_yapilari;

import jdk.swing.interop.SwingInterOpUtils;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {
        int haftaninKacinciGunu = 3 ;

        if (haftaninKacinciGunu == 1){
            System.out.println("Pazartesi");
        } else if (haftaninKacinciGunu == 2){
            System.out.println("Sali");
        } else if (haftaninKacinciGunu == 3){
            System.out.println("Carsamba");
        } else if (haftaninKacinciGunu == 4){
            System.out.println("Persembe");
        } else if (haftaninKacinciGunu == 5){
            System.out.println("Cuma");
        }

        //Switch Case Yapısı art arda else yapısı olduğumda kullanılır.
        switch (haftaninKacinciGunu){
            case 1: System.out.println("Pazartesi "); break;
            case 2: System.out.println("Sali "); break;
            case 3: System.out.println("Carsamba "); break;
            case 4: System.out.println("Persembe "); break;
            case 5: System.out.println("Cuma "); break;
            default: System.out.println(" Yanlis Bir Gün Degeri Girildi ");
        }
        /*eğer breakı yazmazsan doğru olan ifadeyi yazdırdıktan sonra aşağıya doğru break ifadesini görene kadar yazdırır
        çünkü break doğru olan ifade bulunduktan sonra daha fazla aşağıya doğru yazmayı engelliyor.

        Case ile break arasına istediğin kadar yazı yazdırabilirsin.
         */
        System.out.println("Switcden Cikildi");

    }
}
