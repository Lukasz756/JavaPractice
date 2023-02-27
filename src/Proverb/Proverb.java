package Proverb;

public class Proverb {
    public static void main(String[] args) {
        int i = 0, j = 1;
        String[] words = {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom",};

        for (int counter = 0; counter < words.length - 1; counter++) {
            System.out.println("For want of a " + words[i]+" the "+ words[j]+" was lost.");
            i++;
            j++;
        }
        System.out.println("And all for the want of a "+words[0]);
    }
}
