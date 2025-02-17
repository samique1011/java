import java.util.*;
class recharge{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int bal = scn.nextInt();
		System.out.println((bal < 20)?"You need to recharge":"Enjoy your services");
		scn.close();
	}
}