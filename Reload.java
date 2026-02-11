import java.util.Scanner;
class Reload{
	public static void main(String args[])
	{
		int reload;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your talk time : ");
		reload = input.nextInt();
		
		if (reload<=30)
		   {System.out.println("Your reload amount is : LKR " + reload*2);}
	    else if (reload<=60)
		   {System.out.println("Your reload amount is : LKR " + reload*1.5);}
	    else if (reload<=120)
		   {System.out.println("Your reload amount is : LKR " + reload);}
	    else
		   {System.out.println("Your reload amount is : LKR " + reload*0.5);}
			
	}
}