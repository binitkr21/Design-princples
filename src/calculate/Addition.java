package calculate;

import java.util.Scanner;

public class Addition {

	public static void additonCall(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.addition(a, b));
	}

}

