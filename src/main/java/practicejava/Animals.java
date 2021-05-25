package practicejava;

/**
 * Keywords are special words reserved by Java. The public keyword is the access modifier Public, to
 * allow other classes or packages to access this class and the members. The class keyword is what
 * defines this line of code as a class. The word Animal is the name of the class.
 */
public class Animals {

  /**
   * variable named "name". String is the type of the variable.
   */
  String name;

  /**
   * a method is an operation which can be called upon again. Since it is public, it can be called
   * upon from other classes.
   * Line 21 returns the type of this method as a String.
   */
  public String getName() {
    return name;
  }

  /**
   * A method who's return type is void. Void means that no return type is returned at all.
   * This method requires information to be supplied to it from the calling method: this information
   * is called the parameter, which in this case is called newName.
   * @param newName
   * The parameter expects a String type to be passed into it, and will return nothing.
   */
  public void setName(String newName) {
    name = newName;
  }
}
