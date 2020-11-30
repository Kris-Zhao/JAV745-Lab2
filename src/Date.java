/**
 * This date class has been developed below, including three instance variables, a constructor to initialize these three instance variables. There are
 * another two kinds of methods for each instance variable. Finally, it would also have a displayDate method to display the month, day and year. 
 * 
 * @author Yuhang Zhao, student number 150467199
 *
 */
public class Date {
	/**
	 * Some private instance variables
	 */
	private int month;
	private int day;
	private int year;
	
	/**
	 * constructor for Date class
	 */
	public Date(int Month, int Day, int Year)
	{
		this.month = Month;
		this.day = Day;
		this.year = Year;
	}
	
	/**
	 * set these three instance variables
	 */
	public void setMonth(int Month)
	{
		month = Month;
	}
	public void setDay(int Day)
	{
		day = Day;
	}
	public void setYear(int Year)
	{
		year = Year;
	}
	
	/**
	 * return these three instance variables
	 */
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	
	/**
	 * displayDate method to display month, day and year 
	 */
	public void displayDate()
	{
		System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
	}

}
