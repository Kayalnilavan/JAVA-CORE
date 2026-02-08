class Arraywhileloop2{
	public static void main(String args[]){
		
		String[] subjects={"Maths","Science","English","Tamil"};
		int j=subjects.length-1;
		while(j>0){
			System.out.println(subjects[j]);
			j--;
		}
	}
}