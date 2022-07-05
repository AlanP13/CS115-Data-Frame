import java.util.Random;
import java.util.Scanner;
public class SwitchNoSwitch {
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
            String Switch = "Switch";
            String Stay = "Stay";
            double SwitchWin = 0;
            double SwitchLoss = 0;
            double StayWin = 0;
            double StayLoss = 0;
            for(int i = 0; i < 1000000; i++)
            {
                    if(Switch.equals("Switch"))
                    {
                        if(montyHallTrial(true) == 1)
                        {
                            SwitchWin++;
                        }
                        else if(montyHallTrial(true) == 0)
                        {
                            SwitchLoss++;
                        }
                    }
                    if (Stay.equals("Stay"))
                    {
                        if (montyHallTrial(false) == 1)
                        {
                            StayWin++;
                        }
                        else if(montyHallTrial(false) == 0)
                        {
                            StayLoss++;
                        }
                    }
                   
             }
             
            double SwitchWinPercent = (SwitchWin / (SwitchWin + SwitchLoss)) * 100;
            double StayWinPercent = (StayWin / (StayWin + StayLoss)) * 100;
            
            
            System.out.println("Switch Win Percentage: " + SwitchWinPercent + "%");
            System.out.println("Stay Win Percentage: " + StayWinPercent + "%");
            
            
           
            
        }
        
        public static int montyHallTrial (boolean playerSwitch)
        {
            Random Gen = new Random();
            final int Chosen = Gen.nextInt(3);
            int Winner = Gen.nextInt(3);
            int MasterOpened = Gen.nextInt(3);
            
                while (MasterOpened == Chosen || MasterOpened == Winner)
                {
                    MasterOpened = Gen.nextInt(3);
                }
            
            
            if(playerSwitch == false)
            {
                if(Chosen == Winner)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            
                if(playerSwitch == true)
                {
                    int NewChosen = Gen.nextInt(3);
                    while (NewChosen == Chosen || NewChosen == MasterOpened)
                    {
                        NewChosen = Gen.nextInt(3);
                    }
                    if(NewChosen == Winner)
                    {
                        return 1;
                    }
                    if(!(NewChosen == Winner))
                    {
                        return 0;
                    }
                }
            
            
            return 0;
        }