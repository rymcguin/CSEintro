import java.util.Scanner;
public class Fibbonacci{
  public static void main(String [] arg){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Integer: ");
    int n = scnr.nextInt();
    double answer = fibbonacci(n);
    System.out.println("The fibonanci sequence of " + n + " is equal to " + answer + ".");
    
  }
/*
 product = 1;
for(i = n:1 down to 1){
product*=1;
}
for all postivie integers less than n

n! = n(n-1)(n-2)...(2)(1)
public static long factorial(int n){

if(n==0)//basecase{
return 1;
}else{
return n * factorial(n-1);//recursive call
}
}
public static long factorialInt(int n){
int result = 1;
while(n>0){
result *= n;
--n;
}
return result;
}

}


fibonacci:
F0=0; F1=1; Fn= Fn-1+ Fn-2
*/
public static int fibbonacci(int n){
if(n==0){
return 0;
}else if (n==1){
return 1;
}else{
  
  System.out.println(n);
 return n = fibbonacci(n-1) + fibbonacci(n-2);
}

}
}

