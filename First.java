import java.util.Scanner;
public class First{
    public static void main (String arg[]){
        Scanner num = new Scanner (System.in);
        System.out.println("");
        System.out.print("Enter the value of A : ");
        int A = num.nextInt();
        System.out.print("Enter the value of B : ");
        int B = num.nextInt();
        System.out.print("Enter the value of C : ");
        int C = num.nextInt();
        if ((A>B)&&(A>C)){
            System.out.println("A is largest number : " + A);
        }
        else if (B>C){
            System.out.println("B is largest number : " + B);
        }
        else if (C>B){
            System.out.println("C is largest number : " + C);
        }
        num.close();
    }
}