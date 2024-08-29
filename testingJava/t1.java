package testingJava;
// add input method
import java.util.Scanner;

public class t1 {
    // Welcome Method
    public void welcome(){
        System.out.println("Welcome to the Calculator App! ");
    }
    // Addition Method
    public int add(int a, int b){
        return a+b;
    }
    // Subtraction Method
    public int subtract(int c, int d){
        return c-d;
    }
    // Multiplication Method
    public int multiply(int e, int f){
        return e * f;
    }
    public int divide(int g, int h){
        return g/h;
    }
    public static void main(String[] args){
        // Say Hello
        t1 sayHi = new t1();
        sayHi.welcome();

        // Take User inputs
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();

        // Todo:  FIX this error
        // Scanner n1 = new Scanner(System.in);
        // String num1 = n1.nextLine();

        // Scanner n2 = new Scanner(System.in);
        // String num2 = n2.nextLine();
        
        if ("+".equals("+")){
            System.out.println("Yay you typed +");
            t1 addition = new t1();
            int sum = addition.add(5, 5);
            System.out.println("Your answer is: " + sum);
        } 
        
        else if(response.equals("-")){
            System.out.println("SUBTRACTION");
            t1 subtraction = new t1();
            int minus = subtraction.subtract(5, 5);
            System.out.println("Your answer is: " + minus);
        } 
        
        else if(response.equals("/")){
            System.out.println("DIVISION");
            t1 division = new t1();
            int res = division.divide(5, 5);
            System.out.println("Your answer is: " + res);
        }
        
        else if(response.equals("*")){
            System.out.println("MULTIPLICATION");
        }
        
        else {
            System.out.println("TRY AGAIN MY BOY");
        }

        input.close();

    }
}