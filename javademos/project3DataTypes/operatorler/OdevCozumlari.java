package operatorler;

public class OdevCozumlari {
    public static void main(String[] args) {

             //Çözüm1
        int saniye = 4803;
        int dakika = saniye / 60;
        int kalanSaniye = saniye % 60;
        System.out.println("Girdiginiz " + saniye + "saniye " + dakika + "dakika ve " +kalanSaniye + "saniyeye eşittir.");

            //Çözüm2
        double fahrenheit = 100d;
        double celcius = (5.0/9.0) * (fahrenheit - 32);
        /*
        burada direkt celcius = (5/9) * (fahrenheit - 32); bu şekil yazılırsa burayı yani(5/9 u ) integer olarak algılar
        bu yüzden double olduğunu bildirmek zorundasın bunu nokta ile yaparsın.
         */
        System.out.println("Girdiginiz " + fahrenheit+ " fahrenheit = " + celcius + " celciustur");

           //Ödev3
        int yil = 4000;
        boolean artikYilMi = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 !=0);
        System.out.println("Girilen " + yil + " yili artik yildir : " + artikYilMi);






    }
}
