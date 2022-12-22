import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    private static Scanner scanner = new Scanner(System.in);

    public static int parseCard(Cards card) {
        switch (card) {

            case ACE -> {
                return 11;
            }
            case TWO -> {
                return 2;
            }
            case THREE -> {
                return 3;
            }
            case FOUR -> {
                return 4;
            }
            case FIVE -> {
                return 5;
            }
            case SIX -> {
                return 6;
            }
            case SEVEN -> {
                return 7;
            }
            case EIGHT -> {
                return 8;
            }
            case NINE -> {
                return 9;
            }
            case TEN, JACK,QUEEN,KING -> {
                return 10;
            }
            default -> {
                return 0;
            }
        }
    }

    public static boolean twoCardsBlackjack(Cards card1, Cards card2){
        if(parseCard(card1)+parseCard(card2)==21){
            return true;
        }else {
            return false;
        }
    }

    private static Cards takeCard(){
        Random random = new Random();
        int i = random.nextInt(13);
        switch (i){
            case 0 :{
                return Cards.ACE;
            }
            case 1:
                return Cards.TWO;
            case 2:
                return Cards.THREE;
            case 3:
                return Cards.FOUR;
            case 4:
                return Cards.FIVE;
            case 5:
                return Cards.SIX;
            case 6:
                return Cards.SEVEN;
            case 7:
                return Cards.EIGHT;
            case 8:
                return Cards.NINE;
            case 9:
                return Cards.TEN;
            case 10:
                return Cards.JACK;
            case 11:
                return Cards.QUEEN;
            case 12:
                return Cards.KING;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }

    public static void Game(){
        boolean score = false;
        while(!score){
            score = twoCardsBlackjack(takeCard(), takeCard());
            System.out.println(score);
            String s = scanner.nextLine();
            switch (s){
                case "N":{
                    //next card
                }
                case "P":{
                    //pass
                }
                case "S":{
                    //stop the game
                    break;
                }


            }
        }
    }



}
