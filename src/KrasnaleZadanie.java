import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KrasnaleZadanie
{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("day3.txt"));

        int priority = 0;
        int counter = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] chars = line.split("");

            if(counter%3==0){
                List<String> first = Arrays.asList(Arrays.copyOfRange(chars, 0, chars.length / 2));
                List<String> second = Arrays.asList(Arrays.copyOfRange(chars, chars.length / 2, chars.length));
                Set<String> result = first.stream().filter(second::contains).collect(Collectors.toSet());
                System.out.println(first);
                System.out.println(second);
                priority += result.stream().mapToInt(x -> GetPriority(x.charAt(0))).sum();
                System.out.println(counter);

                counter++;
            }else{
                List<String> first = Arrays.asList(Arrays.copyOfRange(chars, 0, chars.length / 2));
                List<String> second = Arrays.asList(Arrays.copyOfRange(chars, chars.length / 2, chars.length));
                Set<String> result = first.stream().filter(second::contains).collect(Collectors.toSet());
                System.out.println(first);
                System.out.println(second);
                priority += result.stream().mapToInt(x -> GetPriority(x.charAt(0))).sum();
                System.out.println(counter);
                counter++;
            }





        }

    System.out.println(priority);


    }

    private static int GetPriority(char value) {
        if (value >= 97 && value <= 122) {
            return value - 96;
        }

        if (value >= 65 && value <= 90) {
            return value - 38;
        }

        return 0;
    }}

