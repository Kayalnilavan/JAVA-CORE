class TwoDarraywhile{
	public static void main(String args[]){
		int x[][];
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
		
		int i=0,j=0;
		while(i<=2){
			while(j<=4){
			System.out.println(x[i][j]);
			j++;
			}
			i++;
		}
	}
}