public class TestOverride{
  public static void main(String [] arg){
    A a = new A();
    a.p(10);
    a.p(10.0);
  }
}

class B{
  public void p(double i){
    System.out.println(i*2);
  }
}
class A extends B{
  public void p(double i){
    System.out.println(i);
  }
  
}