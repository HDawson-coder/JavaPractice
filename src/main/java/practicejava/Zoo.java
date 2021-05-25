package practicejava;

public class Zoo {

  /**
   * The job of the main method is to declare the entry point.
   * @param args
   * Public is the access modifier, any class within the entire application can access this.
   *
   * Static binds a method to it's class. This allows the method to be called just by the class name,
   * such as writing Zoo.main(). This allows main to be called without creating an object of the class Zoo.
   *
   * If the main method is not in the class we name with the .java executable, the process will throw
   * an error and terminate.
   * If a main method is written without the static keyword, the program will throw an exception.
   *
   * The keyword void represents the return type for this method. A method that returns a void type
   * returns no data, and instead returns control to the caller silently.
   * In general, void return types are good for methods that change the objects state.
   */
  public static void main(String[] args) {

    String[] zoos = {"Denver", "San Diego"};

    System.out.println(zoos[0]);
    System.out.println(zoos[1]);
  }

}
