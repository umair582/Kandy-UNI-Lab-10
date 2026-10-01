import java.util.Scanner;

class it26101501lab10q1

{
	public static void main(String args[]){
		double marks;	
		Scanner input=new Scanner(System.in);
		System.out.println("enter the marks 0-100");
		marks=input.nextDouble();
	
		assert((marks >= 0) && (marks <= 100)):"INVALID MARKS";
		    System.out.println("mark is validated");
    
	}
}
