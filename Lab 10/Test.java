import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {
   public static void main(String[] args) {
       try {
           Scanner scan = new Scanner(new File("studentanswers.txt"));
           StudentAnswerSheet arr[] = new StudentAnswerSheet[100];
           int number_of_students = 0;
           String tokens[];
           char ans[] = null;
           if (scan.hasNext()) {
               tokens = scan.nextLine().split(",");
               ans = new char[tokens.length];
               for (int i = 0; i < tokens.length; i++) {
                   ans[i] = tokens[i].trim().charAt(0);
               }
           }
         while (scan.hasNext()) {
               String data[] = scan.nextLine().trim().split(",");
               String name = data[0].trim();
               char answers[] = new char[data.length - 1];
               for (int i = 0; i < data.length - 1; i++) {
                   answers[i] = data[i + 1].trim().charAt(0);
               }
               StudentAnswerSheet s = new StudentAnswerSheet(name, answers);
               s.setKey(ans);
               System.out.println(s);
               arr[number_of_students] = s;
               number_of_students += 1;
           }
           scan.close();
           double high = Double.MIN_VALUE;
           for (int i = 0; i < number_of_students; i++) {
               if (high < arr[i].Score()) {
                   high = arr[i].Score();
               }
           }
           System.out.print("Student(s): ");
           for (int i = 0; i < number_of_students; i++) {
               if (arr[i].Score() == high) {
                   System.out.print(arr[i].getName() + " ");
               }
           }
       } 
       catch (FileNotFoundException e) 
       {
           System.err.println(e.getMessage());
       }
   }
}