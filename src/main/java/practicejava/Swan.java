package practicejava;

public class Swan {

  int numberOfEggs; //instance variable

  public static void main(String[] args) {

    Swan mother = new Swan();
    mother.numberOfEggs = 3; // set variable

    System.out.println("The swan mother has " + mother.numberOfEggs + " eggs"); // read variable.
  }

}
