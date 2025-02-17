import java.util.*;
class prog1{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		if(m > 90){
			System.out.println("Grade A companies");
		}
		else if(m > 70 && m <= 90)	System.out.println("Grade B companies");
		else if(m >= 50 && m < 70)	System.out.println("Only internship");
		else	System.out.println("Nothing");
		scn.close();
	}
}
		