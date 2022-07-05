import java.util.Scanner;
public class BobsLife
{
         int time = 0;
         int hunger = 0;
         int dollar = 6;
         int fitness = 5;
         boolean alive = true;
         boolean jail = false; 
         String home = "home"; 
	 String work = "work";
	 String gym = "gym"; 
	 Scanner location = new Scanner(System.in);
	 	public int nextTime()
	 	{
	 		time = time + 1;
	 		return time;	
	 	}
	 	public void move(String location)
	 	{
	 		if(location.equals(home))
	 		{
	 			hunger = hunger - 3;
	 			dollar = dollar - 1;			
	 			if (hunger <= 0)
	 			{
	 				hunger = 0;
	 			}
	 		}	
	 		if(location.equals(work))
	 		{
	 			hunger = hunger + 2;
	 			dollar = dollar + 3;
	 			fitness = fitness - 1;
	 		}
	 		if(location.equals(gym))
	 		{
	 			hunger = hunger + 3;
	 			dollar = dollar - 2;
	 			fitness = fitness - 1;
	 		}
	 		if(hunger > 6)
	 		{
	 			alive = false;
	 		}
	 		if(fitness == 0)
	 		{
	 			alive = false;
	 		}
	 		if(dollar < 0)
	 		{
	 			jail = true;
	 		}
	 	}
	 	public int getHunger()
	 	{
	 		return hunger;
	 	}
	 	public int getDollar()
	 	{
	 		return dollar;
	 	}
	 	public int getFitness()
	 	{
	 		return fitness;
	 	}
	 	public Scanner getLocation()
	 	{
	 		return location;
	 	}
	 	public boolean getAlive()
	 	{
	 		 return alive;
	 	}
	 	public boolean getJail()
	 	{
	 		return jail;
	 	}
	 	public String getStatus()
	 	{
	 		if (alive == true)
	 		{
	 			if (jail == true)
	 			{
	 				return " (alive but in jail)";
	 			}	 			
	 			return " (alive and well)";
	 		}
	 		else 
	 		{
	 			return " (deceased)";
	 		}
	 	}
}