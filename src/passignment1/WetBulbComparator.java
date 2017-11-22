/**
 * Comparator class for wet bulb temperature
 */
package passignment1;

import java.util.*;
import java.io.*;

public class WetBulbComparator implements Comparator<Weather>
{
	/**
	 * Compare method - compares the wet bulb values of two Weather objects
	 * @param Weather one - first Weather object
	 * @param Weather two - second Weather object
	 */
	public int compare(Weather one, Weather two)
	{
		return (int) (one.getTempWetBulb()*100 - two.getTempWetBulb()*100);
		
	}
}