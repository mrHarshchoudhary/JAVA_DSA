package oops;

public class wrapperclasses {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    swap(a, b);
    System.out.println(a + " " + b);
    // final int bouns =2;
    // bouns=3;
   final A kunal=new A("harsh");
   kunal.name="other name";
   //when a non primitive is final you cannot reassign it 
  //  kunal=new A("new object");///like this

  }
  static void swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
  }
}
class A{
  final int num=10;
  String name;
  public A(String name){
    this.name=name;
  }
}

// In the provided code, the variables a and b are primitive types, and Java uses pass-by-value. When you pass a and b to the swap method, copies of their values are made, and the method operates on those copies, not the original variables.