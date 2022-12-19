import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KrasnaleZadanie2 {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("zadanie1.txt");
        Scanner odczyt = new Scanner(new File("zadanie1.txt"));

        List<Integer> listOfCalories = new ArrayList<>();
        int sum = 0;
        int krasnalTop = 0;
        int numberOfTopKrasnal = 0;
        int krasnal = 0;

        while (odczyt.hasNextLine()) {
            String nextline = odczyt.nextLine();

            if (nextline.equals("")) {
                krasnal++;
                listOfCalories.add(sum);
                sum = 0;

            } else {
                int integer = Integer.parseInt(nextline);
                sum = sum + integer;
                if (sum > krasnalTop) {
                    krasnalTop = sum;
                    numberOfTopKrasnal = krasnal;
                }
            }

        }

        System.out.println(krasnalTop);
        System.out.println(numberOfTopKrasnal);

        List<Integer> collectionOfCalories = listOfCalories.stream().sorted().collect(Collectors.toList());


        System.out.println(collectionOfCalories.get(236));
        System.out.println(collectionOfCalories.get(237));
        System.out.println(collectionOfCalories.get(238));

        System.out.println(collectionOfCalories);

        System.out.println(collectionOfCalories.get(238)+collectionOfCalories.get(237)+collectionOfCalories.get(236));

    }

}
