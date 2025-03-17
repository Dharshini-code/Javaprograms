package java_day1;

public class operator {
public static void main(String [] args)
{
	//Arithmetic Operator
	int a=5;
	int b=3;
	System.out.println(a+b); //8
	System.out.println(a-b); //2
	System.out.println(a/b); //1
	System.out.println(a%b); //2
	
	//Relational Operator
	int c=100;
	int d=200;
	System.out.println(c<d); //true
	System.out.println(c>d); //false
	System.out.println(c==d); //false
	System.out.println(c<=d); //true
	System.out.println(c>=d); //false
	System.out.println(c!=d); //true
	
	//Logical operator
	boolean e = true;
	boolean f = false;
	System.out.println(e&&f); //true and false = false
	System.out.println(a>c || c<d); //false or true = true
	System.out.println(!f); 
	
	//post increment
	int g=10;
	System.out.println(g);//10
	System.out.println(g++);//10
	System.out.println(g);//11
	
	//pre increment 
	System.out.println(g); //11
	System.out.println(++g); //12
	System.out.println(g); //12
	
	//post decrement
	System.out.println(g); //12
	System.out.println(g--); //12
	System.out.println(g); //11
	
	//pre decrement
	System.out.println(g); //11
	System.out.println(--g); //10
	System.out.println(g); //10
	
	//Assignment operator
	int h=100;
	System.out.println(h+=100);//200
	System.out.println(h-=100);//100
	System.out.println(h*=100);//10000
	System.out.println(h/=100);//100
	System.out.println(h%=100);//0
	
	//swap without temp variable
	System.out.println("a="+a+"\n"+"b="+b); //a=5 , b=3
	System.out.println(a+=b); //8
	System.out.println(b=a-b); //5
	System.out.println(a=a-b); //3
	
	//ternary operator
	int age=18;
	String result = (age>=18)? "Eligible" : "Not Eligible " ;
	System.out.println(result);
	
	//bitwise operator
	int i=10;
	int j=20;
	System.out.println(i&j); //0
	System.out.println(i|j); //30
	System.out.println(i^j); //30
	System.out.println(~i); //-11
	
	//Left shift and Right shift
	System.out.println(i<<1);//20
	System.out.println(i>>1);//5
}
}
