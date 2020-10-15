public class PizzaPlace{
  private int order;
  private static double deliveryTime;
  public static int pepperoni;
  public static int cheese;
  public static PizzaQueue Dough;
  public static PizzaQueue PizzaOrders;
  private String defaultTimeStamp ="99/99,99/99";
  /**
   * Constructor 
   */
  public PizzaPlace(String [] dailyDoughOrder){
    this.pepperoni = 20;
    this.cheese = 20;
    this.deliveryTime = 15;
    this.Dough = new PizzaQueue();
    this.PizzaOrders = new PizzaQueue();
    for(int i=0; i < dailyDoughOrder.length; i++){
      Dough.push(dailyDoughOrder[i]);
    }
  }

  /**
   * Takes a customer order, creates a Pizza object, 
   * and adds the day and time it was ordered it to the PizzaOrders PizzaQueue, 
   * returns the order
   */
  public Pizza takeOrder(int pepperoni, int cheese, String time){
    if(this.cheese > 0){
    Pizza pizzaOrder = new Pizza(pepperoni);
    PizzaOrders.push(time);
    order++;
    changeDeliveryTime();
    this.cheese -= cheese;
    this.pepperoni -= pepperoni;
    Dough.pop();
    return pizzaOrder;
    }else{
      System.out.println("Not enough ingredients");
      return null;
    }
  }
  /**
   * Buy dough, fill to capacity
   */
  public void buyDough(){
    for (int i = Dough.getSize(); i < 20; i++) {
      Dough.push(defaultTimeStamp);
    }
  }
  /**
   * Buy Cheese, fill to capacity
   */
  public void buyCheese(){
    cheese = 20;
    
  }
  /**
   * Buy Pepperoni, fill to capacity
   */
  public void buyPepperoni(){
    pepperoni = 20; 
  }
  
  /**
   * Change the delivery time (cannot go below 15)
   */
  public void changeDeliveryTime(){
    if(PizzaOrders.getSize() <= 5){
      deliveryTime = 15;
    }else if(PizzaOrders.getSize() <=10){
      deliveryTime = 30;
    }else if(PizzaOrders.getSize() <=15){
      deliveryTime = 45;
    }else if(PizzaOrders.getSize() <=20){
      deliveryTime = 60;
    } 
  }
  
  /**
   * Once an order has been delivered, remove it from the pizza queue.
   */
 public void delivered(){
   PizzaOrders.pop();
   order--;
   changeDeliveryTime();
  }
  
  /**
   * Return the time and date of the oldest order (not delivered) was placed
   */
  public String queryTimeOrdered(){
    return PizzaOrders.peek();
    
  }
  /**
 * Lets user see the first element of the Queue.
 */
  public String queryOldestDough(){
    return Dough.peek();
    
  }
  
}