package kontrol_yapilari;

public class BreakVeContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Inin degeri: " + i);
            if (i == 4)
                break;
        }
        distakiFor:
        for (int a = 0; a < 10; a++) {

            icerdekiFor:
            for (int b = 0; b < 3; b++) {
                System.out.println("a:" + a + "b:" + b);
                if (a == 1 && b == 2) {
                    break distakiFor;
                }

            }

        }
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(" i nin degeri : " + i);
        }
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                return;
            }
            System.out.println("return i nin degeri : " + i);
        }

    }
}

