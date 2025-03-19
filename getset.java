package java_day3;
class Data{
	private String name;
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		if(name!=null&&!name.isEmpty()) {
			this.name=name;
		}else
		{
			System.out.println("Invlid name!");
		}
	}
}


//inheritance  

	class Animal{
		void sound() {
System.out.println("Animals are making sounds ");			
		}
	}

	class Dog extends Animal {
		void bark() {
		System.out.println("Dog barks ");
	}
	}
	class Puppy extends Dog{
		void woof() {
			System.out.println("Puppy woof ");
		}
	}
	class Cat extends Animal{
		void meow() {
			System.out.println("Cat MEOW's ");
		}
	}
//interface
	interface camera{
		void capturephoto();
	}
	interface MusicPlayer{
		void play();
	}
	class Smartphone implements camera,MusicPlayer{
		public void capturephoto() {
			System.out.println("Photo captured");
		}
		public void play() {
			System.out.println("Music playing");
		}
	}
public class getset {
public static void main(String[] args) {
	Data s1 = new Data();
	s1.setName("krish");
	System.out.println("Student Name : "+s1.getName());
	Puppy p = new Puppy();
	p.sound();
	p.bark();
	p.woof();
	Cat c = new Cat();
	c.sound();
	c.meow();
	Dog d = new Dog();
	d.sound();
	d.bark();
	Smartphone sp=new Smartphone();
	sp.capturephoto();
	sp.play();
}
}
