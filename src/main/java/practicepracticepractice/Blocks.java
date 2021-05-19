package practicepracticepractice;

public class Blocks {

  /** Code blocks do not add any overhead. In fact because of their ability
  to simplify the coding of certain algorithms, their use generally increases
   speed and effiency.
*/

  public static void main(String[] args) {
    double i, j, d;

    i = 5;
    j = 10;
// This block of code only executes when the if is true.
    if(i != 0) {
      System.out.println("i does not equal zero");
      d = j / i;
      System.out.println("J / i is " + d);
    }
  }

}
