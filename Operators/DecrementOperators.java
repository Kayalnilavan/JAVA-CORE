class DecrementOperators{
	public static void main(String args[]){
		
		int y =15;
		
		System.out.println(y);
		
		y = y - 1;
		System.out.println(y);
		
		y -= 1;
		System.out.println(y);
		
		y--;                     
		System.out.println(y);
		
		--y;                     
		System.out.println(y);
		
		System.out.println(--y);  //pre-decrement
		System.out.println(y--);  //post-decrement
		System.out.println(y);
	}
}