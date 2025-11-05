package Entity;



public class plans {
	
	private int policyid;
	private String policyname;
	private int premium;
	private int claimamount;
	private int noofcheckups;
	
	
	public plans(int pid,String pname,int premium,int ca,int noc){
		this.policyid =pid;
		this.policyname = pname;
		this.premium=premium;
		this.claimamount = ca;
		this.noofcheckups = noc;
	}
	
	public int getPid() {
		return policyid;
	}
	public void setPid(int pid) {
		this.policyid = pid;
	}
	public String getPname() {
		return policyname;
	}
	public void setPname(String pname) {
		this.policyname = pname;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public int getClaimamount() {
		return claimamount;
	}
	public void setClaimamount(int ca) {
		this.claimamount = ca;
	}
	public int getNoofcheck() {
		return noofcheckups;
	}
	public void setNoofcheckups(int noc) {
		this.noofcheckups = noc;
	}
	
	public String toString() {
		return "PolicyId: "+policyid+"\nPolicyName: "+policyname+"\nPremium: "+premium+"\nNo of checkups available per year: "+noofcheckups+"\nClaim available for the year: "+claimamount ;
	}

	
	public static void viewplan() {
		
		System.out.println("------Health Plans Options------\n");
		
		System.out.println("1.SILVER PLAN\n");
		System.out.println("# Can claim Upto 4lakhs per Annum");
		System.out.println("# 2000Rps/- Per 3 Months.");
		System.out.println("# Outpatient Consultations : 2/year");
		System.out.println("# Generic Prescription Coverages");
		System.out.println("# Emergency Care Limited");
		System.out.println("# Access to General Physicians\n");
		
		System.out.println("------------------------------------\n");
		System.out.println("2.GOLD PLAN\n");
		System.out.println("# Can claim upto 10lakhs per Annum");
		System.out.println("# 10000Rps/- per 6 Months");
		System.out.println("# Outpatient Consultations : 4/year");
		System.out.println("# Specialist Consultations(Cardiology,Orthopedics");
		System.out.println("# High Emergency Care Available");
		System.out.println("# Access to Dental & Vision Care");
		System.out.println("------------------------------------\n");
		
		System.out.println("3.PLATINUM PLAN\n");
		System.out.println("# Can claim above 15lakhs per Annum");
		System.out.println("# 50000Rps/- and above per year");
		System.out.println("# Outpatient Consultations : 8/year");
		System.out.println("# Personalized Care & Home HealthCare Available");
		System.out.println("# International Emergency Care Available");
		System.out.println("# Premium Dental & Vision Care");
		System.out.println("------------------------------------\n");
	}
	

}

