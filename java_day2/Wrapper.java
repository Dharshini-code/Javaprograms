package java_day2;

public class Wrapper {
public static void main(String [] args) {

	//wrapper class
    Integer myInt = Integer.valueOf(100);
    Double myDouble = Double.valueOf(12.34);
    Character myChar=Character.valueOf('A');
    Boolean myBool=Boolean.valueOf(true);
    
    //Autoboxing 
    Integer intobj=50;
    
    //unboxing
    
    int intvalue=intobj;
    System.out.println(intvalue);
    
}
}
