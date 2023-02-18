import java.util.Scanner;

public class Q3 {
    
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        int sum=0;

        System.out.print("Enter a number:");

        int num1=sc.nextInt();

        while(num1>0){

            sum=sum+(num1%10);

            num1=num1/10;
        }
        System.out.println("sum of digits ="+sum);



        }


        

    }



