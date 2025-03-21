package java_day4;
import java.util.*;
public class Collectionss {
	public static void main(String[] args) {
		//ArrayList
		System.out.println("--------------ArrayList---------------------");
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(100);
		arr.add(200);
		for(int i=300;i<=500;i+=100) {
			arr.add(i);
			
		}
		System.out.println(arr);
		System.out.println(arr.get(0));
		System.out.println(arr.set(0,1000));
		System.out.println(arr.get(0));
		System.out.println("-------------------------------");
	for(int i:arr) {
		System.out.println(i);
	}
	System.out.println();
	System.out.println("---------------LinkedList--------------------");
 //LinkedList
	LinkedList<Integer> ll=new LinkedList<>();
	System.out.println("Add : "+ll.add(1));
	ll.addFirst(0);
	ll.addLast(13);
	System.out.println(ll.get(2));
	System.out.println(ll);
	ll.remove(0);
	System.out.println(ll);
	System.out.println("Size : "+ll.size());
	System.out.println(ll.isEmpty());
	ll.clear();
	System.out.println(ll);
	System.out.println(ll.isEmpty());
	System.out.println();
	System.out.println("----------------Queue----------------------");
	
	//queue
Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
System.out.println(q);
System.out.println(q.peek());//display without remove
System.out.println(q.remove());
System.out.println(q.poll());//remove and display
System.out.println(q);
System.out.println();
System.out.println("------------------HashSet------------------------");

//HashSet,TreeSet
HashSet<String> s1=new HashSet<>(); //not allows duplicates and unorder
s1.add("Ram");
s1.add("Hari");
s1.add("Ram");
System.out.println(s1);
System.out.println("\n ----------------------TreeSet--------------------");

TreeSet<Integer> s2 = new TreeSet<Integer>(); //sorted output 
s2.add(300);
s2.add(100);
System.out.println(s2);
System.out.println("\n -----------------HashMap-------------------------");

//Hashmap
HashMap<String,Integer> map=new HashMap<>();
map.put("Apple", 3);
map.put("Banana",2);
map.put("Orange",5);
System.out.println("Hashmap : "+map);
System.out.println("Apple count : "+map.get("Apple"));
if(map.containsKey("Banana")) {
	System.out.println("Banana is in the map.");
}
map.remove("Orange");
System.out.println("After orange removed : "+map);
System.out.println("Size of the hash : "+map.size());
System.out.println("Iterating using entryset : ");
for(Map.Entry<String,Integer> entry : map.entrySet()) {
	System.out.println(entry.getKey()+":"+entry.getValue());
}
System.out.println("Iterating using keys : ");
for(String key : map.keySet()) {
	System.out.println(key+":"+map.get(key));
}
	ArrayList<String> fruits=new ArrayList<>();
	fruits.add("Mango");
	fruits.add("Cherry");
	fruits.add("Orange");
	Iterator<String> iterator=fruits.iterator();
	System.out.println("Fruits using iterator");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	}
}
