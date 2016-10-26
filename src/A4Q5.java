
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // system input
        Scanner input = new Scanner(System.in);

        // ask user for name
        System.out.println("Please enter your name");
        String name = input.nextLine();

        // What is test one out of
        System.out.println("What was the first test out of?");
        double onetest = input.nextDouble();
        // What was the mark of test one
        System.out.println("What mark did you get?");
        double onemark = input.nextDouble();
        // Average of test one
        double onefinal = (onemark / onetest) * 100;

        // What is test two out of
        System.out.println("What was the second test out of?");
        double twotest = input.nextDouble();
        // What was the mark of test two
        System.out.println("What mark did you get?");
        double twomark = input.nextDouble();
        // Average of test two
        double twofinal = (twomark / twotest) * 100;

        // What is test three out of
        System.out.println("What was the third test out of?");
        double threetest = input.nextDouble();
        // What was the mark of test three
        System.out.println("What mark did you get?");
        double threemark = input.nextDouble();
        // Average of test three
        double threefinal = (threemark / threetest) * 100;

        // What is test four out of
        System.out.println("What was the fourth test out of?");
        double fourtest = input.nextDouble();
        // What was the mark of test four
        System.out.println("What mark did you get?");
        double fourmark = input.nextDouble();
        // Average of test four
        double fourfinal = (fourmark / fourtest) * 100;

        // What is test five out of
        System.out.println("What was the fifth test out of?");
        double fivetest = input.nextDouble();
        // What was the mark of test five
        System.out.println("What mark did you get?");
        double fivemark = input.nextDouble();
        // Average of test five
        double fivefinal = (fivemark / fivetest) * 100;

        // Give the averages for all tests

        // Name of user
        System.out.println("Test Scores for " + name + ":");

        // test 1
        System.out.println("Test 1: " + onefinal + "%");

        // test 2
        System.out.println("Test 2: " + twofinal + "%");

        // test 3
        System.out.println("Test 3: " + threefinal + "%");

        // test 4
        System.out.println("Test 4: " + fourfinal + "%");

        // test 5
        System.out.println("Test 5: " + fivefinal + "%");

        // calculate the total average of all tests
        double average = (onefinal + twofinal + threefinal + fourfinal + fivefinal) / 5;

        // show average
        System.out.println("Average: " + average + "%");
    }
}
