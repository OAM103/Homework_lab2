
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        int players = 0 ;

        String[] suits = {
                "♤", "♢", "♡", "♧"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "T"
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков(не более 8): ");

        if (sc.hasNextInt()) {
            players = sc.nextInt();
            if (players <= 0 || players >8) {
                System.out.println("Вы ввели не то!");
                System.exit(0);
            }
        }else{
            System.out.println("Вы ввели не то!");
        }


        // Колода
        String[] deck = new String[52];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deck[4*i + j] = rank[i] + " " + suits[j];
            }
        }

        //Раздача
        for (int i = 0; i < players * 5; i++) {
            int r = i + (int) (Math.random()*(52-i));
            String A = deck[r];
            deck[r] = deck[i];
            deck[i] = A;
            System.out.println(deck[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
}
