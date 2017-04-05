package myPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicStack implements GenStack{

	static int index = -1;
	int [] stack = new int[50];  
			
public static void main(String[] args) throws IOException {
	
	String s2 = "yes";
	DynamicStack fs = new DynamicStack();
	do{
		
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    System.out.println("Would you like to pop or push into the Stack ? Enter push or pop ");
		String s = br.readLine();
		switch (s)
		{
			case "pop":
			fs.pop();
			break;
			
			case "push":
				
				Scanner scanner = new Scanner(System.in);
			    System.out.println("Enter the number you would like to push ");
			    int i = scanner.nextInt();
			   fs.push(i); 
			    break;
		}
		
		
	    BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));
	    System.out.println("Would you like to continue ? Enter yes or no  ");
	     s2 = br2.readLine();
		
		
	}while (index!= -1 &&  s2.equals("yes") );

	for ( int j =0 ; j <=index ; j++){
		System.out.println("Value in the stack at location" +j +" is " + fs.stack[j]);
	}

		

}

	@Override
	public void push(int I) {
	 index+=1;
	 stack[index]=I;
	 System.out.println("No pushed into stack at " + index + " is" + stack[index]);
	}

	@Override
	public int pop() {
		System.out.println("Value popped out of the stack is :  " + stack[index] );
		index = index -1;
		return 0;
	}

}
