import java.util.Scanner;
class ArrayMarks{
	public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		
		int[] Nimal;
		Nimal=new int[5];
		
		int i=0,num=0;
		while(i<5){
			System.out.println("Enter Subject "+ (i+1));
			Nimal[i]=scan.nextInt();
			num=num+Nimal[i];
			i++;
		}
		System.out.println("Your total marks :"+ num);
		System.out.println("Your avreage :"+ num/Nimal.length);
	}
}