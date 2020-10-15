/* The (old) food pyramid recommends what to eat each day
 * There are six categories (fats, oils, sweets), 
 * (meats, poultry, fish, nuts), (milk, yogurt, cheese),
 * (vegetables), (fruits), (bread, cereal, pasta).
 * To model this food pyramid, we can have them each be
 * actual subclasses of an abstract class called Food
 * */

/** Abstract class that models a kind of food */
public abstract class Food{
  /** Data fields*/
  private double calories;
  
  // Abstract methods
  /** Calculates the percent of protein in a Food object*/
  public abstract double percentProtein();
  /** Calculates the percent of fat in a Food object*/
  public abstract double percentFat();
  /** Calculates the percent of carbs in a Food object*/
  public abstract double percentCarbs();
  
  // Actual methods
  public double getCalories(){
    return calories;
  }
  public void setCalories(double cal){
    calories = cal;
  }
  
}

class Vegetable extends Food{
  double vegProtein, vegFat, vegCarbs;
  public Vegetable(double vegProtein, double vegFat, double vegCarbs){
    super(); // unnecessary - will implicitly call 
    // the no-arg constructor in Food
    this.vegProtein = vegProtein;
    this.vegFat = vegFat;
    this.vegCarbs = vegCarbs;
  }
  
  public double percentProtein(){
    System.out.println("Vegetables's percentProtein()");
    return (vegProtein*getCalories());
  }
  
  public double percentFat(){
    System.out.println("Vegetables's percentFat()");
    return (vegFat*getCalories());
  }
  
  public double percentCarbs(){
    System.out.println("Vegetables's percentCarbs()");
    return (vegCarbs*getCalories());
  }
}

class Broccoli extends Vegetable{
  public Broccoli(){
    super(0.27, 0.08,0.65);
  }
  public double percentProtein(){
    System.out.println("Broccoli's percentProtein()");
    return (vegProtein*getCalories());
  }
  
  public double percentFat(){
    System.out.println("Broccoli's percentFat()");
    return (vegFat*getCalories());
  }
  
  public double percentCarbs(){
    System.out.println("Broccoli's percentCarbs()");
    return (vegCarbs*getCalories());
  }
  
}

class Celery extends Vegetable{
  public Celery(){
    super(0.17, 0.09,0.73);
  }  
}