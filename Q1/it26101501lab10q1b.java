import java.util.Scanner;
class it26101501lab10q1b{
	public static void main(String args[]){
		double marks;
char grade;		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the marks 0-100");
		marks=input.nextDouble();
	
		assert((marks >= 0) && (marks <= 100)):"INVALID MARKS";
		    System.out.println("mark is validated");
			if(marks>=75)
			{grade='A' ;}
			else if(marks>=60 && marks<= 75)
			{grade='B' ;}
			else if(marks>=50 && marks<= 60)
			{grade='C' ;}
			else if(marks>=40 && marks<=50)
			{grade='D' ;}
			else
			{grade='F' ;}
		assert(marks>=75 && grade=='A'||marks>=60 && marks<= 75 && grade=='B'||marks>=50 && marks<= 60 && grade=='C'||marks>=40 && marks<=50 && grade=='D'
		||marks<40 && grade=='F'):"invalid garde";
		System.out.println("Grade="+grade);
	}
}