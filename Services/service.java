package Services;

import Entity.*;
import java.util.Scanner;
import DAO.HIMSDAO;

public class service {
	static Scanner scanner= new Scanner(System.in);
	
	public static void add_member() {
		System.out.println("enter name : ");
		String name=scanner.next();
		scanner.nextLine();
		int age=Validation.inputValidInteger("Enter your age: ");
		System.out.println("enter address: ");
		String address=scanner.nextLine();
		System.out.println("enter gender:");
		String gender=scanner.next();
		int salary=Validation.inputValidInteger("Enter your annual income:");
		int policyid=Validation.inputValidInteger("Enter your policy ID: ");
		plans pol = HIMSDAO.insMap.get(policyid);
		
		Members member =new Members(name, address, salary , age,gender,pol);
		int id = member.getid();
		HIMSDAO.memMap.put(id,member);
		System.out.println("susccessfully added....");
	}

	
	public static void claimAmount() {
		int id = Validation.inputValidInteger("Enter member id");
		if(!HIMSDAO.memMap.containsKey(id)) {
			System.err.println("Enter valid member id!");
			return;
		}
		Members mem = HIMSDAO.memMap.get(id);
		System.out.println("Enter amount to claim:");
		int amt = scanner.nextInt();
		int total = amt + mem.getClaimed();
		if(total<=mem.getpolicy().getClaimamount()) {
			System.out.println("Successfully claimed Rs"+amt);
			mem.claimed(amt);
		}
		else {
			System.out.println("Claim amount exceeds limit for the year");
		}
	}
}
