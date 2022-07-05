public class LongLiveBob 
{
 public static void main(String[] args) 
 { 
   BobsLife obj = new BobsLife("home", 0 ,4 ,5);
   String[] moveBob = new String[100];
       for(int i = 0 ; i<100 ; i+=5)
       {
                moveBob[i+0] = "home";
                obj.nextTime();
                System.out.println(obj.toString());
                moveBob[i+1] = "home";
                obj.nextTime();
                System.out.println(obj.toString());
                moveBob[i+2] = "home";
                obj.nextTime();
                System.out.println(obj.toString());
                moveBob[i+3]  = "work";
                obj.nextTime();
                System.out.println(obj.toString());
                moveBob[i+4] = "gym";
                obj.nextTime();
                System.out.println(obj.toString());
       }
 }
}