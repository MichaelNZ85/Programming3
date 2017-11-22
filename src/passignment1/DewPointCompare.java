/**
 * Comparator class for dew point temperature
 */
package passignment1;

import java.util.*;
import java.io.*;

public class DewPointCompare implements Comparator<Weather>
{
	/**
	 * Compare method - compares the dew point values of two Weather objects
	 * @param Weather one - first Weather object
	 * @param Weather two - second Weather object
	 */
	public int compare(Weather one, Weather two)
	{
		return (int) (one.getDewPoint()*100 - two.getDewPoint()*100);
		
	}
}