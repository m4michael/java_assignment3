import java.util.Scanner;

public class Q5 {

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number=");
        int num1=sc.nextInt();
        System.out.println();

        System.out.print("Enter number=");
        int num2=sc.nextInt();

        int num3=num1^num2;
        int count=0;

        while(num3>0){

            num3=num3&(num3-1);

            count++;
        }

        System.out.println("number of bits flipped="+count);





        }


    }
    

