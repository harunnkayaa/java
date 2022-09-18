package kontrol_yapilari;

import java.util.Scanner;

public class OdevYapimlari {
    public static void main(String[] args) {
        int boy = 0;
        double kilo = 0;
         // önemli bu değişkenleri istersem aşağıda yazarkende tanımlayabilirim örnk int boy = tara.nextInt()gibi

        System.out.println(" VUCUT KITLE ENDEKSI HESAPLAMA PROGRAMINA HOS GELDINIZ");
        Scanner tara = new Scanner(System.in);

        System.out.println("Boyunuzu cm Cinsinden Giriniz : ");
        boy = tara.nextInt();

        System.out.println("Kilonuzu KG Cinsinden Giriniz : ");
        kilo = tara.nextDouble();

        double endeks = 0;
        double cmToMetre = (double)boy/100;
        double boyunKaresi = Math.pow(cmToMetre,2);

        endeks = kilo / boyunKaresi;
        System.out.println( "vucut kitle endeksi : " + endeks);

        if (endeks < 15){
            System.out.println("Cok ciddi derecede dusuk kilolu");
        } else if (endeks>15 && endeks<16) {
            System.out.println("Ciddi derecede düsük kilolu");
        } else if (endeks>16 && endeks<18.5){
            System.out.println("Düşük kilolu");
        } else if (endeks>18.5 && endeks<25){
            System.out.println("Normal(saglikli) kilolu");
        } else if (endeks>25 && endeks<30) {
            System.out.println("Fazla kilolu");
        } else if (endeks>30 && endeks<35){
            System.out.println("1.dereceden kilolu");
        } else if (endeks>35 && endeks<40) {
            System.out.println("2.dereceden kilolu");
        } else if (endeks>40) {
            System.out.println("1 AY YEMEK YEMESEN SENİ İDARE EDER");
        }else {
            System.out.println("Asiri asiri kilolu");
        }
    }
}
