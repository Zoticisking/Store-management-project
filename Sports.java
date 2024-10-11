/*
 * Represents sports that a Sports Store sells
 */

public class Sports{

  private String typeofBall;    
  private double price; 
  private double size; 

 /*
   * Sets the size to 9.5, price to 10.99,
   */


  public Sports(){
    price = 10.99;
    size = 9.5;
  }
  /*
   * Sets sports to the specified shoe, price to the specified price
   and size to the specified size
   */

  public Sports(double price, int amount){
    this.price = price;
    this.size = size;
  }

 /*
   * Returns the value assigned to price
   */

  public double getPrice(){
    return price;
  }
 /*
   * Returns the value assigned to size
   */

  public double getSize(){
    return size;
  }
  /*
   * Sets price to newPrice
   */

  public void setPrice(double newPrice){
    price = newPrice;
  }
  /*
   * Sets size to newSize
   */

  public void setSize(double newSize){
    size = newSize;
  }

  public String toString(){
return "Price: " + price + "Size: " + size;
  }



  
}

