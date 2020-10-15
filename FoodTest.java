public class FoodTest{
  public static void main(String[] args){
    //Food broccoli = new Food();
    Food unknownVeg = new Vegetable(0.20,0.30,0.50);
    unknownVeg.setCalories(10);
    System.out.println(unknownVeg.getCalories()); 
    
    // Which methods will be called?....
    System.out.println(unknownVeg.percentProtein()); 
    System.out.println(unknownVeg.percentFat());
    System.out.println(unknownVeg.percentCarbs());
    
    Vegetable firstBroccoli = new Broccoli();
    firstBroccoli.setCalories(100);
    
    System.out.println(firstBroccoli.getCalories()); 
    
    // Which methods will be called?....
    System.out.println(firstBroccoli.percentProtein()); 
    System.out.println(firstBroccoli.percentFat());
    System.out.println(firstBroccoli.percentCarbs());
    
    Broccoli secondBroccoli = new Broccoli();
    secondBroccoli.setCalories(1000);
    
    System.out.println(secondBroccoli.getCalories()); 
    
    // Which methods will be called?....
    System.out.println(secondBroccoli.percentProtein()); 
    System.out.println(secondBroccoli.percentFat());
    System.out.println(secondBroccoli.percentCarbs());
    
    Food thirdBroccoli = new Broccoli();
    thirdBroccoli.setCalories(10000);
    
    System.out.println(thirdBroccoli.getCalories()); 
    
    // Which methods will be called?....
    System.out.println(thirdBroccoli.percentProtein()); 
    System.out.println(thirdBroccoli.percentFat());
    System.out.println(thirdBroccoli.percentCarbs());
    
    Food firstCel = new Celery();
    firstCel.setCalories(100);
    System.out.println(firstCel.getCalories());
    System.out.println(firstCel.percentProtein()); 
    System.out.println(firstCel.percentFat());
    System.out.println(firstCel.percentCarbs());
  }
  
  
}