class Arraydowhile{
	public static void main(String args[]){
		
		String[] courses={"MERN","ASP","Java","OOP","C#"};
		int i=0;
		do{
			System.out.println(courses[i]);
			i++;
		} while (i<courses.length);
		
	}
}