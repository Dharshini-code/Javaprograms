package java_day3;

class Students{
	public String name = "Krish";
	private int age = 20;
	protected String grade = "A";
	String school = "ABC School";
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);
		System.out.println("School : "+school);
	}
}
public class AccessSpecifer {
public static void main(String[] args) {
	Students s1 = new Students();
	s1.display();
	System.out.println("Public Name : "+s1.name);
	System.out.println("Default School : "+s1.school);
	//System.out.println("Private Age : "+s1.age);
	
}
	
	
}
