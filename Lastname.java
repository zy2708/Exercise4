import java.util.Scanner;
public class Lastname{
	public static void main(String[]args){
		System.out.println("Enter your full name:");
		Scanner sc=new Scanner(System.in);
		String fullname=sc.nextLine();
		System.out.println(fullname);
		String [] name=fullname.split(" ");
		String lastname=name[name.length-1];
		System.out.println("Hello Mr./Ms. "+lastname+"!");
	}
}
