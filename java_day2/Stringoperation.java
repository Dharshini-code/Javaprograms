package java_day2;
import java.util.*;
public class Stringoperation {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name: ");
	String name=s.nextLine();
	System.out.println("name:"+name);
	
	//length
	String str="Java Programming";
	System.out.println("The length of "+str+ " is : "+str.length());//The length of Java Programming is : 16
	
	//substring
	System.out.println(str.substring(5)); //Programming
	System.out.println(str.substring(0,12)); //Java Program
	
	//indexOf
	System.out.println("P occurs first in index :"+str.indexOf("P"));//P occurs first in index :5
	System.out.println(str.indexOf("x"));//returns -1 if not occur
	
	//toUpperCase and toLowerCase
	System.out.println(str.toUpperCase());//JAVA PROGRAMMING
	System.out.println(str.toLowerCase());//java programming
	
	//replace
	System.out.println(str.replace('a', 'A'));//JAvA ProgrAmming
	
	//equals
	String str2="java programming";
	System.out.println(str==str2);//false
	System.out.println(str.equals(str2));//false
	System.out.println(str.equalsIgnoreCase(str2));//true
	
	//charAt
	System.out.println(str.charAt(2));//v
	
	//spilt
	String s1= "java,python,cpp,c";
	String[] lang=s1.split(",");
	for(String l:lang) {
		System.out.println(l);
	}
	//concat
	String a="Java";
	String b="Programming";
	System.out.println("Concat String : "+ a.concat(b));//JavaProgramming
	
	//trim
	String c="   Java    ";
	String d=c.trim();
	System.out.println("before Trim :"+c);//   Java    
	System.out.println("After Trim :"+d);//Java
	
	//compareTo
	System.out.println(a.compareTo(b)); //-6

	//contains
	System.out.println(str.contains("Java"));//true
	System.out.println(str.contains("python"));//false
	
	//intern
	 String str1 = new String("Java");
     String st = "Java";
     String str3 = str1.intern();
     System.out.println(str1 == st); // false
     System.out.println(st == str3); // true
	
	//StringBuilder
     StringBuilder sb=new StringBuilder("Hello");
     
     //append
     sb.append(" World");
     System.out.println("After Append : "+sb);//After Append : Hello World
     
     //insert
     sb.insert(5, " Java");
     System.out.println("After insert : "+sb);//After insert : Hello Java World
     
     //replace
     sb.replace(11, 20, "Programming");
     System.out.println("After Replace : " + sb);//After Replace : Hello Java Programming
     
     //reverse
     sb.reverse();
     System.out.println("After Reverse : "+sb);//After Reverse : gnimmargorP avaJ olleH
     
     //StringBuffer
     StringBuffer sbuff=new StringBuffer("Java");
     sbuff.append(" Program");
     System.out.println("Append using StringBuffer : "+sbuff);//Append using StringBuffer : Java Program
    
     
}
}
