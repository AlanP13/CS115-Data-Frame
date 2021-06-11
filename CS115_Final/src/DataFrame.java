import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataFrame 
{
	private String name;
	private String [] columnNames;
	private String [] dataTypes;
	private String [][] data;
	
	public static String file1 = "/Users/kanoasawai/eclipse-workspace/CS115_Final/src/Divvy_Trips_July2013.csv";
	public static String file2 = "/Users/kanoasawai/eclipse-workspace/CS115_Final/src/PEdata-multiYear.csv";
	
	public DataFrame() {
		
	}
	
	public DataFrame(String name, String [] column, String [] types) {
		this.name  = name;
		this.columnNames = column;
		this.dataTypes = types;
	}
	
	public void append(String [] newData) {
		String [][] update = new String [data.length+1][data[0].length];
		
		for(int i = 0; i < data.length; i++) {
			for(int g = 0; g < data[0].length;g++) {
				update[i][g] = data[i][g];
			}
		}
		
		for(int h = 0; h < data[0].length; h++) {
			update[data.length][h] = newData[h];
		}
		
		this.data = update;
	}
	
	public double avgValues(String name) {
		
		int index = 0;
		double total = 0;
		
		for(int i = 0; i < columnNames.length; i++) {
			if(name.equalsIgnoreCase(columnNames[i])) {
				index = i;
			}
		}
		
		
		for (int g = 0; g < data.length; g++) {
			total = total + Double.parseDouble(data[g][index]);
		}
		
		return total/data.length;
	}
	
	public double minValue(String name) {
		
		int index = 0;
		double minValue = 0;
		
		for(int i = 0; i < columnNames.length; i++) {
			if(name.equalsIgnoreCase(columnNames[i])) {
				index = i;
			}
		}
		
		
		for (int g = 0; g < data.length; g++) {
			
		}
		
		return minValue;

	}
	
	
	
	//test csv files
	public static void check() 
	{ 
		int counter = 0;
		int arraySize = 0;
		boolean duplicates = false;
		
			File myfile = new File(file2);
			Scanner fileScanner;
	try {
			fileScanner = new Scanner(myfile);
			 
			while(fileScanner.hasNextLine()) 
			{
				//Reads through all lines of the file
				String readLine = fileScanner.nextLine();
				
				//Adds 1 to the array size for each line that was read
				arraySize = arraySize + 1;
				
				System.out.println(readLine);
					
			}
		}
	catch (FileNotFoundException fnfe) 
			{
				
			}
			
	}
	
	
	

}
