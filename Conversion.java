import java.util.Scanner;
public class Conversion{
	public static void main(String[]args){
		System.out.println("Enter a number or a character:");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char ch=input.charAt(0);
		if(Character.isDigit(ch)){
			System.out.println("The input is a number.");
			int i=Integer.valueOf(input);
			System.out.println("The binary number of the number is "+Integer.toBinaryString((int)i)+".");
		}
		else{
			System.out.println("The input is a charcater.");
			System.out.println("The hex number of the character is "+Integer.toHexString((int)ch)+".");
			System.out.println("The binary number of the character is "+Integer.toBinaryString((int)ch)+".");
		}
		
	}
}
