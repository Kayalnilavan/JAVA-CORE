class ArrayFindMax{
	public static void main(String args[]){
		int[] marks={89,76,23,99,90,65,98};
		int max=marks[0];
		for(int i=0;i<marks.length-1;i++){
			if(max<marks[i]){
				max=marks[i];
			}
		}
		System.out.println("Max : "+ max);
		
	}
}