package java_day3;

class Book{
	int bookID;
	String title;
	String author;
	double price;
	
	Book(int bookID,String title,String author,double price){
		this.bookID=bookID;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("BookId : "+ bookID);
		System.out.println("title : "+title);
		System.out.println("author : "+author);
		System.out.println("price : "+price);
		System.out.println("----------------------");
	}
}
public class Library {
public static void main(String[] args) {
	Book b1 = new Book(1,"Harry Potter","J.K.Rowling",12.2);
	Book b2 = new Book(2,"Python","Balagurusamy",20.2);
	Book b3 = new Book(3,"C++","Balagurusamy",26.2);
	b1.displayDetails();
	b2.displayDetails();
	b3.displayDetails();
}
}
