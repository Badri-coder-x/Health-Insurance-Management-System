package Services;
import java.util.Scanner;

public class Validation {
	
	public boolean isValidString(String str) {
		
		return (str !=null && str.trim().isEmpty());
		
	}
	
	public static int inputValidInteger(String msg) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(msg);
		
		int val;
		
		while(true) {
			String valstr = scanner.next();
			try {
				val = Integer.parseInt(valstr);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Integer!  please enter again: ");
//				scanner.nextLine();
			}
			
		}
		return val;
		
	}
}
