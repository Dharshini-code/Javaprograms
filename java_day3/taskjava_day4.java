package java_day4;
class pet{
	void petsbrag() {
		System.out.println("I have the best pet");
	}
}
class dog extends pet{
	void dogsbrag() {
		super.petsbrag();
		System.out.println("I have the best dog");
	}
}
class candy{
	void taste() {
		System.out.println("Taste Sweet");
	}
}
class chocolate extends candy {
	@Override
	void taste() {
	 System.out.println("Taste Chocolately");
	}
}
 class parent{
	 void speak() {
		 System.out.println("Parents say hi to child");
	 }
 }
 class child extends parent{
	 @Override
	 void speak() {
		 System.out.println("child say hii to the parent ");
	 }
 }
 public class taskjava_day4 {
	 void talk()
	 {
		 System.out.println("Hello");
	 }
	 void talk(String name){
		System.out.println("Hello "+name);
	}
	
public static void main(String[] args) {
taskjava_day4 t = new taskjava_day4();
t.talk();
t.talk("dharsh"); 
parent p = new parent();
child c =new child();
p.speak();
c.speak();
candy ca=new candy();
chocolate ch = new chocolate();
dog d = new dog();
d.dogsbrag();
}
 }
