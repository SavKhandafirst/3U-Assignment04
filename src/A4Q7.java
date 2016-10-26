
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner input 
        Scanner input = new Scanner(System.in);

        // Make user enter the speed limit
        System.out.println("Please enter the speed limit.");
        int speedL = input.nextInt();

        // make user enter the speed of the car
        System.out.println("Please enter the recorded speed of the vehicle.");
        int speedC = input.nextInt();

        // create the value the car is going over or under the speed limit by
        int speedN = speedC - speedL;

        // if the speed is greater or equal to 1 and less than or equal to 20, fine of 100 will be given.
        if (speedN <= 20 && speedN >= 1) {
            System.out.println("You are speeding and your fine is $100.");
        }
        // if the speed is greater or equal to 21 and less than or equal to 230, fine of 270 will be given.
        if (speedN >= 21 && speedN <= 30) {
            System.out.println("Your are speeding and your fine is $270.");
        }
        // if the speed is greater or equal to 31, fine of 5500 will be given
        if (speedN >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }
        // if the car isnt speeding.
        if (speedN <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
