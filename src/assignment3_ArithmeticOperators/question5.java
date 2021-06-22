package assignment3_ArithmeticOperators;

public class question5 {

	public static void main(String[] args) {
		
		
		int inputSeconds, hour, minute, second = 1;
		minute = 60*second;
		hour = 3600*second;
		inputSeconds = 3695;
		
		hour = inputSeconds/hour;
		minute = inputSeconds/minute%60;
		second = inputSeconds/hour%60;
		
		
		/*int calculatorHour = (inputSeconds/hour%60), (inputSeconds/minute%60),(inputSeconds/60%60);
		int calculatorMinute = (calculatorHour/minute)%60;
		int calculatorSecond = (calculatorMinute/second);
		
		System.out.println(calculatorHour + " hours, " +  calculatorMinute + " minutes, " + calculatorSecond + " seconds");*/
		
		
		System.out.println(hour + " hours, " +  minute + " minutes, " + second + " seconds");
		
		
		
		
		
		
	}

}
