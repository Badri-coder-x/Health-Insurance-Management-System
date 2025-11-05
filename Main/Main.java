package Main;

import java.util.Scanner;
import DAO.HIMSDAO;
import Entity.plans;
import Services.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	  
	  plans p1 = new plans(1, "Silver", 2000, 400000, 2);
	  plans p2 = new plans(2, "Gold", 10000, 1000000, 4);
	  plans p3 = new plans(3, "Platinum", 50000, Integer.MAX_VALUE, 8);
	  HIMSDAO.insMap.put(1, p1);
	  HIMSDAO.insMap.put(2, p2);
	  HIMSDAO.insMap.put(3, p3);
	  int choice =0;
	  do
	  {
		  System.out.println("*******************************************");
		  System.out.println("Health Insurance Management System");
		  System.out.println("*******************************************");  
		  System.out.println("Main Menu......");
		  System.out.println("1.View Plan\n2.Add members\n3.View members\n4.Claim Insurance\n5.Upgrade policy\n6.Remove member\n7.Generate Reports\n8.Exit");
		  choice = Validation.inputValidInteger("Enter your choice:");
		  switch(choice) {
		  case 1:
			  System.out.println("Our Insurances Plans.... ");
			  plans.viewplan();
			  break;
		  case 2:
			  System.out.println("Adding Members.... ");
			  service.add_member();
			  break;
		  case 3:
			  System.out.println("Viewing Our Policy Members.... ");
			  UtilityFunctions.viewDetails();
			  break;
		  case 4:
			  service.claimAmount();
			  break;
		  case 5:
			  System.out.println("Upgrade Policy Plans.... ");
			  upgrading_plans.upgradePlanById();
			  break;
		  case 6:
			  System.out.println("Removing Members.... ");
			  remove.removemember();
			  break;		  
		  case 7:
			  System.out.println("Generating Reports....");
			  UtilityFunctions.generateReport();
			  break;
		  case 8:
			  System.out.println("Exited from the program! THANK YOU FOR UR TIME :)");  
			  return;
		  }
		  }while(true);
  }
}
