import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
public class FindDuplicates 
{
	public static String fileName = "input1.txt";	
	public FindDuplicates() 
	{
		setFileName(fileName);
	}
	public String getFileName() 
	{
		return fileName;
	}
	public void setFileName(String fileName) 
	{
		FindDuplicates.fileName = fileName;
	}
	public static void getDuplicates() 
	{ 
		int counter = 0;
		int arraySize = 0;	
		boolean duplicates = false;
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
			   String readLine = dupeScanner.nextLine();
			     for(int a = 0; a <= counter - 1; a++ ) 
			      {
				String [] array1 = listFile[a].split(" ");
				String [] array2 = readLine.split(" ");
					if(array1[0].equals(array2[0])) 
					{
						duplicates = true;
						System.out.println(duplicates);
					}
			     }	
					if (duplicates == true)
					{
						listFile[counter] = readLine;
						System.out.println(counter+1+ " " + readLine);
						duplicates = false;
					}
					if (duplicates == false) 
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