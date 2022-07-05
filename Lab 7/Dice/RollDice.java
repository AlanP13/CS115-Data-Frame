public class RollDice
{
	public static void main(String[] args)
	{
		SixSidedDie A = new SixSidedDie();
		TwelveSidedDie B = new TwelveSidedDie();
		System.out.println("Game 1");
		int total_1 = 0;
		for (int i=1; i < 11; i++)
		{
			int Avalue = A.roll();
			int Bvalue = B.roll();
			System.out.println("Iteration " + i + ": A rolled " + A.roll() + " and B rolled " + B.roll());
			total_1 = total_1 + Avalue + Bvalue;
		}
		System.out.println("\n Final sum of rolls: " + total_1 + "\n");
		System.out.println("Game 2");
		int total_2 = 0;
		int counter = 0;
		if (total_2 != 8)
		{
			for (int i = 1; total_2 != 8; i++)
			{
				int Avalue = A.roll();
				int Bvalue = B.roll();
			        System.out.println("Iteration " + i + ": A rolled " + A.roll() + " and B rolled " + B.roll());
			        total_2 =Avalue + Bvalue;
			        counter++;
			}
		}
		System.out.println("\n It took " + counter + " iterations to roll a sum of 8");
	}


}