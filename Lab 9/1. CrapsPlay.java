import java.util.Scanner;
public class CrapsPlay 
{
	public static void main(String args[])
	{
		Die p1roll1 = new Die();
		Die p1roll2 = new Die();
		Die targetroll1 = new Die();
		Die targetroll2 = new Die();
		targetroll1.roll();	
		targetroll2.roll();
		int total = targetroll1.getSide() +  targetroll2.getSide();
		p1roll1.roll();
		p1roll2.roll();
		int playertotal = p1roll1.getSide() + p1roll2.getSide();
		System.out.println("Target Roll :"+ targetroll1.getSide()+"+"+targetroll2.getSide()+"="+total);
		if(total == 7)
		{
			System.out.println("You won on your first roll!");
			System.out.println("Press any key to continue");
		}
		else
		{
			while(playertotal != total)
			{
				p1roll1.roll();
				p1roll2.roll();
				playertotal = p1roll1.getSide() + p1roll2.getSide();
				System.out.println("You rolled:"+p1roll1.getSide()+"+"+ p1roll2.getSide()+"="+playertotal);
				if(playertotal == 7)
				{
					System.out.println("CRAPS! You lost.");
					break;
				}
			}
			if(playertotal == total)
			{
				System.out.println("You rolled your target. You won!");
			}
			
			System.out.println("Press any key to continue");
		}		
	}
}