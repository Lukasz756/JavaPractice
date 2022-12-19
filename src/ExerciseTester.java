import java.util.Arrays;

public class ExerciseTester {

    public static void main(String[] args) {

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




    }

}
