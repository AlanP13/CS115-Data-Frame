public class DailySales {
    int [] DailySales;
    public DailySales()
    {
        DailySales = new int[31];
    }
    public DailySales(int daysInMonth)
    {
        DailySales = new int[daysInMonth];
    }
    public boolean addSales(int dayNo, int sale) 
    {
        System.out.println("{" +dayNo + "} Start ");
        if (dayNo > 0 && dayNo <= DailySales.length && sale >= 0)
        {
            DailySales [(dayNo-1)] = DailySales[(dayNo-1)] + sale;
            System.out.println(DailySales[(dayNo-1)]);
            return true;
        }
        else
        {
            return false;
        }
    }
    public int maxDay()
    {
        int max = 0;
        int maxsale = 0;
        for (int i = 0; i < DailySales.length; i++)
        {
            if (DailySales[i] > maxsale)
            {
                maxsale = DailySales[i];
                max = i;
            }
        }
        return (max+1);
    }
    public int[] daysBelowGoal()
    {
        int NoOfDays = 0;
        for (int i = 0; i< DailySales.length; i++)
        {
            if(DailySales[i] < 100)
            {
                NoOfDays++;
            }
        }
        int [] Daysbelow;
        Daysbelow = new int [NoOfDays];
        int c = 0;
        for(int i = 0; i < DailySales.length; i++)
        {
           if(DailySales[i] < 100)
           {
               Daysbelow[c] = i+1;
               c++;
           }
        }
        return Daysbelow;
    }
    public int[] getArray()
    {
        return DailySales;
    }
}