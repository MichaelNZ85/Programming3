/**
 * Comparator class for relative humidity
 */
package passignment1;

import java.util.*;
import java.io.*;

public class RelativeHumidityCompare implements Comparator<Weather>
{
	
	/**
	 * Compare method - compares the relative humidity values of two Weather objects
	 * @param Weather one - first Weather object
	 * @param Weather two - second Weather object
	 */
	public int compare(Weather one, Weather two)
	{
		return one.getRelativeHumidity()-two.getRelativeHumidity();
		
	}
}