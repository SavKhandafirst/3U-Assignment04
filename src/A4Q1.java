
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask person for name
        System.out.println("Please enter your name");

        // Find Name
        String name = input.nextLine();

        // Say hello
        System.out.println("Hello " + name + ". How are you today?");
    }
}
