package java_day1;
import java.util.Scanner;


public class Userinput {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=s.nextLine();
	System.out.println("My name is : "+name);
	System.out.println("Enter age ");
	int age = s.nextInt();
	System.out.println("Age is : "+age);
	System.out.println("Enter the mark");
	int marks = s.nextInt();
	System.out.println("The marks is : "+marks);
	float avg=marks/5;
	System.out.println("Average is : "+avg);
}
}