package practicepracticepractice;

public class LearnMethod {

  static void myMethod(String name, int age) {
    System.out.println(name + "Dawson is " + age);
  }

   static int myMethod2(int x) {
    return x + 2;
  }

  static int myMethod3(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    myMethod("SaraLouise ", 29);
    myMethod("Rebecca ", 28);
    myMethod("Hana ", 25);
    myMethod("Keith ", 23);
    System.out.println(myMethod2(3));
    // Putting the result of x + y into a variable (z).
    int z = myMethod3(7, 10);
    System.out.println(z);
  }

}
