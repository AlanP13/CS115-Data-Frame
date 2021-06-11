public class DataFrame {
        //2303,M,1,12/7/2015 8:59,5,16,13.7,30,539,26
	//id,testnumber,age,curlUps,shuttleRuns,siteReach,mileRuns,pushups
	private String column;
	private String datatype;
	private int columni;
	private float columnf;
	private double columnd;
	private double col;
	public DataFrame(String column, String datatype) 		
	{
		super();
		this.column = column;
		datatype=datatype;
        }
        public DataFrame(int column,String datatype) 		
	{
		super();
		this.columni = column;
		datatype=datatype;
        }
        public DataFrame(float column,String datatype) 		
	{
		super();
		this.columnf = column;
		datatype=datatype;
        }
        public DataFrame(double column,String datatype) 		
	{
		super();
		this.columnd = column;
		datatype=datatype;
        }
        public void getDatatype()
        {
        if(datatype=="int"||datatype=="integer"||datatype=="Int"||datatype=="Integer")
        {
		double col= Double.valueOf(columni);
        }
        else if(datatype=="double"||datatype=="Double")
        {
			double col= Double.valueOf(columnd);	
        }
        else if(datatype=="float"||datatype=="Float")
	{			     
          double col= Double.valueOf(columnf);
        }
        else
        {
            double col=Double.valueOf(column);
        }
        }
	public double getcolumn1() {	
	    return col;
	}
	public void setcolumn1(double id) {
		this.col = id;
	}
	@Override
	public String toString() {
		return "DataFrame [" + col + "]";
	}
}
