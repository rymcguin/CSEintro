public class PizzaTest{
  
  public static void main(String[] args){
    // Test Pizza Class:
    // Note that these instances are independent
    // of any PizzaPlace instance.
    Pizza order1 = new Pizza();
    if (order1.getPepperoni()){
      System.out.println("This order should not have pepperoni. " +
                         "Check your default Pizza constructor.");
    }
    
    
    Pizza order2 = new Pizza(1);
    if (!order2.getPepperoni()){
      System.out.println("This order should have pepperoni. " +
                         "Check your 1-arg Pizza constructor.");
    }
    
    // Test PizzaQueue:
    // Again note that these instances are 
    // independent of any PizzaPlace instance.
    PizzaQueue testQueue = new PizzaQueue();
    if (!testQueue.empty()){
      System.out.println("Your queue should be empty.  Check your " +
                         "no-arg constructor and/or empty() method");
    }
    /**Comment */
    String firstElem = testQueue.peek();
    if (firstElem != null){
      System.out.println("Your queue should have nothing in it.  Check your " +
                         "peek method");      
    }
    
   firstElem = testQueue.pop();
    if (firstElem != null){
      System.out.println("Your queue should have nothing in it.  Check your " +
                         "pop method");      
    }
    
    testQueue.push("01/01, 05:00");    
    testQueue.push("01/01, 05:15");
    if(!testQueue.peek().equals("01/01, 05:00")){
      System.out.println("Check your peek method - it should " +
                         "return the *first* element in the Queue.");
    }
    if (testQueue.getSize() != 2){
      System.out.println("ERROR: Check how you maintain the size " +
                         "data field.");
    }
    testQueue.push("01/01, 05:30");
    testQueue.push("01/01, 05:45");
    testQueue.push("01/01, 06:00");
    testQueue.push("01/01, 06:15");
    testQueue.push("01/01, 06:30");
    testQueue.push("01/01, 06:45");
    testQueue.push("01/01, 07:00");
    testQueue.push("01/01, 07:15");
    testQueue.push("01/01, 07:30");
    testQueue.push("01/01, 07:45");
    testQueue.push("01/01, 08:00");
    testQueue.push("01/01, 08:15");
    testQueue.push("01/01, 08:30");
    testQueue.push("01/01, 08:45");
    testQueue.push("01/01, 09:00");
    testQueue.push("01/01, 09:15");
    testQueue.push("01/01, 09:30");
    testQueue.push("01/01, 09:45");
    if (testQueue.getSize() != 20){
      System.out.println("ERROR: Check how you maintain the size " +
                         "data field.");
    }
    
    String popFirst = testQueue.pop();
    if(!popFirst.equals("01/01, 05:00")){
      System.out.println("Check your pop method - it should " +
                         "return the first element added.");
    }
    String newFirst = testQueue.peek();
    if(!newFirst.equals("01/01, 05:15")){
      System.out.println("Check your pop method - it should " +
                         "return the first element added.");
    }
    
    if(testQueue.getSize() != 19){
      System.out.println("Check your pop method - it should " +
                         "decrement the size after popping.");
    }
    
    
    // Test PizzaPlace Constructor
    String[] dailyOrder = {"01/01, 5:00", "01/01, 05:15", "01/01, 05:30", "01/01, 05:45",
      "01/01, 06:00", "01/01, 06:15", "01/01, 06:30", "01/01, 06:45", "01/01, 07:00", 
      "01/01, 07:15", "01/01, 07:30", "01/01, 07:45", "01/01, 08:00"}; // Only 13 elements.
    PizzaPlace Bennys = new PizzaPlace(dailyOrder);
    System.out.println(Bennys.Dough.toString());
    System.out.println();
    System.out.println();
    System.out.println("If the previous array doesn't contain 20 total elements, " + 
                       "or, if your constructor doesn't display an error statement of some kind, " +
                       "modify your constructor to handle this.");
    System.out.println();
    System.out.println();
    String[] fullDailyOrder = {"01/01, 5:00", "01/01, 05:15", "01/01, 05:30", "01/01, 05:45",
      "01/01, 06:00", "01/01, 06:15", "01/01, 06:30", "01/01, 06:45", "01/01, 07:00", 
      "01/01, 07:15", "01/01, 07:30", "01/01, 07:45", "01/01, 08:00", "01/01, 08:15", 
      "01/01, 08:30", "01/01, 08:45", "01/01, 09:00", "01/01, 09:15", "01/01, 09:30", 
      "01/01, 09:45"}; 
    System.out.println();
    System.out.println();
    PizzaPlace PapaJohns = new PizzaPlace(fullDailyOrder);
    System.out.println("If the previous array doesn't contain 20 total elements, " + 
                       "modify your constructor (check out you build the date array).");
    System.out.println();
    System.out.println();
    System.out.println("Your dough has date and time: " + PapaJohns.Dough.toString());
    System.out.println();
    System.out.println();
    System.out.println("You have " + PapaJohns.pepperoni + " pepperoni orders to start your day");
    System.out.println();
    System.out.println();
    System.out.println("You have " + PapaJohns.cheese + " cheese orders to start your day");
    System.out.println();
    System.out.println();
    System.out.println("The order list status: " + PapaJohns.PizzaOrders.toString());
    
    
    // Test buy cheese, pepperoni, dough
    PapaJohns.buyDough();
    PapaJohns.buyPepperoni();
    PapaJohns.buyCheese();
    
    // Take some orders
    Pizza firstOrder = PapaJohns.takeOrder(1,1,"06/05, 05:00");
    System.out.println();
    System.out.println("The first order is a : " + firstOrder.toString());
    
    Pizza secondOrder = PapaJohns.takeOrder(0,1,"06/05, 05:05");
    System.out.println();
    System.out.println("The second order is a : " + secondOrder.toString());
    System.out.println();
    
    // Query ingredient levels
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // Order more and query again
    System.out.println("We're not full, so let's buy more:");
    PapaJohns.buyDough();
    PapaJohns.buyPepperoni();
    PapaJohns.buyCheese();
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // Test buying more (when full)
    System.out.println();
    PapaJohns.buyDough();
    PapaJohns.buyPepperoni();
    PapaJohns.buyCheese();
    
    // Check number of orders on cook line
    System.out.println("Orders on cook line: " + PapaJohns.PizzaOrders.getSize());    
    System.out.println();
    
    // Deliver both pizzas
    PapaJohns.delivered();
    PapaJohns.delivered();
    
    // Check that order line is empty
    System.out.println("Orders on cook line: " + PapaJohns.PizzaOrders.getSize());
    System.out.println();
    
    // Before the dinner rush hits, let's check out our dough
    // and make sure none of it is too old (should have a few
    // default date/time stamps from previous orders and ingredient
    // refills)
    System.out.println(PapaJohns.Dough.toString());
    System.out.println();
   
    // Dinner Rush: All cheese pizzas for some reason...
    PapaJohns.takeOrder(0,1,"06/05, 05:05"); //1
    PapaJohns.takeOrder(0,1,"06/05, 05:06"); //2
    PapaJohns.takeOrder(0,1,"06/05, 05:07"); //3
    PapaJohns.takeOrder(0,1,"06/05, 05:08"); //4
    PapaJohns.takeOrder(0,1,"06/05, 05:09"); //5
    PapaJohns.takeOrder(0,1,"06/05, 05:10"); //6
    PapaJohns.takeOrder(0,1,"06/05, 05:11"); //7
    PapaJohns.takeOrder(0,1,"06/05, 05:12"); //8
    PapaJohns.takeOrder(0,1,"06/05, 05:13"); //9
    PapaJohns.takeOrder(0,1,"06/05, 05:14"); //10
    // Check number of orders on cook line
    System.out.println("Orders on cook line: " + PapaJohns.PizzaOrders.getSize());    
    System.out.println();
    
    // Query ingredient levels
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // Order more and query again
    PapaJohns.buyDough();
    PapaJohns.buyPepperoni();
    PapaJohns.buyCheese();
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    
    // In come the pepperoni pizza orders...
    PapaJohns.takeOrder(1,1,"06/05, 05:15"); //11
    PapaJohns.takeOrder(1,1,"06/05, 05:16"); //12
    PapaJohns.takeOrder(1,1,"06/05, 05:17"); //13
    PapaJohns.takeOrder(1,1,"06/05, 05:18"); //14
    PapaJohns.takeOrder(1,1,"06/05, 05:19"); //15
    PapaJohns.takeOrder(1,1,"06/05, 05:20"); //16
    PapaJohns.takeOrder(1,1,"06/05, 05:21"); //17
    PapaJohns.takeOrder(1,1,"06/05, 05:22"); //18
    PapaJohns.takeOrder(1,1,"06/05, 05:23"); //19
    PapaJohns.takeOrder(1,1,"06/05, 05:24"); //20
    
    // Query ingredient levels
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // We haven't delivered any, can we take one more...?
    // (Remember, we can only have 20 orders on the line at once)
    PapaJohns.takeOrder(1,1,"06/05, 05:25"); //21
    System.out.println();
    
    // Let's deliver some so we don't lose any customers
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    PapaJohns.delivered();
    
    // Check number of orders on cook line
    System.out.println("Orders on cook line: " + PapaJohns.PizzaOrders.getSize());    
    System.out.println();
    
    // Now that we can take more orders, let's do it
    // Note: We haven't reupped ingredients manually....
    PapaJohns.takeOrder(1,1,"06/05, 06:05"); //1
    PapaJohns.takeOrder(1,1,"06/05, 06:06"); //2
    PapaJohns.takeOrder(1,1,"06/05, 06:07"); //3
    PapaJohns.takeOrder(1,1,"06/05, 06:08"); //4
    PapaJohns.takeOrder(1,1,"06/05, 06:09"); //5
    PapaJohns.takeOrder(1,1,"06/05, 06:10"); //6
    PapaJohns.takeOrder(1,1,"06/05, 06:11"); //7
    PapaJohns.takeOrder(1,1,"06/05, 06:12"); //8
    PapaJohns.takeOrder(1,1,"06/05, 06:13"); //9
    PapaJohns.takeOrder(1,1,"06/05, 06:14"); //10
    
    // Query ingredient levels
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // What happens when we place another order, but have no
    // ingredients....?
    PapaJohns.takeOrder(1,1,"06/05, 06:15"); //11
    // Query ingredient levels
    System.out.println("Amount of dough left: " + PapaJohns.Dough.getSize());
    System.out.println("Amount of pepperoni left: " + PapaJohns.pepperoni);
    System.out.println("Amount of cheese left: " + PapaJohns.cheese);
    System.out.println();
    
    // Let's check our orders:
    System.out.println("The next order to go out was placed at " +
                       PapaJohns.queryTimeOrdered());
    System.out.println();
    // Deliver one and check again
    PapaJohns.delivered();
    System.out.println("The next order to go out was placed at " +
                       PapaJohns.queryTimeOrdered());
    System.out.println();
    
    // Let's print our Dough queue again
    System.out.println(PapaJohns.Dough.toString());
      
  }
  
}