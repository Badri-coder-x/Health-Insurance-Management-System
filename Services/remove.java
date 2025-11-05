package Services;
import DAO.HIMSDAO;


public class remove {
	
	public static void removemember() {
		
		int rid = Validation.inputValidInteger("Enter your ID: ");
		
		if(HIMSDAO.memMap.isEmpty()) {
			System.out.println("Nothing to remove");
		}
		else {
			//to be implemented
			if(HIMSDAO.memMap.containsKey(rid)) {
				HIMSDAO.memMap.remove(rid);
				System.out.println("Removed successfully");
			}
			else {
				System.out.println("does not contain the id");
			}
			
		}
		
		
	}
}
