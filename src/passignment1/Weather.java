/**
 * Weather class - base class that defines structure of data
 */

package passignment1;

import java.time.*;

/**
 * @author Michael Inglis
 *
 */
public class Weather implements Comparable<Weather>
{
	
	private int date;
	private int dayOfYear;
	private int time;
	private double airTemp;
	private double tempWetBulb;
	private int relativeHumidity;
	private double dewPoint;
	
	
	
	public Weather(int date, int dayOfYear, int time, double airTemp, double tempWetBulb, int relativeHumidity, double dewPoint)
	{
		this.date = date;
		this.dayOfYear = dayOfYear;
		this.time = time;
		this.airTemp = airTemp;
		this.tempWetBulb = tempWetBulb;
		this.relativeHumidity = relativeHumidity;
		this.dewPoint = dewPoint;
		
	}
	/**
	 * toString method 
	 * @return a String with all the weather info
	 */
	public String toString()
	{
		return date + " | " + dayOfYear + " | " + time + " | " + airTemp + " | " + tempWetBulb + " | " + relativeHumidity + " | " + dewPoint;
	}

	/**
	 * Gets and sets for values
	 * 
	 */
	
	public int getDate()
	{
		return date;
	}
	
	public int getDayOfYear()
	{
		return dayOfYear;
	}
	
	public void setDayOfYear(int dayOfYear)
	{
		this.dayOfYear = dayOfYear;
	}


	public void setDate(int date)
	{
		this.date = date;
	}


	public int getTime()
	{
		return time;
	}


	public void setTime(int time)
	{
		this.time = time;
	}


	public double getAirTemp()
	{
		return airTemp;
	}


	public void setAirTemp(double airTemp)
	{
		this.airTemp = airTemp;
	}


	public double getTempWetBulb()
	{
		return tempWetBulb;
	}


	public void setTempWetBulb(double tempWetBulb)
	{
		this.tempWetBulb = tempWetBulb;
	}


	public int getRelativeHumidity()
	{
		return relativeHumidity;
	}


	public void setRelativeHumidity(int relativeHumidity)
	{
		this.relativeHumidity = relativeHumidity;
	}


	public double getDewPoint()
	{
		return dewPoint;
	}


	public void setDewPoint(double dewPoint)
	{
		this.dewPoint = dewPoint;
	}
	
	/*public double getValue(Fields fieldname)
	{
		switch(fieldname){
		case AirTemp:
			return airTemp;
		case TempWetBulb:
			return tempWetBulb;
		case RelativeHumidity:
			return (double) relativeHumidity;
		case DewPoint:
			return dewPoint;
		default:
			return 0;
		}
	}*/

	
	/**
	 * Compare method
	 * @param Weather w - a Weather object to compare to
	 */
	@Override
	public int compareTo(Weather w)
	{
		
		return Double.compare(getAirTemp(),	 w.getAirTemp());
		
	}

	

	}
	

