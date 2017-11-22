/**
 * WeatherStation class (utilities class) - contains basic methods for manipulating weather data
 */
package passignment1;

import java.util.*;
import java.io.*;

/**
 * @author Michael Inglis
 *
 */
public class WeatherStation
{
	/**
	 * Load method - reads weather data from CSV file and puts it into an ArrayList
	 * @param myWeather - an arrayList of Weather
	 */
	public static void load(ArrayList<Weather> myWeather)
	{
				
		BufferedReader reader;
		String line;
				
		int date;
		int dayOfYear;
		int time;
		double airTemp;
		double tempWetBulb;
		int relativeHumidity;
		double dewPoint;
		
		int index = 0;
		
		try
		{
			reader = new BufferedReader(new FileReader("weatherdata3.csv"));
			
			while(((line = reader.readLine())!= null))
			{
				String[] fields = line.split(",");
				date = Integer.parseInt(fields[1]);
				dayOfYear = Integer.parseInt(fields[2]);
				time = Integer.parseInt(fields[3]);
				airTemp = Double.parseDouble(fields[4]);
				tempWetBulb = Double.parseDouble(fields[5]);
				relativeHumidity = Integer.parseInt(fields[6]);
				dewPoint = Double.parseDouble(fields[7]);
				
				myWeather.add(new Weather(date, dayOfYear, time, airTemp, tempWetBulb, relativeHumidity, dewPoint));
				
			}
		}
		catch(IOException e)
		{
			System.out.println("there was a file problem");
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Finds the max air temperature
	 * @param data - an ArrayList of Weather objecs
	 * @return max - the maximum air temperature value
	 */
	public static double findAirTempMax(ArrayList<Weather> data)
	{
		double max = data.get(0).getAirTemp();
		for(int i = 0; i < data.size(); i++)
		{
			if((data.get(i).getAirTemp())  > max)
			{
				max = data.get(i).getAirTemp();
			}
		}
		
		return max;
	}
	
	/**
	 * Finds the min air temperature
	 * @param data - an ArrayList of Weather objecs
	 * @return min - the minimum air temperature value
	 */
	public static double findAirTempMin(ArrayList<Weather> data)
	{
		double min = data.get(0).getAirTemp();
		for(int i = 0; i < data.size(); i++)
		{
			if((data.get(i).getAirTemp())  < min)
			{
				min = data.get(i).getAirTemp();
			}
		}
		
		return min;
	}
	
	/**
	 * Finds the max relative humidity
	 * @param data - an ArrayList of Weather objecs
	 * @return max - the maximum relative humidity value
	 */
	public static int findRelativeHumidityMin(ArrayList<Weather> data)
	{
		int min = data.get(0).getRelativeHumidity();
		for(int i = 0; i < data.size(); i++)
		{
			if((data.get(i).getRelativeHumidity()) < min)
			{
				min = data.get(i).getRelativeHumidity();
			}
		}
		
		return min;
	}
	
	/**
	 * Searches the ArrayList of Weather for a particular date's values
	 * @param data - an ArrayList of Weather objecs
	 * @param searchDate - the date to search for
	 * @return data.get(i) - the corresponding Weather object
	 */
	
	public static Weather search(ArrayList<Weather> data, int searchDate)
	{
		boolean found = false;
		Weather weather = null;
		Weather noResult =  new Weather(0,0,0, 0.0, 0.0, 0, 0.0);
		for(int i = 0; i < data.size(); i++)
		{
			if(data.get(i).getDate() == searchDate)
			{
				weather = data.get(i);
				found = true;
				
			}
			/*else
			{
				return noResult;
			}*/
			
		}
		if (found == false){
			return noResult;
		} else {
			
		
		return weather;
		}
		
	}
}
