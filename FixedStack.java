package myPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FixedStack implements GenStack{
	static int index = -1;
	int [] stack = new int[5]; 
	
	public static void main(String[] args) throws IOException {
		String s2 = "yes";
		FixedStack fs = new FixedStack();
	
			
		    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		    System.out.println(" Push into the Fixed Stack of limit 5");
			String s = br.readLine();
		
	        		
			for (int  j =0 ; j < 5 ; j++) 
			  {
					Scanner scanner = new Scanner(System.in);
				    System.out.println("Enter the number you would like to push ");
				    int i = scanner.nextInt();
				   fs.push(i); 
			   }			
			
			
		    BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));
		    System.out.println("Would you like to print the stack or pop  ? Enter yes or no  ");
		    
		     s2 = br2.readLine();
		     do {
			 if (s2.equals("print"))
			 {
				 for (int  j =0 ; j < 5 ; j++) 
				 {
					 System.out.println("Value in the stack at location" +j +" is " + fs.stack[j]);
				 }
			 }
			 else if ( s2.equals("pop")) { 
				 for (int  j =0 ; j < 5 ; j++) 
				 {
					 fs.pop();
				 }
				
			 }
			 BufferedReader br3 =  new BufferedReader( new InputStreamReader(System.in));
			 System.out.println("Would you like to continue print or pop operation? Enter yes or no");
			 s2 = br3.readLine();
			 
		     }while(s2.equals("yes"));
			
		

	

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
