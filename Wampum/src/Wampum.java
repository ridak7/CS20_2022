import java.text.NumberFormat;

public class Wampum 
{
	
	
	
	public static void topTwoBars()
	{
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||||||||||||");
	}
	public static void horizBarTop()
	{
		System.out.println("------------------------------");
		
	}


	public static void main(String[] args) 
	{
		
		
			final double RATE = .075;
			double investValue = 2500.00;
			int numYears = 0;
			NumberFormat decimal = NumberFormat.getNumberInstance();

			do {
				investValue += (investValue * RATE);
				numYears++;
			} while (investValue < 5000.00);

			/* Display number of years to reach $5000.00 or more and the final value */
			System.out.println("It will take " + numYears + " years for this investment to be worth $" + decimal.format(investValue));
		}
		
		
	
	
}
