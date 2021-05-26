package practicejava;

public class Chicken {

  int numEggs = 2; //initializing a field on line.

  private String name = "Fluffy"; //3rd initializes name Fluffy
  {
    System.out.println("Setting field"); //4th prints line statement.
  }

  public Chicken() {
    name = "Duke"; //initializing a field in a constructor.
    System.out.println("Setting Constructor");
  }

  public static void main(String[] args) { //1st
    Chicken chicken = new Chicken(); //2nd calls the constructor of Chicken.
    System.out.println(chicken.name);
  }

}
