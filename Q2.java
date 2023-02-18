import java.util.Scanner;

public class Q2 {

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Swapping of two numbers\n");
        System.out.print("Enter First number:");
        int num1=sc.nextInt();
        System.out.println();

        System.out.print("Enter second number:");
        int num2=sc.nextInt();

        System.out.println();

        System.out.println("Before Swapping");
        System.out.println("x="+num1+" y="+num2+"\n");

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swapping\n");
        System.out.println();

        System.out.println("x="+num1+" y="+num2);


    


    }
    
}
