class TwoDarray{
	public static void main(String args[]){
		int [][]x;
		x=new int[2][5];
		
		x[0][0]=1;
		x[0][1]=3;
		x[0][2]=6;
		x[0][3]=5;
		x[0][4]=8;
		x[1][0]=2;
		x[1][1]=6;
		x[1][2]=8;
		x[1][3]=2;
		x[1][4]=1;
		
		System.out.println(x[1][2]);
		System.out.println(x[0][4]);
		
	}
}