package oop_lab4;
//1. Overload method
//2. Overloading method
//3. Method Overload
public class OverLoadMethod {
    public static void A() {
        System.out.println("Hello A");
    }
    public static void A (int X) {
        System.out.println("Hello A" + X);
    }
    public static void A (int x, int y){
        System.out.println("Hello A"+(x+y));
    }
    public static void B (){
        System.out.println("Hello B");
    }
    public static void (){
    A();
    A(x:10);
    A(x:10, y:20);
    B();
    }//main
}//class
