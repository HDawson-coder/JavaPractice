package PracticePracticePractice;

public class ThisKeyword {
  int x;

  // This is a constructor
  public ThisKeyword(int x) {
    this.x = x;
  }

  // Calling the constructor
  public static void main(String[] args) {
    ThisKeyword myObj = new ThisKeyword(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
