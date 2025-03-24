package java_day1;
import java.util.Scanner;

public class Controlstatements {
public static void main(String[] args) {
	int a=10;
	int b=20;
	//if
	if(a==10) {
		System.out.println("A value is 10 "); 
	}
	
	//if else
	if(a<b) {
		System.out.println("A less then B");
	}
	else {
		System.out.println("A Greater than B");
	}
	
	//nested if 
	if (a<b) {
		if(a%2==0)
		{
			System.out.println(a + " is even number");
		}
	}
	
	//if elseif (finding the Greater number)
	int c=100;
	int d=400;
	int e=300;
	if(c>d && c>e)
	{
		System.out.println("C is Greater");
	}
	else if(d>c && d>e)
	{
		System.out.println("D is Greater");
	}
	else if(e>c && e>d)
	{
		System.out.println("E is Greater");
	}
	else {
		System.out.println("All are equal");
	}
	
	//Switch case
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a num 1");
	int num1=s.nextInt();
	System.out.println("Enter a num 2");
	int num2=s.nextInt();
	char choice;
	System.out.println(" choose any +,-");
	choice =s.next().charAt(0);
	switch(choice) {
	case '+':
		int f=num1+num2;
		System.out.println("ADD ="+f);
		break;
	case '-':
		int g=num1-num2;
		System.out.println("SUB ="+g);
		break;
		default:
			System.out.println("INVALID CHOICE ");
	}
	
}
}
