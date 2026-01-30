import java.util.Scanner;
class ElseIf{
	public static void main (String args[]){
		int marks;
		Scanner exam = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		marks = exam.nextInt();
		
		System.out.println("Your result is ");
		if (marks>=75)
		  {System.out.println("A");}
	    else if (marks>=65)
	    	{System.out.println("B");}
	    else if (marks>=55)
		    {System.out.println("C");}
	    else if (marks>=45)
		    {System.out.println("S");}
	    else 
		    {System.out.println("W");}
	}
}