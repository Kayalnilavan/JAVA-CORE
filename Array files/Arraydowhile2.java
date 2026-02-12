class Arraydowhile2{
	public static void main(String args[]){
		
		String[] courses={"MERN","ASP","Java","OOP","C#"};
		int j=courses.length-1;
		do{
			System.out.println(courses[j]);
			j--;
		} while(j>=0);
	}
}