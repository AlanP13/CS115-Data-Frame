package FinalProject;

public class randomTesting {

	public static void main(String[] args) {
		String fileName = "PEdata-multiYear.csv";
		System.out.println("Filename:  " + fileName);
		DataFrameSimple a = new DataFrameSimple();
		a.setDataFrame(fileName);
		a.getData();
		a.getAverage("ID");
		a.getMax("age");
	}

}
