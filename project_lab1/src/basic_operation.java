import java.util.*;
//this is a program of basic operation
public class basic_operation{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter operator: ");
		String operator=sc.nextLine();
		
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		
		int result=0;
		
		switch(operator) {
		//addition operation
		case "+"->result=num1+num2;
		//subtraction operation
		case "-"->result=num1-num2;
		//Multiplication operation
		case "*"->result=num1*num2;
		//division operation
		case "/"->result=num1/num2;
		}
		//output 
		System.out.print("The output is: "+result);
		
	}
	
}