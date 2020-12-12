package BASICS;

public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes)
	{
		if(minutes<0)
			System.out.println("Invalid Value");
		else
		{
			long days= minutes/(24*60);
			long years=days/365;
			days=days%365;
			System.out.println(minutes+" min = "+years+" y and "+days+" d");
		}
	}

}
