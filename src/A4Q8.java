
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input the scanner
        Scanner input = new Scanner(System.in);

        // create starting value
        int square = 1;

        // loop till square is equal to 100 or the player quits
        while (square != 100) {
            // ask for the role of dice
            System.out.println("Enter sum of dice");

            // create the value of each role on dice
            int dice = input.nextInt();

            // total value of square
            square = square + dice;


            // quit the game if dice role is not appropriate (between 2 and 12)
            if (dice < 2 || dice > 12) {
                System.out.println("You Quit!");
                break;
            }

            // make the ladders

            // ladder 1
            if (square == 9) {
                square = 34;
            }

            // ladder 2
            if (square == 40) {
                square = 64;
            }

            // ladder 3
            if (square == 67) {
                square = 86;
            }

            // make the snakes

            // snake 1
            if (square == 54) {
                square = 19;
            }
            // snake 2
            if (square == 90) {
                square = 48;
            }
            // snake 3
            if (square == 99) {
                square = 77;
            }

            // if person is on square 100, they win
            if (square == 100) {
                System.out.println("You Win!");
                break;
            }
            if (square > 100) {
                square = square - dice;
            }

            // tell the person what square they're on
            System.out.println("You are now on square " + square);
        }
    }
}
