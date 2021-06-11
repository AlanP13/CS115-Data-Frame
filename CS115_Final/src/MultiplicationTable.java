public class MultiplicationTable 
{
	public static void main(String [] args) 
{
		int n = 6;
		int [][] t = new int[n][n]; // populate table
		for(int i = 1; i <= n; i++)
		{
         for(int j = 1; j <= n; j++)
         {	 
             t[i-1][j-1] = i * j;
} }
    // display table
for(int i = 0; i < n; i++){
for(int j = 0; j < n; j++){ System.out.print(t[i][j]+"\t");
}
System.out.print("\n"); }
} }