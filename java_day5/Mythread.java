package java_day5;

class threadexample extends Thread {
@Override
public void run() {
	System.out.println("Thread is running");
}
}
public class Mythread
{
	public static void main(String[] args) {
		threadexample thread1=new threadexample();
		thread1.start();
	}
}