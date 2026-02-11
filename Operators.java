class Operators{
	public static void main (String args []){
		
		int x=10;
		int y=3;
		
		//Logical operators
		System.out.println(true && true);   //AND
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("*********************");
		
		System.out.println(true || true);    //OR
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println("*********************");
		
		//Comparison operators
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x!=y);
		System.out.println(x==y);
		System.out.println("*********************");
		
		
		
		System.out.println("x+y="+x+y);
		System.out.println(x+y+"=x+y");
		System.out.println("x+y="+(x+y));
		System.out.println("*********************");
		
		//System.out.println("x-y"+x-y); Code does't work.Only show error(BODMAS)
		System.out.println(x-y+"=x-y");
		System.out.println("x-y="+(x-y));
		System.out.println("*********************");
		
		System.out.println("x*y="+x*y);
		System.out.println(x*y+"=x*y");
		System.out.println("x*y="+(x*y));
		System.out.println("*********************");
		
		System.out.println("x/y="+x/y);
		System.out.println(x/y+"=x/y");
		System.out.println("x/y="+(x/y));
		System.out.println("*********************");
		
		System.out.println("x%y="+x%y);
		System.out.println(x%y+"=x%y");
		System.out.println("x%y="+(x%y));

		
	}
}