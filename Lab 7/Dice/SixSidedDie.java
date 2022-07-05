import java.util.Random;
public class SixSidedDie
{
     private int value = 1;
	 public int roll()
	 {
		 Random Number = new Random();
		 int roll = (Number.nextInt(6)) + 1;
		 value = roll;
		 return value;
	 }
	 public String toString()
	 {
		SixSidedDie text = new SixSidedDie();
		return  "rolled: " + text.roll();
	 }
}