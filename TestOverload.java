public class TestOverload{
  public static void main(String [] arg){
    A a = new A();
    a.p(10);
    a.p(10.0);
  }
}

class C{
  public void p(double i){
    System.out.println(i * 2);
  }
}
//class D extends C{
//  public void p(int i){
//    System.out.println(i);
//  }
//  
//}