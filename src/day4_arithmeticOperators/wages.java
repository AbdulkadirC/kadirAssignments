package day4_arithmeticOperators;

//This program calculates hourly wages plus overtime


public class wages {

	public static void main(String[] args) {
		
		double regularWage; //The calculated regular wage
		double basePay = 25.75; //The base pay
		double regularHours = 40; //The hours worked less overtime
		double overtimeWage; //Overtime wages
		double overtimePay = 37.5; //Overtime Pay rate
		double overtimeHours = 15;
		double totalWage; //Total wage
		
		regularWage = basePay * regularHours;
		overtimeWage = overtimePay * overtimeHours;
		
		totalWage = regularWage + overtimeWage ; 
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		
		

	}

}
