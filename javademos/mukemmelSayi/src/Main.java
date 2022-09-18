public class Main {
    public static void main(String[] args) {
        int total = 0;
        int number = 5;

        for (int i=0;i<number;i++){
            if (number %i==0){
                total = total +i;

            }
        }

        if (total == number ){
            System.out.println("Mükemmel sayı");
        }else {
            System.out.println("mükemmmel sayı değidir");
        }
    }
}