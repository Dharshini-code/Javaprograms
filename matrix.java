package java_day1;
import java.util.*;
public class matrix {
public static void main(String[] args) {
	int[][] matrix = new int [2][3];
	matrix[0][0]=1;matrix[0][1]=2;matrix[0][2]=3;
	matrix[1][0]=4;matrix[1][1]=5;matrix[1][2]=6;
	for (int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[i].length;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();//newline
	}
	//arraycopy
	int[] source = {1,2,3,4,5};
	int[] destination=new int[5];
	System.arraycopy(source, 0, destination, 0, source.length);
	for(int num:destination) {
		System.out.print(num+" ");
	}
	System.out.println();
	//arraysort
	int[]num= {40,10,30,20,50};
	Arrays.sort(num);
	System.out.println("Sorted Array: "+Arrays.toString(num));
	
	//for-each in array 
	int arr[]= {13,9,20,05};
	for (int n:arr) {
		System.out.println(n);
	}
}
}
