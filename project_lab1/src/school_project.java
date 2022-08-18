//this is a program of simple school to get a group name  
import java.util.*;
public class school_project{
	public static void main(String[] args) {
		System.out.println("enter roll number: ");
	Scanner sc=new Scanner(System.in);
	int rollno=sc.nextInt();
	if(rollno%2==0) {
	   if(rollno%4==0) {
		   System.out.println("Emorald group");
	   }
	   else {
		   System.out.println("perl group");
	   }
	}
	else {
		boolean f=false;
		for(int i=3;i<=rollno;i++) {
			if(rollno%i==0) {
				System.out.println(" sapphine");
				f=true;
				break;
			}
			if(f==false) {
				System.out.println("ruby");
				break;
			}
		}
	}
	
	}
}