package Services;
import java.util.HashMap;
import DAO.HIMSDAO;
import Entity.*;
public class UtilityFunctions {
	//to be implemented
	static HashMap<Integer,Members> mm = HIMSDAO.memMap;
	
	
	public static void viewMember(int id_view) {
		Members mem = mm.get(id_view);
		System.out.println(mem);
		System.out.println(mem.getpolicy());
	}
	
	public static void viewDetails() {
		System.out.println("ID\t Name\t Age\t Gender\t Salary\t Address\t Policy");
		for( Members m: mm.values()) {
			System.out.printf("%d\t %s\t %d\t %s\t %.0f\t %s\t %s \n",m.getid(), m.getname(),m.getage(), m.getgender(),m.getsalary(), m.getaddress(), m.getpolicy().getPname() );
		}
		int choice = Validation.inputValidInteger("\n1. View in detail 2. Exit");
		if (choice == 1){
			while(true) {
				int id_view = Validation.inputValidInteger("Enter the id of member");
				if(mm.containsKey(id_view)) {
					viewMember(id_view);
					break;
				}
				else
					System.err.println("No such member. Try again");
			}

		}
	}
	
	public static void generateReport() {
		int[] count = {0,0,0};
		System.out.println("Total no of members: "+mm.size());
		for(Members mem : mm.values()) {
			if(mem.getpolicy().getPid() == 1)
				count[0]++;
			else if(mem.getpolicy().getPid() == 2)
					count[1]++;
			else
				count[2]++;
			
		}
		System.out.println("No of Silver member: "+count[0]+"\nNo of Gold members: "+count[1]+"\nNo of Platinum members: "+count[2]);
		int revenues=0;
		int claims=0;
		for(Members mem : mm.values()) {
			revenues += (mem.getpolicy().getPremium()*12);
			claims += mem.getClaimed();
		}
		System.out.println("Total revenue for the year: "+(revenues-claims));
	}
}
