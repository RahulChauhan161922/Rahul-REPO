package BASICS;

public class MegaBytesConverter {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		if(kiloBytes < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			int xx= kiloBytes / 1024;
			int yy= kiloBytes % 1024;
			System.out.println(kiloBytes+" KB = "+xx+" MB and "+yy+" KB");
		}
	}

}
