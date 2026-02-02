import java.util.Scanner;
class Billing_System{
	public static void main(String args[]){
		String a;
		double b,d;
		int c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product : ");
		a=scan.nextLine();
		System.out.println("Enter product price : ");
		b=scan.nextDouble();
		System.out.println("Enter product quantity : ");
		c=scan.nextInt();
		
		d=b*c;
		System.out.println(" ");
		System.out.println("************************");
		System.out.println("  Yarl IT Super Market");
		System.out.println("   Kannathiddy Jaffna");
		System.out.println("************************");
		System.out.println("Product : \t"+ a);
		System.out.println("Quantity : \t"+ c);
		if(d>=5000){
			System.out.println("Sub total : \t"+ d);
			System.out.println("Discount : \t"+ d*0.1);
			System.out.println("Total : \t"+ (d-d*0.1));		
		}else{
			System.out.println("Sub total : \t"+ d);
			System.out.println("Discount :\t"+ "No");
			System.out.println("Total : \t"+ d);
		}
		System.out.println("***********************");
		System.out.println("\tThank you");
		System.out.println("***********************");
	}
}