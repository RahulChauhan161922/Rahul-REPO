package BASICS;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double a, double b)
	{
		double diff=Math.abs(a-b);
		if(diff<0.0009)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
