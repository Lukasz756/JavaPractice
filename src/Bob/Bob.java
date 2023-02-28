package Bob;

import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {






        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(bobResponse(scanner.nextLine()));
        }
    }

    private static String bobResponse(String message) {

        if (message.endsWith("?")) {
            if (isCapitals(message)) {
                return "Calm down, I know what I'm doing.";
            } else {
                return "Sure.";
            }

        } else if (message.isEmpty()) {
            return "Fine. Be that way!";
        } else if (isCapitals(message)) {
            return "Whoaa, chill out!";
        }else {
            return "Whatever.";
        }
    }

     private static boolean isCapitals(String check) {
        String checkCapitals = check.toUpperCase(Locale.ROOT);
        if (checkCapitals == check) {
            return true;
        } else {
            return false;
        }
    }

}
