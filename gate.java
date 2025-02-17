class gate{
	public static void main(String args[]){
	System.out.println("AND GATE operations");
	System.out.println(" 1 AND 0 = " + (1&0));
	System.out.println(" 1 AND 1 = " + (1 & 1));
	System.out.println(" 0 AND 0 = " + (0 & 0));
	System.out.println("OR GAte operations");
	System.out.println("1 OR 1 = " + (1|1));
	System.out.println("1 OR 0 = " + (1 | 0));
	System.out.println("0 OR 0 = " + (0 | 0));
	System.out.println("NOT Gate operations");
	System.out.println("1 passed through not gate = " + (!true));
	System.out.println("0 passed through not gate = " + (!false));
	System.out.println("XOR gate operations");
	System.out.println("1 XOR 1 = " + (1^1));
	System.out.println("1 XOR 0 = " + (1 ^ 0));
	System.out.println("0 XOR 0 = " + (0^0));
	}
}