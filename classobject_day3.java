package java_day3;
import java.util.*;

class Student{
	//Attributes
	
	String names;
	int rollno;
	String dept="Msc SS";
	Student(String name,int rollno){// parameterized Constructor
		names=name;
		this.rollno=rollno;
		System.out.println("Name : " + names);
		System.out.println("Rollno : "+rollno);
	}
	void display() {
		System.out.println("My Name is : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("Department : "+dept);
	}
}

class Calculator{
	int num1=96,num2=90,total;
	void add() {
		total=num1+num2;
		System.out.println("Total = "+total);
	}
}

class Order{
	String name="Briyani";
	int quantity=5,prize=500;
	
	void orderbill() {
		System.out.println("ORDER BILL");
		System.out.println("------------------");
		System.out.println("FOOD : "+name +"\n"+"QUANTITY : "+quantity+"\n"+"PRIZE : "+prize);
	}
}
public class classobject_day3 {
	public static int add(int a,int b) {
		return a+b;
	}
	
public static void main(String[] args) {
	
	Student s=new Student("mahi",1); //object
	s.names="Krish";
	s.rollno=8;
	s.display();
	
	Calculator c =new Calculator();
	c.add();
	
	Order o =new Order();
	o.orderbill();
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter 2 Values : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(add(a,b));

}
}
