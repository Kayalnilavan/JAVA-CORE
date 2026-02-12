import java.util.Scanner;
class TwoDarrayForMarks{
	public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		
		String[] SubjectNames={"Physics","Maths","Chemistry"};
		int[][] Report;
		int students=5,subjects=3;
		
		Report =new int[students][subjects];
		
		for(int i=0;i<students;i++){
			System.out.println("Enter marks for student "+ (i+1));
			
			for(int j=0;j<subjects;j++){
			System.out.print(SubjectNames[j] + ":");
			Report[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("");
		System.out.println("Students\tPhysics\tMaths\tChemistry\tTotal\tAverage");
		
		for(int i=0;i<students;i++){
			System.out.print("Student "+ (i+1)+ "\t");
			int total=0;
			double avg;
			for(int j=0;j<subjects;j++){
				System.out.print(Report[i][j]+"\t");
			    total=total+Report[i][j];
			}
			avg= total/(double)subjects;
			System.out.println("\t"+ total+ "\t" +avg);
		}
	}
}