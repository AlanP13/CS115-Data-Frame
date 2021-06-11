import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
public class dataframe_test
{
    static ArrayList<DataFrame> dataFrameObjectsList;
    public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   String csvFile1=" "; // Set the file name here
           System.out.println("Enter filename(with .csv):");
	   String fn = scan.nextLine();
	   csvFile1=fn; 
	   String column="";
	   Scanner scan2 = new Scanner(System.in);
           System.out.println("Enter the Column you want to use");
           String column1= scan2.nextLine();
           column=column1;
           String type="";
           Scanner scan3 = new Scanner(System.in);
           System.out.println("Enter the Datatype you want to use");
           String datatype= scan2.nextLine();
           type=datatype;
	   importCSVfile(csvFile1,column,type);
	   clearConsole(csvFile1);
	   showmenuForUserInput(csvFile1,column);
        }
        private static void showmenuForUserInput(String csvFile1, String column) 
	{
		System.out.println("MENU SYSTEM for USER INPUT started");
		System.out.println("Note the csv file can't have more than 10 columns");
		String csvFile=csvFile1;
		int userInput = -1;
		FindFrequency test = new FindFrequency();
		test.setFileName(csvFile);
		Scanner sc = new Scanner(System.in);
		do {
		      System.out.println("1. Enter 1 for finding Average value in an active Column");
		      System.out.println("2. Enter 2 for finding Maximum value in an active Column");
		      System.out.println("3. Enter 3 for finding Minimum value in an active Column");
		      System.out.println("4. Enter 4 for finding Frequency of data in an active Columnn");
	              System.out.println("5. Enter 0 for EXIT");
		      System.out.println("Enter your choice: ");
		      userInput = sc.nextInt();
			switch (userInput) 
			{
			        case 1:
				findAveragebyColumnName(column);//done
				break;
			        case 2:
				findMaximumbyColumnName(column);// done
				break;
			        case 3:
				findMinimumbyColumnName(column);//done
				break;
			        case 4:
				test.getFrequency();//done
				break;
			        default:
				System.out.println("INVALID INPUT Enter 0 to EXIT");
				break;
			}
		} while (userInput != 0);
	}
	private static void findMaximumbyColumnName(String column) 
	{
		int userInput = -1;
		double maximum = -1;
		 aa: do {
			System.out.println("FIND MAXIMUM By COLUMNNAME");
			userInput = Integer.parseInt(column);
			if (userInput == 0) 
			{
				break aa;
			} 
			else if (userInput <0) 
			{
				System.out.println("INVALID entry limit is 1 to 10");
			} 
			else 
			{
				maximum = maximumValueInColumn(userInput);
				System.out.println("MAXIMUM VALUE : " + maximum);
			}
		   } while (userInput != 0);
	}
	private static double maximumValueInColumn(int userInput) 
	{
		TreeSet<Double> set = new TreeSet<Double>();
		if (userInput == 1) 
		{// id
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 2)
		{// testnumber
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 3) 
		{// age
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 4) 
		{// curlUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 5) 
		{// shuttleruns double type
			for (DataFrame d : dataFrameObjectsList)
				set.add((double)d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 6)
		{// siteReach
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 7) 
		{// mileRuns
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 8) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		} 
		else if (userInput == 9) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		}
		else if (userInput == 10) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.last());
		}
		else 
		{
			return -1;
		}
	}
	private static void findMinimumbyColumnName(String column) 
	{
	    int userInput = -1;
		double minimum = -1;
		aa: do {
			System.out.println("FIND MINIIMUM By COLUMNNAME");
                        userInput = Integer.parseInt(column);
			if (userInput == 0) 
			{
				break aa;
			} 
			else if (userInput < 1 || userInput > 8) 
			{
				System.out.println("INVALID entry limit is 1 to 8");
			} 
			else 
			{
				minimum = minimumValueInColumn(userInput);
				System.out.println("MINUIMUM VALUE : " + minimum);
			}
		   } while (userInput != 0);
	}
	private static double minimumValueInColumn(int userInput) 
	{
		TreeSet<Double> set = new TreeSet<Double>();
		if (userInput == 1) 
		{// id
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 2)
		{// testnumber
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 3) 
		{// age
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 4) 
		{// curlUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 5) 
		{// shuttleruns double type
			for (DataFrame d : dataFrameObjectsList)
				set.add((double)d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 6)
		{// siteReach
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 7) 
		{// mileRuns
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 8) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		} 
		else if (userInput == 9) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		}
		else if (userInput == 10) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return (set.first());
		}
		else 
		{
			return 1;
		}
	}
	private static void findAveragebyColumnName(String column) 
	{
	    int userInput = -1;
		double average = -1;
		aa: do {
			System.out.println("FIND AVERAGE By COLUMNNAME");
			userInput = Integer.parseInt(column);
			if (userInput == 0) 
			{
				break aa;
			}
			else if (userInput < 1 || userInput > 8) 
			{
				System.out.println("INVALID entry limit is 1 to 8");
			} 
			else 
			{
				average = averageValueInColumn(userInput);
				System.out.println("AVERAGE VALUE : " + average);
			}
		    } while (userInput != 0);
	}
	private static double averageValueInColumn(int userInput) 
	{
		TreeSet<Double> set = new TreeSet<Double>();
		if (userInput == 1) 
		{// id
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 2)
		{// testnumber
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 3) 
		{// age
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 4) 
		{// curlUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 5) 
		{// shuttleruns double type
			for (DataFrame d : dataFrameObjectsList)
				set.add((double)d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 6)
		{// siteReach
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 7) 
		{// mileRuns
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 8) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		} 
		else if (userInput == 9) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		}
		else if (userInput == 10) 
		{// pushUps
			for (DataFrame d : dataFrameObjectsList)
				set.add((double) d.getcolumn1());
			return ((set.last()+set.first())/2);
		}
		else 
		{
			return -1;
		}
	}
    private static void importCSVfile(String csvFile1, String column,String datatype1)
        {
                String csvFile= csvFile1;
		String columns[];
		String column_number=column;
		String datatype=datatype1;
		int count = 1;
		dataFrameObjectsList = new ArrayList<DataFrame>();
		String temp = null;
		try (Scanner reader = new Scanner(new FileReader(csvFile))) 
		{
			while (reader.hasNextLine()) 
			{
				temp = reader.nextLine();
				/*1st 2 lines contains string & data type name only
				 so skip them and when columns in each row is 10*/
				columns = temp.split(",");
				if (count > 2 && columns.length == 10) 
				{
				  if(column_number=="1")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column1=0;
				       if (columns[0] != null && !columns[0].isEmpty())
						column1 = Integer.parseInt(columns[0]);
				       DataFrame frame = new DataFrame(column1,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column1=0;
				       if (columns[0] != null && !columns[0].isEmpty())
						column1 = Double.parseDouble(columns[0]);
				      DataFrame frame = new DataFrame(column1,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column1=0;
				       if (columns[0] != null && !columns[0].isEmpty())
						column1 = Float.parseFloat(columns[0]);
				       DataFrame frame = new DataFrame(column1,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column1="";
			                  if (columns[0] != null && !columns[0].isEmpty())
						column1 = (columns[0]);
				       DataFrame frame = new DataFrame(column1,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
			           }
				   if(column_number=="2")
				   {
				     {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column2=0;
				       if (columns[1] != null && !columns[1].isEmpty())
						column2 = Integer.parseInt(columns[1]);
				     DataFrame frame = new DataFrame(column2,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column2=0;
				       if (columns[1] != null && !columns[1].isEmpty())
						column2 = Double.parseDouble(columns[1]);
				       DataFrame frame = new DataFrame(column2,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column2=0;
				       if (columns[1] != null && !columns[1].isEmpty())
						column2 = Float.parseFloat(columns[1]);
				       DataFrame frame = new DataFrame(column2,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column2="";
			                  if (columns[1] != null && !columns[1].isEmpty())
						column2 = (columns[1]);
				       DataFrame frame = new DataFrame(column2,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
			           }
			         }
				    if(column_number=="3")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column3=0;
				       if (columns[2] != null && !columns[2].isEmpty())
						column3 = Integer.parseInt(columns[2]);
				       DataFrame frame = new DataFrame(column3,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column3=0;
				       if (columns[2] != null && !columns[2].isEmpty())
						column3 = Double.parseDouble(columns[2]);
				       DataFrame frame = new DataFrame(column3,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column3=0;
				       if (columns[2] != null && !columns[2].isEmpty())
						column3 = Float.parseFloat(columns[2]);
				      DataFrame frame = new DataFrame(column3,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column3="";
			                  if (columns[2] != null && !columns[2].isEmpty())
						column3 = (columns[2]);
				       DataFrame frame = new DataFrame(column3,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="4")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column4=0;
				       if (columns[3] != null && !columns[3].isEmpty())
						column4 = Integer.parseInt(columns[0]);
				       DataFrame frame = new DataFrame(column4,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column4=0;
				       if (columns[3] != null && !columns[3].isEmpty())
						column4 = Double.parseDouble(columns[3]);
				       DataFrame frame = new DataFrame(column4,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column4=0;
				       if (columns[3] != null && !columns[3].isEmpty())
						column4 = Float.parseFloat(columns[3]);
				      DataFrame frame = new DataFrame(column4,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column4="";
			                  if (columns[3] != null && !columns[3].isEmpty())
						column4= (columns[3]);
				       DataFrame frame = new DataFrame(column4,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="5")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column5=0;
				       if (columns[4] != null && !columns[4].isEmpty())
						column5 = Integer.parseInt(columns[4]);
				       DataFrame frame = new DataFrame(column5,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column5=0;
				       if (columns[4] != null && !columns[4].isEmpty())
						column5 = Double.parseDouble(columns[4]);
				       DataFrame frame = new DataFrame(column5,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column5=0;
				       if (columns[4] != null && !columns[4].isEmpty())
						column5 = Float.parseFloat(columns[4]);
				       DataFrame frame = new DataFrame(column5,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column5="";
			                  if (columns[4] != null && !columns[4].isEmpty())
						column5 = (columns[4]);
				       DataFrame frame = new DataFrame(column5,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="6")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column6=0;
				       if (columns[5] != null && !columns[5].isEmpty())
						column6 = Integer.parseInt(columns[5]);
				      DataFrame frame = new DataFrame(column6,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column6=0;
				       if (columns[5] != null && !columns[5].isEmpty())
						column6 = Double.parseDouble(columns[5]);
				       DataFrame frame = new DataFrame(column6,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column6=0;
				       if (columns[5] != null && !columns[5].isEmpty())
						column6 = Float.parseFloat(columns[5]);
				       DataFrame frame = new DataFrame(column6,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column6="";
			                  if (columns[5] != null && !columns[5].isEmpty())
						column6 = (columns[5]);
				       DataFrame frame = new DataFrame(column6,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="7")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column7=0;
				       if (columns[6] != null && !columns[6].isEmpty())
						column7 = Integer.parseInt(columns[6]);
				       DataFrame frame = new DataFrame(column7,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column7=0;
				       if (columns[6] != null && !columns[6].isEmpty())
						column7 = Double.parseDouble(columns[6]);
				       DataFrame frame = new DataFrame(column7,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column7=0;
				       if (columns[6] != null && !columns[6].isEmpty())
						column7 = Float.parseFloat(columns[6]);
				       DataFrame frame = new DataFrame(column7,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column7="";
			                  if (columns[6] != null && !columns[6].isEmpty())
						column7 = (columns[6]);
				       DataFrame frame = new DataFrame(column7,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="8")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column8=0;
				       if (columns[7] != null && !columns[7].isEmpty())
						column8 = Integer.parseInt(columns[7]);
				       DataFrame frame = new DataFrame(column8,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column8=0;
				       if (columns[7] != null && !columns[7].isEmpty())
						column8 = Double.parseDouble(columns[7]);
				       DataFrame frame = new DataFrame(column8,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column8=0;
				       if (columns[7] != null && !columns[7].isEmpty())
						column8 = Float.parseFloat(columns[7]);
				       DataFrame frame = new DataFrame(column8,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column8="";
			                  if (columns[7] != null && !columns[7].isEmpty())
						column8 = (columns[7]);
				       DataFrame frame = new DataFrame(column8,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="9")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column9=0;
				       if (columns[8] != null && !columns[8].isEmpty())
						column9 = Integer.parseInt(columns[8]);
				       DataFrame frame = new DataFrame(column9,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column9=0;
				       if (columns[8] != null && !columns[8].isEmpty())
						column9 = Double.parseDouble(columns[8]);
				       DataFrame frame = new DataFrame(column9,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column9=0;
				       if (columns[8] != null && !columns[8].isEmpty())
						column9 = Float.parseFloat(columns[8]);
				       DataFrame frame = new DataFrame(column9,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column9="";
			                  if (columns[8] != null && !columns[8].isEmpty())
						column9 = (columns[8]);
				       DataFrame frame = new DataFrame(column9,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				    if(column_number=="10")
				   {
				     if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
				     {
				         int column10=0;
				       if (columns[9] != null && !columns[9].isEmpty())
						column10 = Integer.parseInt(columns[9]);
				       DataFrame frame = new DataFrame(column10,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="double"||datatype=="Double")
				     {
				         double column10=0;
				       if (columns[9] != null && !columns[9].isEmpty())
						column10 = Double.parseDouble(columns[9]);
				       DataFrame frame = new DataFrame(column10,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else if(datatype=="float"||datatype=="Float")
				     {
				         float column10=0;
				       if (columns[9] != null && !columns[9].isEmpty())
						column10 = Float.parseFloat(columns[9]);
				       DataFrame frame = new DataFrame(column10,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			              }
			              else
			              {
			                  String column10="";
			                  if (columns[9] != null && !columns[9].isEmpty())
						column10 = (columns[9]);
				       DataFrame frame = new DataFrame(column10,datatype);
			               dataFrameObjectsList.add(frame);
				       System.out.println(frame);
			                 }
				    }
				}
				count++;
                 }
                }
                catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void clearConsole(String csvFile1) 
	{
		System.out.print("/----/");
		System.out.flush();
	}
}