import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
Sports store = new Sports();
Soccer one = new Soccer(85.99, 9.5, "Shinguard", "Cleats");
    Basketball two = new Basketball(91.99, 9.5, "Sneakers", "Sleeves");
  // prints in what the store has 
    System.out.println(store);
    System.out.println();
    
    System.out.println(one);
System.out.println();
    
    System.out.println(two);




    // Closes the Scanner object
    input.close();
    
  }
}