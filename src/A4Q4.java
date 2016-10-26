
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System input
        Scanner input = new Scanner(System.in);

        // ask user for cost of food
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();

        // ask user for cost of dj
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();

        // ask user for cost of rent
        System.out.println("How much does it cost to rent the hall?");
        double rent = input.nextDouble();

        // ask user for cost of decorations
        System.out.println("How much does decorations cost?");
        double deco = input.nextDouble();

        // ask user for cost of staff
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();

        // ask user for cost of misc
        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextDouble();

        // calculations to find break even

        // add up the total cost
        double total = food + dj + rent + deco + staff + misc;

        // divide total expense by cost per ticket to identify how many tickets that need to be sold to cover expenditures
        double answer = total / 35;
        answer = Math.ceil(answer);

        // input final answer
        System.out.println("The total cost is " + total + "." + " You will need to sell " + answer + " tickets to break even.");
    }
}
