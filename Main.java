import java.util.Scanner;
/**
 *This program will take a positive integer and compute the factorial of that integer.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter an integer to calculate the factorial of
    System.out.println("Please enter an integer to calculate the factorial of");

    // declare a variable for users input
    int number = input.nextInt();

    // create the accumulator to add the count into
    int total = 1;

    // use a loop to create the factorial of the number
    for(int i = 1; i <= number; i++){

      // calculate the product of the loop number times the total to create a new total
      total = i * total; 
    }
    // print to the screen the number and its factorial
    System.out.println(number + "! " + "= " + total);
  }
}
