package passignment1;

import java.util.*;

/**
 * @author Michael Inglis
 *
 */
public class AssignmentApp
{

	/**
	 * Starts the program
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Weather> myWeather = new ArrayList<Weather>();
		WeatherStation.load(myWeather);
		Gui myGui = new Gui(myWeather);
		myGui.setVisible(true);

	}

}
