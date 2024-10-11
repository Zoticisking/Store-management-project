/*
 * Represents Soccer stuff that can be sold at the Sports Store
 * Soccer has cleats and shinguards
 */

public class Soccer extends Sports{

  private String shinguards;
  private String cleats;
 /*
   * Sets the soccer cleats to "nike mercurial superfly 9", shinguards to "nike shinguards"
   */

  public Soccer(){
    super();
    shinguards = "nike shinguards";
    cleats = "nike mercurial superfly 9";
  }

  /*
   * Sets the cleat to the specified cleat, the price to the
   * specified price, the amount to the specified amount, the shingaurd to the specified shingaurd
   */

  public Soccer(double price, double amount, String shinguards, String cleats){
    super(price, size);
    this.shinguards = shinguards;
    this.cleats = cleats;
  }


  /*
   * Returns the value assigned to shingurds
   */

public String getShinguards(){
  return shinguards;
}
 /*
   * Returns the value assigned to cleats
   */

  public String getCleats(){
    return cleats;
  }

  /*
   * Sets shinguards to newshinguards
   */

  public void setShinguards(String newShinguards){
    shinguards = newshinguards;
  }
  /*
   * Sets cleats to newCleats
   */

  public void setCleats(String newCleats){
    cleats = newcleats;
  }

public String toString(){
  return "Shinguards: " + shinguards + "\nCleats: " + cleats + "\n" + super.toString();
}
  
}

