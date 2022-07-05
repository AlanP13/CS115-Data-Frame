import java.text.DecimalFormat;
import java.util.Scanner;
public class ParticleApp 
{
       public static void main(String[] args) 
       {
              final DecimalFormat THREE_FORMAT = new DecimalFormat("##0.000");
              Scanner input = new Scanner(System.in);
              double a, b, c, d, start, end, increment;
                     for (int i=1; i<=2; i++) 
                     {
                         System.out.print("Values for a, b, c, d: ");
                         a = input.nextDouble();
                         b = input.nextDouble();
                         c = input.nextDouble();
                         d = input.nextDouble();
                         Particle particle1 = new Particle(a, b, c, d);
                         System.out.println("Particle Object has been created");
                         System.out.println(particle1.toString()+ "\n");
                         System.out.print("Enter time of Start: ");
                         start = input.nextDouble();
                         System.out.print("Enter time of End: ");
                         end = input.nextDouble();
                         System.out.print("Enter the increment value: ");
                         increment = input.nextDouble();
                         particle1.table(start, end, increment);
                         System.out.println("Maximum Velocity in all tables = "+THREE_FORMAT.format(Particle.getMaxVelocity())+"\n");
                     }
       }
}