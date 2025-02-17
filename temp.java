class temp{
	static int c = 0;
	int ins = 5;
	public void show(){
		int local = 10;
		local++;
		c++;
		ins++;
		System.out.println("Local = " + local);
		System.out.println("Static = " + c);
		System.out.println("Instance = " + ins);
	}
	
	public static void main(String args[]){
		temp ob1 = new temp();
		ob1.show();
		temp ob2 = new temp();
		ob2.show();
		temp ob3 = new temp();
		ob3.show();
	}
}