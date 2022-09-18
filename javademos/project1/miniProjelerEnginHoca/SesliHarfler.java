package miniProjelerEnginHoca;

import kontrol_yapilari.SwitchCaseKullanimi;

public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }

    }
}
