import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
public class FindFrequency
{
        public static String fileName = "Divvy_Trips_July2013.csv";	
	public FindFrequency() 
	{
		setFileName(fileName);
	}
	public String getFileName() 
	{
		return fileName;
	}
	public void setFileName(String fileName) 
	{
		FindFrequency.fileName = fileName;
	}
	public static void getFrequency() 
	{ 
		int counter = 0;
		int arraySize = 0;
		boolean frequency = false;
	       try {
			File myfile = new File (fileName);
			Scanner fileScanner = new Scanner(myfile);
			while(fileScanner.hasNextLine()) 
			{
				String readLine = fileScanner.nextLine();
				arraySize = arraySize + 1;
			}
			Scanner dupeScanner = new Scanner(myfile);
			String[] listFile = new String[arraySize];
			while(dupeScanner.hasNextLine())
			{
			    int frequent=0;
			   String readLine = dupeScanner.nextLine();
			     for(int a = 0; a <= counter - 1; a++ ) 
			      {
			            String [] array1 = listFile[a].split(",");
				    String [] array2 = readLine.split(",");
					if(array1[0].equals(array2[0])) 
					{
						frequency = true;
						frequent++;
					}
			      }
					if (frequency == true)
					{
						listFile[counter] = readLine;
						if ((frequent%5)/5==0)
						{
						 System.out.println(frequent+"  "+readLine);
				                }      
						frequency = false;
					}
					if (frequency == false) 
					{
						listFile[counter] = readLine;
						counter = counter + 1;
					}
			}	
		}
			catch (FileNotFoundException fnfe) 
			{
			 System.out.println("Message: "+ fnfe.getMessage());
                         System.out.println("\ntoString():" +fnfe+"\n");
                         fnfe.printStackTrace();	
			}
	}
}
