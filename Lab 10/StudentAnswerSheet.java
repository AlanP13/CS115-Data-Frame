public class StudentAnswerSheet {
   private String name;
   private char answers[];
   private static char key[];
   public StudentAnswerSheet(String name, char[] answers) {
       this.name = name;
       this.answers = answers;
   }
   public String getName() {
       return name;
   }
   public static void setKey(char[] Key) {
       key = Key;
   }
   public double Score() {
       double score = 0;
       if (key.length != answers.length) {
           return Double.NEGATIVE_INFINITY;
       }
       for (int i = 0; i < key.length; i++) {
           if (key[i] == answers[i]) {

               score += 1;
           } else if (answers[i] == '?') {
               continue;
           } else {
               score -= 0.25;
           }
       }
       return score;
   }
   public String toString() {
       String ans = "";
       for (int i = 0; i < answers.length; i++) {
           ans += answers[i] + " ";
       }
       return name + " " + ans + "score = " + Score();
   }
}