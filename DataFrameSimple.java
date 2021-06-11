package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DataFrameSimple {
	String temp = "";
	int size = 1;
	String [] afterSplit = new String [12];
	String [][] dataArray = new String [size][12];
	
	
	int k = 0;
	String fileName = "";
	double average;
	double minValue = 10000000;
	double maxValue = 0;
	int doubleValue;
	int comparisonValue;
	int comparisonOperator;
	
	public void setDataFrame (String file) {
		this.fileName = file;
	}

	public void getData() {
		try { 
			File inputFile = new File(this.fileName);
			Scanner fileScanner = new Scanner(inputFile);
			while (fileScanner.hasNextLine()) {
				temp = fileScanner.nextLine();
				afterSplit = temp.split(",");
				
				for (int i=0;i<afterSplit.length;i++) {
					dataArray[k][i] = afterSplit[i];
				}
				k++;
				
				String[][] newArray = new String[dataArray.length + 1][12];
			    System.arraycopy(dataArray, 0, newArray, 0, dataArray.length);
			    dataArray = newArray;      

			}
		}
		catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
	
	public double getAverage(String columnName) {
		//create if statements to check the name of the column. If it is the first column then have a columnValue = 0. Then
		// you will use that value in the for loop to get the average
		//create a for loop that takes the values of the column, for example for (int=0;i<dataArray.length; i++) {
		//																			total = total + dataArray[i][columnValue]}
		//then divide that double total by the length of the array. The length wont be exact so you might need to mess with like 
		//dataArray.length-1 or dataArray.length-2
		return average;
	}
	public double getMin(String columnName) {
		// create if statements to check the name of the column above again
		// use the minValue i have above of 10000000 and compare it to a value in a for loop in the dataArray, if
		// the value is smaller then set that value to minValue and keep the for loop going until it has gone throught the 
		//whole length
		return minValue;
	}
	
	public double getMax(String columnName) {
	//same as getMin but instead of less than you use greater than
		return maxValue;
	}
	
	public void frequencyCount (String columnName) {
		
		//Ill give you the main function as it is very difficult to compute. But you need to create five intervals which are 1/5 
		// of the dataArray length and then input the values into the five intervals
		
		//System.out.println("For the first interval");
		//Arrays.stream(interval1).distinct()
       // .forEach(x -> System.out.println(x + " appears " + Collections.frequency(Arrays.asList(interval1), x) + " times."));
		}
	    

	public void comparisonOperator (String columnName, int comparisonValue, int comparisonOperator) {
		//given a comparisonValue you use a comparison operator and treat it like the getMax and getMin.
		//I used the comparisonOperator like if (comparisonOperator == 0){ i used the <, 1 was >, 2 was ==, and 3 was !=
	}


}
