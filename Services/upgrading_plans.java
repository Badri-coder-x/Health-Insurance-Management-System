package Services;

import DAO.HIMSDAO;
import java.util.Scanner;
import Entity.Members;
import Entity.plans;
import Main.Main;

public class upgrading_plans {

//    private HashMap<Integer, Member> members;
//
//    
//    public upgrading_plans(HashMap<Integer, Member> members) {
//        this.members = members;
//    }

    public static void upgradePlanById() {
        Scanner sc = Main.sc;
        int id = Validation.inputValidInteger("Enter Member ID to upgrade: ");
//
//        Member member = members.get(id);

        if (HIMSDAO.memMap.containsKey(id) == false) {
            System.out.println(" No member found with ID: " + id);
            sc.close();
            return;
        }
        
        Members obj = HIMSDAO.memMap.get(id);
        System.out.println("\n Member Found: " + obj.getname());
        System.out.println("Current Plan: " + obj.getpolicy());
        System.out.println("Salary: ₹" + obj.getsalary());
        System.out.println("Enter your current annual income to upgrade plans:");
        int salary = sc.nextInt();
        obj.setSalary(salary);
        int idVal = 1;
        String plann;
        
        if (salary >= 3000000) {
        	
            plann =("Platinum");
            idVal = 3;
            
        } else if (salary >= 1000000) {
            plann="Gold Plan";
            idVal =2;
        } else {
            plann= ("Annual income too low for upgrade.");
            return;
        }
        
        System.out.println("Do you want to choose the "+plann+"." );
        String ans = sc.next();
        
        if(ans.equalsIgnoreCase("yes")) {
        	plans pol = HIMSDAO.insMap.get(idVal);
        	obj.setPolicy(pol);
        	System.out.println("Updated Member Details:");
        	UtilityFunctions.viewMember(id);
        	
        }else {
        	System.out.println("The plan not upgraded.");
        	
        }

    }
}
