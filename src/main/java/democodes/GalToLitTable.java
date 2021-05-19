package democodes;

public class GalToLitTable {

  public static void main(String[] args) {

    double gallons;
    double liters;
    int counter;

    counter = 0;
    for(gallons = 1; gallons <= 100; gallons++) {
      liters = gallons * 3.7854; //converting to liters
      System.out.println(gallons
          + " gallons is "
          + liters
          + " liters.");

      counter++; //Counter is increased with every loop iteration
      //puts a blank line every 10th line
      if (counter == 10) {
        System.out.println();
        counter = 0;
      }
    }
  }

}
