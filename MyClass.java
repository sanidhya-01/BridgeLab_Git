INSTANT VARIABLE LOCAL VARIABLE STATIC VARIABLE
public class MyClass {
    int b;/*instatnt variable*/
    static int s; /* static variable*/
    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }
    public static void main(String []args){

        int a;/*local variable*/
        System.out.println();
    }
}



Declarations and intitialization
public class MyClass{
    /*int a; we have to declare in the same line .
    a=2;*/
    int a=2;

    public static void main(String[] args){
        int b;/* Declarations*/
        b=1;/*Initialization*/
        System.out.println("main method");
    }
}


//EXAMPLE TO PRINT NAME
public class MyClass{
  //  System.out.println("Sanidhya");
    public static void main(String[]args){
        System.out.println("Sanidhya");
        int a=1;
        int b=2;
        int c=a+b;
        int d=a-b;
        System.out.println(c);
        System.out.println(d);
    }
}

//