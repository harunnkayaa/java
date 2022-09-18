package kontrol_yapilari;

public class WhileDoWhileDonguleri {
    public static void main(String[] args) {
        int sayi = 10;
        while(sayi <= 20){
            //sayi<20 bu ifade true olduğu sürece çalışır.
            System.out.println("Merhaba sayi: " + sayi);
            sayi ++;
        }
        for(int i = 10; i<= 20 ; i++){
            System.out.println("For dongusu Merhaba sayi: " +i);
        }

        int s1=0;

        do{
            System.out.println("Merhaba s1: " + s1);
            s1++;
        }while (s1<5);
    }
}
