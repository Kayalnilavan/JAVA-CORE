import java.util.Scanner;
class UserInput2{
	public static void main(String args[]){
		
		int num1,num2,num3,total,average;
		Scanner marks= new Scanner(System.in);
		
		System.out.print("Enter your maths marks :");
		num1= marks.nextInt();
		
		System.out.print("Enter your physics marks :");
		num2= marks.nextInt();
		
		System.out.print("Enter your chemistry marks :");
		num3= marks.nextInt();
		
		total=num1+num2+num3;
		average=total/3;
		
		System.out.println("Your total marks :"+ total);
		System.out.println("Your average :"+ average);
		
		if(average>=50){
			System.out.println("You are pass")
		}else{
			System.out.println("You are fail")
		}
	}
}