class Result{
	public static void main (String args[]){
		
		int marks=111;
		
		if ((marks >=75) && (marks<=100)){
			System.out.println("A");
		}else if ((marks >=65) && (marks<=75)){
			System.out.println("B");
		}else if ((marks >=55) && (marks<=5)){
			System.out.println("C");
		}if ((marks >=45) && (marks<=55)){
			System.out.println("S");
		}if ((marks >=0) && (marks<=45)){
			System.out.println("W");
		}else{
			System.out.println("Invalid marks.Enter correct marks");
		}
	}
}