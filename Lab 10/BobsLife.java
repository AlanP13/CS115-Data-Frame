public class BobsLife {
 private String location;
 private int hunger;
 private int fitness;
 private int dollars;
 private int time;
 private boolean isDead;
 private boolean inJail;
 private final String DEFAULT_LOCATION="home";

 public BobsLife (String l, int h, int f, int d) {
 time = 0;
 isDead = false;
 inJail = false;
 setLocation(l); 
  hunger=h; 
  fitness=f;
 dollars=d;
 }
 private void setLocation(String l) {
 if(!isDead && !inJail) {
 if (l!=null && (l.equals("home") || l.equals("work") || l.equals("gym")))
 location = l;
 else location=DEFAULT_LOCATION;
 }
 }
 public void move(String to) {
 setLocation(to);
 }

 public void nextTime() {
 time++;
 if (inJail || isDead) return;
 if (location.equals("home")) atHome();
 else if (location.equals("gym")) atGym();
 else if (location.equals("work")) atWork();
 } 
 private void atHome() {
 hunger = Math.max(0, hunger - 3);
 dollars -= 1;
 checkState();
 }
 private void atWork() {
 hunger+= 2;
 dollars += 3;
 fitness -= 1;
 checkState();
 }
 private void atGym() {
     hunger += 3;
 dollars -= 2;
 fitness += 2;
 checkState();
 }

 private void checkState() {
 if (dollars < 0) inJail = true;
 if (hunger > 6) isDead = true;
 if (fitness == 0) isDead = true;
 }
 public String toString() {
 return "Time: "+time+" - location:"+location+", hunger:"+hunger+",dollars:"+dollars+", fitness:"+fitness+" ("+getStatus()+")";
 }
 public String getStatus() {
 if (isDead)
 return ("deceased");
 if (inJail)
 return ("in jail");
 return "alive and well";
 }
}
