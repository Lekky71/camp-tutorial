package printing;

import java.util.Locale;

public class Printer {

    public static void main(String[] args) {
        System.out.printf(Locale.getDefault(), "%.2f\t", 56.7898594995);

        String amountInNaira = String.format(Locale.getDefault(), "The amount %s has in his %s bank is %.2f", "toba", "GT", 540004.25332043453);
        System.out.println(amountInNaira);
    }
}
