// import java.util.Scanner;

// public class Method {


    // static void greet() {
    //     System.out.println("hello world");
    // }

    // static String greet() {
    //     return "Hello world";
    // }


    // static void sum() {
    //     int a = 20 , b=30;
    //     System.out.println(a+b);
    // }

    // static void sum(int a , int b) {
    //     System.out.println( " sum of a and b = "+ (a+b));
    // }

    // static void add (int a , int b) {
    //     System.out.println(a+b);
    // }


    // static void add(int a , int b , int c) {
    //     System.out.println(a+b+c);
    // }

    // static  void show(int a ) {
    //     System.out.println(a);
    // }

    // static void show(double s , double d){
    //     System.out.println(s + d);
    // }

    // static void show(String b){
    //     System.out.println(b);
    // }

    // static void print(int a , String b){
    //     System.out.println(a + " " + b);
    // }


    //// not valid type 
    /// 
    /// 
    /// 
    // static int calculate (int a ) {
    //     return a *2;
    // }


    // static double calculate(int a) {
    //     return a*2;
    // }

    ///
    /// /
    /// 
    /// 
    /// 
    /// 
    /// 
    /// 


    // public static void main(String[] args) {
    //     System.out.println("hello methods");

        // System.out.println(greet());
        // sum();
        // sum();

        // sum(12, 34);
        // sum(67 , 88);

        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter first no");
        // int x = sc.nextInt();
        // System.out.println("enter second no");
        // int y  = sc.nextInt();

        // sum( x ,y);


        // check the no is even or odd => make a function 
        // create a function to print the table of user input 
        // count even and odd no in the digit /by user input  =>   56568 => even = 3 , odd = 2
        // make a calculator 
        // square of the no 
        // prime no 



        // add(12,45);
        // add(23,45,67);
        // show(78);
        // show(12, 34);
        // show("java");

        // print(12, "suman");
        // System.out.println(calculate(34));
//     }

// }



public class Method {


    // static  void show (int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //      show(n-1);
    //     System.out.println(n);       
    // }

    static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        }

        return n* factorial(n-1);


    }

    public static void main(String[] args) {
        System.out.println("hello methods");

        // show(6);
        System.out.println(factorial(5));
    }
}



// 5 => 5 * 4!
// 4 => 4 * 3!
// 3 = 3 * 2!






