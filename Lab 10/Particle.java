public class Particle
{
                private double a ;
                private double b ;
                private double c ;
                private double d;
                public static double velocitymax = 0.0;
    Particle(double newA, double newB , double newC , double newD)
    {
            a = newA;
            b = newB;
            c = newC;
            d = newD;
    }
    public void table( double start , double end , double increment)
    {
       if(start>0 && end> 0 )
       {
          System.out.println("Time         Loc           Vel");
          double time = 0.0;
          int i =0;
          double size = (end-start)/increment ;
          int fsize = (int)size +2;
          double location[] = new double[fsize];
          double velocity[] = new double[fsize];
             for(time = start ; time<= end ; time+= increment)
             {
                location[i] = (a*Math.pow(time,4)) + (b*Math.pow(time,3)) + (c*Math.pow(time,2)) + (d*time);
                velocity[i] = (4.0*a*Math.pow(time,3)) + (3.0*b*Math.pow(time,2)) + (2.0*c*time);
                     if(((Math.abs(location[i]))-(Math.abs(location[i+1])))>1)
                     {
                                System.out.println(time + "         "  + location[i] + "            " + velocity[i] + "           More than a unit movement");
                     }
                     else
                     {
                                System.out.println(time + "         "  + location[i] + "            " + velocity[i]);
                     }
                     if(velocity[i] > velocitymax)
                     {
                         velocitymax = velocity[i];
                     }
                     i++;
             }
       }
    }
    public static double getvelocitymax()
                {
                              return velocitymax;
                }
    public static void setvelocitymax(double newvelocitymax)
                {
                                velocitymax = newvelocitymax;
                }
    public String toString()
                {
                return "location(t)=" +" " + a+"t^4"+ "   +   " + b + "t^3" + "     +    " + c + "t^2" + "     +     " + d + "t" ;
                }
}