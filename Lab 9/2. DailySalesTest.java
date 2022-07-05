import java.util.Random;
public class DailySalesTest
{
   public static void main(String args[])
    {
        DailySales Month = new DailySales(31);
        Random gen = new Random();
        for(int i = 0; i< 31; i++)
        {
            Month.addSales((i+1), gen.nextInt(140));
        }
       System.out.println("Start Array");
       int [] test2 = Month.getArray();
       for(int i=0; i<test2.length; i++)
        {
            System.out.println((i+1) +" "+ test2[i]);
       }
       System.out.println("End Array");
        System.out.println("/" + Month.maxDay() + "/");
        int [] test = Month.daysBelowGoal();
        for(int i=0; i<test.length; i++)
        {
            System.out.println(test[i]);
       }
    }   
}