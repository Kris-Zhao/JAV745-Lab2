/**
 * This HeartRates class includes five instance variables, including firstName, lastName, month, day and year of the birth date. There
 * are a constructor, set methods and get methods for each instance variable, a calAge method calculating the age, a maxHeartRate method
 * returning the person's maximum heart rate, a targetHeartRatelow and a targetHeartRateHigh methods to calculate the range.
 * @author Yuhang Zhao, student number 150467199
 *
 */
public class HeartRates {
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	
	public HeartRates(String first_name, String last_name, int month, int day, int year)
	{
		this.firstName = first_name;
		this.lastName = last_name;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public void setfn(String fn) 
	{
		this.firstName = fn;
	}
	public void setln(String ln)
	{
		this.lastName = ln;
	}
	public void setm(int m)
	{
		this.month = m;
	}
	public void setd(int d)
	{
		this.day = d;
	}
	public void sety(int y)
	{
		this.year = y;
	}
	
	
	public String getfn()
	{
		return this.firstName;
	}
	public String getln()
	{
		return this.lastName;
	}
	public int getm()
	{
		return this.month;
	}
	public int getd()
	{
		return this.day;
	}
	public int gety()
	{
		return this.year;
	}
	
	public int calAge()
	{
		return 2020 - gety();
	}
	
	public int maxHeartRate()
	{
		return 220 - calAge();
	}
	
	public double targetHeartRateLow()
	{
		return 0.5*maxHeartRate();
	}
	public double targetHeartRateHigh()
	{
		return 0.85*maxHeartRate();
	}
		
}
