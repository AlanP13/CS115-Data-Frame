import java.util.Scanner;
public class LongLiveBob
{
	public static void main(String[] args)
	{
		BobsLife a = new BobsLife();
		int time = 0;
		boolean alive = a.getAlive();
		boolean jail = a.getJail();
		Scanner location = new Scanner (System.in);
		if(alive == true && jail == false) 
		{
					while(alive == true && jail == false) 
					{
						System.out.print("Where is Bob Going: ");
		
						String input = location.nextLine();
 			
						a.move(input);		
		
						System.out.println("Time: " + time + " - location: " + input + ", hunger: " + a.getHunger() + ", dollars: " + a.getDollar() + ", fitness: " + a.getFitness() + a.getStatus());  
						System.out.println(" ");
						
						time++;
						
						alive = a.getAlive();
						jail = a.getJail();
					}
		}
		else if(alive == false || jail == true)
		{
		System.out.println(" Bob was in jail and died in jail.");
		}
	}
}
