import java.util.*;
class calc{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		char ch = scn.next().charAt(0);
		if(ch == '+')	System.out.println("Add = " + a + b);
		else if(ch == '-')	System.out.println("Subs = " + (a - b));
		else if(ch == '*')	System.out.println("Multi = " + (a * b));
		else if(ch == '/')	System.out.println("Division = " + (a/b));
		else	System.out.println("Invalid choice");
		scn.close();
	}
}