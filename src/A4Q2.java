
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        // ask user to input measurement
        System.out.println("Please enter the measuremnet in inches");

        // record number
        double inch = input.nextDouble();

        // convert inches to cm
        double cm = inch * 2.54;

        // display value
        System.out.println(inch + " inches is the same as " + cm + " cm");
    }
}
