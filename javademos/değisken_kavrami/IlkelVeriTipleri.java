package değisken_kavrami;

public class IlkelVeriTipleri {
    public static void main(String[] args) {
        int integerDegiskeniminDegeri = 10;
        double doubleDegiskeniminDegeri = 10.50;
        short shortVeriTipi = 32767;

        //Aşağıdaki ifadeler tamsayı veri türlerinin özelliklerini yazdırır.
        System.out.println(" BYTE EN KUCUK DEGERI " + Byte.MIN_VALUE + " EN BUYUK DEGERI:" + Byte.MAX_VALUE + " KAC BIT : "+ Byte.SIZE);
        System.out.println(" SHORT EN KUCUK DEGERI " + Short.MIN_VALUE + " EN BUYUK DEGERI:" + Short.MAX_VALUE + " KAC BIT : "+ Short.SIZE);
        System.out.println(" INTEGER EN KUCUK DEGERI " + Integer.MIN_VALUE + " EN BUYUK DEGERI:" + Integer.MAX_VALUE + " KAC BIT : "+ Integer.SIZE);
        System.out.println(" LONG EN KUCUK DEGERI " + Long.MIN_VALUE + " EN BUYUK DEGERI:" + Long.MAX_VALUE + " KAC BIT : "+ Long.SIZE);

        //Aşağıdaki ifadeler ondalıklı veri türlerinin özelliklerini yazdırır.
        System.out.println(" FLOAT EN KUCUK DEGERI " + Float.MIN_VALUE + " EN BUYUK DEGERI:" + Float.MAX_VALUE + " KAC BIT : "+ Float.SIZE);
        System.out.println(" DOUBLE EN KUCUK DEGERI " + Double.MIN_VALUE + " EN BUYUK DEGERI:" + Double.MAX_VALUE + " KAC BIT : "+ Double.SIZE);

        //char
        char harf= 'a';
        System.out.println("Harf : " + harf);

        int integerDeger = 'B';
        System.out.println("Integer Deger : " + integerDeger);

        //boolean
        boolean sonuc = true;
        System.out.println("Boolean sonuc degiskenin degeri : "+ sonuc);
        sonuc = false;
        System.out.println("Boolean sonuc degişkeninin degeri : "+ sonuc);

        boolean sonuc2 = false;
        System.out.println("Boolean sonuc2 degerinin degeri : "+ sonuc2);

    }
}
