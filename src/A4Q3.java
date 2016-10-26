
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the scanner
        Scanner input = new Scanner(System.in);

        // please ask the user for thir numbers
        System.out.println("Please  enter in 4 numbers on seperate lines");

        // detect first 4 number

        // input first number
        double one = input.nextDouble();

        // input second number
        double two = input.nextDouble();

        // input third number
        double three = input.nextDouble();

        // input fourth number
        double four = input.nextDouble();

        // display the 4 numbers
        System.out.println("You're numbers were " + one + ", " + two + ", " + three + ", " + "and " + four);
    }
}
