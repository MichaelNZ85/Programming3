package passignment1;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class WeatherStationTest
{

	@Test
	public void testFindAirTempMax()
	{
		ArrayList<Weather> theWeather = new ArrayList<Weather>();
		Weather w1 = new Weather(20160102, 57, 900, 7.3, 6.9, 80, 7.1);
		Weather w2 = new Weather(20160103, 58, 900, 7.5, 6.7, 75, 7.0);
		Weather w3 = new Weather(20160104, 59, 900, 6.1, 6.2, 81, 6.9);
		theWeather.add(w1);
		theWeather.add(w2);
		theWeather.add(w3);
		assertEquals(7.5, WeatherStation.findAirTempMax(theWeather), 0.0001);
	}
	
	@Test
	public void testFindAirTempMin()
	{
		ArrayList<Weather> theWeather = new ArrayList<Weather>();
		Weather w1 = new Weather(20160102, 57, 900, 7.3, 6.9, 80, 7.1);
		Weather w2 = new Weather(20160103, 58, 900, 7.5, 6.7, 75, 7.0);
		Weather w3 = new Weather(20160104, 59, 900, 6.1, 6.2, 81, 6.9);
		theWeather.add(w1);
		theWeather.add(w2);
		theWeather.add(w3);
		assertEquals(6.1, WeatherStation.findAirTempMin(theWeather), 0.0001);
	}

	@Test
	public void testFindRelativeHumidityMin()
	{
		ArrayList<Weather> theWeather = new ArrayList<Weather>();
		Weather w1 = new Weather(20160102, 57, 900, 7.3, 6.9, 80, 7.1);
		Weather w2 = new Weather(20160103, 58, 900, 7.5, 6.7, 75, 7.0);
		Weather w3 = new Weather(20160104, 59, 900, 6.1, 6.2, 81, 6.9);
		theWeather.add(w1);
		theWeather.add(w2);
		theWeather.add(w3);
		assertEquals(75, WeatherStation.findRelativeHumidityMin(theWeather));
	}
}
