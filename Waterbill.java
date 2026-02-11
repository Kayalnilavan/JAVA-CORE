import java.util.Scanner;
class Waterbill{
	public static void main (String args[]){
		
		int reading,b,c,d,e;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your water meter reading : ");
		reading = input.nextInt();
		
		b=500+3*(reading-1000);
		c=500+12000+5*(reading-5000);
		d=500+12000+50000+5*(reading-15000);
		e=d*3/100;
		
		if(reading<=1000){
			System.out.println("Your bill amount is : LKR " + 500);}
		else if(reading<=5000){
			System.out.println("Your bill amount is : LKR " + b);}
		else if(reading<=15000){
			System.out.println("Your bill amount is : LKR " + c);}
	    else{
			System.out.println("Your bill amount is : LKR " + (d+e));}
	}
}