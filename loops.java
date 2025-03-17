package java_day1;

public class loops {
public static void main(String[] args) {
	int n=10;
	
	//for loop
	//ascending order
	for(int i=0;i<=n;i++) {
		System.out.println(i);
	}
	//descending order
	for(int i=n ;i>=0; i--) {
		System.out.println(i);
	}
	System.out.println("Odd number ");
	//odd number from 1 to 10
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	//while loop
	int j=0;
	while(j<n) {
		System.out.println(j);
		j++;
	}
	//do while
	int k=0;
	do {
		System.out.println(k);
		k++;
	}while(k<n);
	
	//array
	int [] num=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	for (int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
}
}
