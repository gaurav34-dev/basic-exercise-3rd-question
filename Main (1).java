import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("please enter two numbers");
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    //b=(a*b)/b;
    //a=(a*b)/a;
    //System.out.println("value of a is "+ a);
    //System.out.println("value of b is "+ b);
    int z=a+b;
    System.out.println(z+30);
}
}

