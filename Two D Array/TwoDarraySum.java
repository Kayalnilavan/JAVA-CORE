class TwoDarraySum{
	public static void main(String args[]){
		
		int[][] x={{2,5,6,7,1},{3,5,0,7,6}};
		int num=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				num=num+x[i][j];				
			}
		}
		System.out.println(num);
	}
}