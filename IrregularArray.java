class IrregularArray{
	public static void main(String args[]){
		int[][] num = new int[3][];
		num[0]= new int[2];
		num[1]= new int[3];
		num[2]= new int[2];
		
		num[0][0]= 12;
		num[0][1]= 56;
		
		num[1][0]= 20;
		num[1][1]= 42;
		num[1][2]= 23;
		
		num[2][0]= 19;
		num[2][1]= 34;
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
		        System.out.println(num[i][j]);		
			}
		}
	}
}