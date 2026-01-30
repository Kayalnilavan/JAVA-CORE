class DoWhile2{
	public static void main(String args[]){
		
		int y=1;
		do{
			if(y%2==0){
				System.out.print("*");
			}
			else{
				System.out.print(y);
			}
		y++;
		}while(y<5);
	}
}