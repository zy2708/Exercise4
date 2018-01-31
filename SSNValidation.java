import java.util.Scanner;
public class SSNValidation{
	public static void main(String[]args){
		System.out.println("Enter your SSN number:");
		Scanner keyboard=new Scanner(System.in);
		String SSN=keyboard.nextLine();
		String format="[0-9]{3}-[0-9]{2}-[0-9]{4}";
		if(SSN.matches(format)){
			System.out.println(SSN+" is a valid SSN.");
		}
		else{
			System.out.println(SSN+" is not a valid SSN.");
		}
	}
}
