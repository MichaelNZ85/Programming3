/**
 * Comparator class for Air temperature
 */
package passignment1;

import java.util.*;
import java.io.*;

public class AirTempCompare implements Comparator<Weather>
{
	/**
	 * Compare method - compares the air temp values of two Weather objects
	 * @param Weather one - first Weather object
	 * @param Weather two - second Weather object
	 */
	
	public int compare(Weather one, Weather two)
	{
		return (int) (one.getAirTemp()*100 - two.getAirTemp()*100);
		
	}
}
