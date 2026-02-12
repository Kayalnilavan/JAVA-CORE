import java.util.Scanner;
class TwoDarrayWhileMarks{
	public static void main(String args[]){
	    Scanner scan = new Scanner(System.in);
		
		String[] SubjectsName={"Physics","Maths","Chemistry"};
	    int [][] Report;
		Report=new int[5][3];
		
		int i=0;
		while(i<5){
			System.out.println("Student "+ (i+1)+ ":");
			int j=0;
			int num=0;
			while(j<3){
				System.out.print(SubjectsName[j] + ":");
				Report[i][j]=scan.nextInt();
				j++;
				num=num+Report[i][j-1];
			}
		    i++;
			System.out.println("****************");
			System.out.println("Total marks :"+ num);
		    System.out.println("Avreage :"+ num/Report[i-1].length);
			System.out.println("****************");
		}
	}
} 