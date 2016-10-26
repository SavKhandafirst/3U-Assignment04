
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner input
        Scanner input = new Scanner(System.in);

        // ask for daytime minutes
        System.out.println("Number of daytime minutes?");
        double minute = input.nextDouble();

        // ask for evening minutes
        System.out.println("Number of evening minutes?");
        double evening = input.nextDouble();

        // ask for weelend minutes
        System.out.println("Number of weekend minutes?");
        double weekend = input.nextDouble();

        // Calculate Plan A when minutes are less than or equal to 100
        double planA = 0;
        if (minute <= 100) {
            planA = (minute * 0) + (evening * 0.15) + (weekend * 0.2);
            // round plan A to 2 decimal places
            planA = Math.round(planA * 100) / 100.0;
            // state the total cost for Plan A
            System.out.println("Plan A costs " + planA + ".");

            // calculate Plan A when minutes is greater than 100
        } else {
            planA = ((minute - 100) * 0.25) + (evening * 0.15) + (weekend * 0.2);
            // round plan A to 2 decimal places
            planA = Math.round(planA * 100) / 100.0;
            // state the total cost for Plan A
            System.out.println("Plan A costs " + planA + ".");
        }

        // Calculate Plan B when minutes are less than or equal to 250
        double planB = 0;
        if (minute <= 250) {
            planB = (minute * 0) + (evening * 0.35) + (weekend * 0.25);
            // round plan B to 2 decimal places
            planB = Math.round(planB * 100) / 100.0;
            // state the total cost for Plan B
            System.out.println("Plan B costs " + planB + ".");

            // calculate Plan B when minutes are greater than 250
        } else {
            planB = ((minute - 250) * 0.45) + (evening * 0.35) + (weekend * 0.25);
            // round plan B to 2 decimal places
            planB = Math.round(planB * 100) / 100.0;
            // state the total cost for Plan B
            System.out.println("Plan B costs " + planB + ".");
        }
        // when plan B is cheapest
        if (planA > planB) {
            System.out.println("Plan B is cheapest.");
        }
        // when plan a is chepest 
        if (planA < planB) {
            System.out.println("Plan A is cheapest.");
        }
        // when both plans are the smae price
        if (planA == planB) {
            System.out.println("Plan A and B are the same price");
        }
    }
}
