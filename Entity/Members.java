package Entity;

public class Members {
	 private int id;
	 private String name;
    private String address;
	private double salary;
	private int age;
	 plans policy;
	private String gender;
	private int claimed;
	private static int counter=1;
	
	public Members(String name, String address, double salary,int age,String gender,plans policy){
		id= counter++;
		claimed = 0;
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.age=age;
		this.policy = policy; 
		this.gender=gender;
		System.out.println("test policy "+policy.getPname());
	}
	public int getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	public String getaddress() {
		return this.address;
	}
	public double getsalary() {
		return this.salary;
	}
	public int getage() {
		return this.age;
	}
	public plans getpolicy() {
		return this.policy;
	}
	public String getgender() {
		return this.gender;
	}
	
	public void setPolicy(plans obj1) {
		this.policy = obj1;
	}
	
	public void setSalary(int sal) {
		this.salary= sal;
	}
	public String toString() {
		return "id: "+id+ " \nName: "+name+ " \nAddress: "+address+ " \nAnnual income: "+salary+ " \nAge: "+age+"\nTotal amount claimed: "+claimed;
	}
	
	public int getClaimed() {
		return claimed;
	}
	
	public void claimed(int amount) {
		claimed+=amount;
	}
		
	

}
