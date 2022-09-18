package miniProjelerEnginHoca;

public class AsalSayi {
    public static void main(String[] args) {
        int number = 9;
        //int remainder = number & 2;
        boolean isPrime = true;
        // asal olanları bulmaktansa asla olmama durumunu değerlendiriyoruz
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }

    }
}
