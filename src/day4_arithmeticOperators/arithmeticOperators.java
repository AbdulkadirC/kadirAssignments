package day4_arithmeticOperators;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		//Additional Operator +
		
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs+2);
		chairs = chairs+2;
		
		int moreChairs = chairs+5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables+chairs;
		System.out.println(total);
		
		//Substraction -
		
		double balance = 1200.50;
		double transaction = 50.60;
		System.out.println(balance - transaction);
		
		balance = balance-transaction;
		System.out.println(balance);
		
		//Create a variable linesOfCode and assign 50 and print "Lines of Code 50"
		//Delete 2 lines
		//Decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		int linesOfCode = 50;
		System.out.println("Lines of Code " + linesOfCode);
		linesOfCode = linesOfCode-2;
		System.out.println("Lines of Code " + linesOfCode);
		
		//Multiplication *
		
		System.out.println(22*2);
		
		int classes = 5;
		System.out.println(linesOfCode * classes);
		int totallinesOfCode = linesOfCode * classes;
		System.out.println("Total Lines of Code = " + totallinesOfCode);
		
		//Division /
		
		System.out.println(10/2);
		System.out.println(60/3);
		
		//System.out.println(11/0); //Throw error while running the code
		
		//Remainder %
		
		System.out.println(10%2);
		System.out.println(9%2);
		
		
		
		

	}

}
