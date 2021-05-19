package controllingprogramflow;

/**
  for(initialization, condition, iteration)

 The initialization portion of the loop sets the control variable to an inital value.

 The condition portion is a Boolean expression that checks the loop control variable.
 If the outcome of the test is true, statement executes and the for loop continues to iterate.
 If the outcome of the test is false, the loop terminates.

 The iteration portion of the for statement effects how the loop control variable changes
 each time the loop iterates.
 */

public class ForStatements {

  public static void main(String[] args) {
    int count;

    for(count = 0; count < 5; count++)
    System.out.println("This is count " + count);

    System.out.println("Done!");

  }


}
