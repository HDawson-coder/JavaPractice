package PracticePracticePractice;

public class MoreMethod {

  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("YOUU. SHALLL. NOT. PAAASSSS!");
    } else {
      if (age > 18) {
        System.out.println("Fly you fools!!");
      }
    }

  }

  public static void main(String[] args) {
    checkAge(33);
  }
}
