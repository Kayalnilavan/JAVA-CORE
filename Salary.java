class Salary{
	public static void main(String args[]){
		
		double salary=200000;
		double tax,ns;
		
		if(salary>100000){
			tax = salary*0.03;
			}
		else{
			tax = salary*0.01;
		}
		
		ns = salary - tax;
		System.out.println("Your basic salary : " + salary);
		System.out.println("Your payable tax: " + tax);
		System.out.println("Your net salary : " + ns);
	}
}