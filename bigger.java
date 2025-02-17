import java.util.*;
class bigger{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = (a >= b)? a : b;
		System.out.println("Bigger number is = " + c);
		scn.close();
	}
}