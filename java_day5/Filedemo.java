package java_day5;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Filedemo {
public static void main(String[] args) throws IOException { 
// Create a new file
File obj = new File("C:\\Users\\casstudent\\eclipse-workspace\\java_day5\\src\\java_day5\\newfile");
obj.createNewFile(); // This may throw IOException
System.out.println("File created");
try {
// Writing data to files
FileWriter w1 = new FileWriter("C:\\Users\\casstudent\\eclipse-workspace\\java_day5\\src\\java_day5\\Filedemo");
FileWriter w2 = new FileWriter("C:\\Users\\casstudent\\eclipse-workspace\\java_day5\\src\\java_day5\\newfile");
w1.write("Hello, Java I/O");
w1.close();
w2.write("Hello, this is new file");
w2.close();
System.out.println("Data written to file");
// Reading data from a file
FileReader r1 = new FileReader("C:\\Users\\casstudent\\eclipse-workspace\\java_day5\\src\\java_day5\\Filedemo");
int character;
while ((character = r1.read()) != -1) {
System.out.print((char) character);
}
r1.close();
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}
System.out.println();
//BufferedReader
try {
	BufferedReader r1=new BufferedReader(new FileReader ("C:\\javafilepro\\sample.txt"));
	String line;
	System.out.println("Reading file line by line");
	while((line=r1.readLine())!=null) {
		System.out.println(line);
	}
	r1.close();
}catch(IOException e) {
	System.out.println("Error reading file: "+e.getMessage());
}
//BufferedWriter
try {
	BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\\\javafilepro\\\\sample.txt"));
	writer.write("Java File Handling Example");
	writer.newLine();
	writer.write("BufferedWriter makes writing more efficient.");
	writer.close();
	System.out.println("Data written to file Successfully.");
	
}catch(IOException e) {
	System.out.println("Error writing to the file : "+e.getMessage());
}
}
}
