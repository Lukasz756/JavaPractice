import Codility.Test;
import SaddlePoint.SaddlePoint;

import java.util.Arrays;

public class ExerciseTester {

    public static void main(String[] args) throws Exception {

        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(10));
        System.out.println(lasagna.preparationTimeInMinutes(4));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));

        BirdWatcher birdWatcher = new BirdWatcher(new int[]{0, 2, 5, 3, 7, 8, 4});
        System.out.println();
        Arrays.stream(birdWatcher.getLastWeek()).forEach(System.out::println);

        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        System.out.println();
        System.out.println(birdWatcher.getToday(birdsPerDay));

        System.out.println(Infiltration.canFastAttack(false));
        System.out.println(Infiltration.canSpy(true, false, true));
        System.out.println(Infiltration.canSignalPrisoner(false, true));
        System.out.println(Infiltration.canFreePrisoner(false, false, true, false));

        KarlsLanguages karlsLanguages = new KarlsLanguages();
        System.out.println();
        System.out.println(karlsLanguages.isEmpty());
        karlsLanguages.addLanguage("Python");
        System.out.println(karlsLanguages.toString());
        System.out.println(karlsLanguages.isEmpty());
        System.out.println();
        karlsLanguages.addLanguage("Java");
        System.out.println(karlsLanguages.toString());

        karlsLanguages.addLanguage("C++");
        System.out.println(karlsLanguages.toString());

        karlsLanguages.removeLanguage("C#");
        System.out.println(karlsLanguages.toString());

        karlsLanguages.removeLanguage("Java");
        System.out.println(karlsLanguages.toString());

        karlsLanguages.addLanguage("Java");
        System.out.println(karlsLanguages.toString());
        System.out.println(karlsLanguages.firstLanguage());

        System.out.println(karlsLanguages.containsLanguage("Java"));
        System.out.println(karlsLanguages.containsLanguage("Ruby"));

        //removing all
        karlsLanguages.removeLanguage("C++");
        karlsLanguages.removeLanguage("Java");
        karlsLanguages.removeLanguage("Python");
        karlsLanguages.removeLanguage("C#");

        System.out.println(karlsLanguages.firstLanguage());
        System.out.println(karlsLanguages.count());

        System.out.println(SqueakyClean.clean("a h aa   "));
        System.out.println(SqueakyClean.clean3("a-ba-c"));

        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        System.out.println(Blackjack.twoCardsBlackjack(Cards.ACE, Cards.ACE));
        //Blackjack.Game();

        System.out.println(Hamming.hammingDistance("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT"));

        SecretHandShake secretHandShake = new SecretHandShake();

        secretHandShake.decode(9);
        DifferenceOfSquares differenceOfSquares = new DifferenceOfSquares();
        differenceOfSquares.diff(10);
        Triangle triangle = new Triangle();
        triangle.determineTriangle(3, 4, 5);
        RotationalCipher rotationalCipher = new RotationalCipher();
        System.out.println(rotationalCipher.rotate("The quick brown fox jumps over the lazy dog", 13));
        WordCount wordCount = new WordCount();
        wordCount.counting("In the ArrayList chapter, you learned that Arrays store items as an ordered collection," +
                " and you have to access them with an index number (int type)." +
                " A HashMap however, store items in key/value pairs, and you can access them by an index of another type (e.g. a String).");
        SaddlePoint saddlePoint = new SaddlePoint();
        int[][] matrixToSolve = {{1,2,5},{1,6,0}};
    saddlePoint.matrixSolver(matrixToSolve);
    RobotName robotName = new RobotName();
        System.out.println(robotName.getRobotNames(10));

        Test test = new Test();

        System.out.println(test.solution2(285, 20));
        System.out.println(test.Solution3("GSDFG"));


    }

}
