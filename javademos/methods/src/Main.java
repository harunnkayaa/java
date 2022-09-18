public class Main {

            public static void main(String[] args) {
                sayıbulmaca();
                sayıbulmaca();
                sayıbulmaca();
                sayıbulmaca();

            }

            public static void sayıbulmaca() {
                int[] sayılar = new int[]{1, 2, 3, 5, 7, 9, 0};
                int aranacak = 5;
                boolean varmı = false;

                for (int sayı : sayılar) {
                    if (sayı == aranacak) {
                        varmı = true;
                        break;
                    }
                }
                if (varmı) {
                    System.out.println("Sayı Mevcuttur"+aranacak);

                }
            }

            public static void mesajVer(int aranacak){
                System.out.println("Sayı Mevcuttur"+aranacak);
            }
        }
    }
}