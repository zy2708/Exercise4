import java.util.Scanner;
import java.lang.*;

public class Squareroot{
        public static void main(String[]args){
                System.out.println("Enter a number to find its square root:");
                Scanner sc=new Scanner(System.in);
                Double number=sc.nextDouble();
                Double squareroot=Math.sqrt(number);
                System.out.println("The square root of "+number+" is "+squareroot+".");}
}
