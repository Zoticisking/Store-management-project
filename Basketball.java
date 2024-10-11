/*
 * Represents basketball stuff that can be sold at the Sports Store
 * Basketball has sneakers and sleeves
 */

public class Basketball extends Sports{

  String sneakers;
  String sleeves;

  
  /*
   * Sets the basketball's sneakers to "Giannis Immortality 4", sleeves to arm sleeves
   */

  public Basketball(){
super();
    sneakers = "Giannis Immortality 4";
    sleeves = "arm sleeves";
  }

   /*
   * Sets the sport to the specified sport, the price to the
   * specified shoes, the price to the specified size,  
   */

public Basketball(double price, double size, String sneakers, String sleeves){
  super(price, size);
  this.sneakers = sneakers;
  this.sleeves = sleeves;
}

 /*
   * Returns the value assigned to sneakers
   */

 public String getSneakers(){
    return sneakers;
  }

  /*
   * Returns the value assigned to sleeves
   */

 public String getSleeves(){
    return sleeves;
  }
  /*
   * Sets sneakers to newSneakers
   */

  public void setSneakers(String newSneakers){
    sneakers = newSneakers;
  }
  /*
   * Sets sleeves to newSleeves
   */

  public void setSleeves(String newSleeves){
    sleeves = newSleeves;
  }

public String toString(){
  return "Sneakers: " + sneakers + "\nSleeves: " + sleeves + "\n" + super.toString();
}

}

