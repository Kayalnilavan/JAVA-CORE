import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		
		String amd;
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your name : ");
		amd = name.next();
		System.out.println("Your name is :" +amd);
	}
}