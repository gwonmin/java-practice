package method;

public class human {
	private int age;
	private String name;
	private String job;
	
	private boolean checkAge(int age) {
		
		if(age<1) return false;
		
		return true;
	}
	
	public void setHumaninfo(int age, String name, String job) {
		
		if(checkAge(age) == false) this.age = 1;
		else {
			this.age = age;
			this.name = name;
			this.job = job;
			
		}
	}
	
	public void introduce() {
		
		System.out.println("My name is "+ name);
		System.out.println("i'm "+age+" year's old,"+" and my job is "+ job);
	}
	
}
