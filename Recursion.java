import java.util.*;
public class Main{
    public static void main(String args[]){
        System.out.println("before fun2");
        fun2();
        System.out.println("After fun2");
    }
    public static void fun2(){
        System.out.println("before fun1");
        fun1();
        System.out.println("after fun1");
    }
    public static void fun1(){
        System.out.println("fun1");
    }
}
