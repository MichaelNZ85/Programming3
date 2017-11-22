package passignment1;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 * 
 * @author Michael Inglis
 * GUI class - creates form
 *
 */
public class Gui extends JFrame
{

	private JPanel contentPane;
	private ArrayList<Weather> data;
	private int index = 0;
	private final JLabel lblDate = new JLabel("Date");
	private final JTextField datetf = new JTextField();
	private final JLabel lblTime = new JLabel("Time");
	private final JTextField timetf = new JTextField();
	private final JLabel lblAirTemperature = new JLabel("Air Temperature (\u00B0C)");
	private final JLabel lblWetBulbTemperature = new JLabel("Wet Bulb Temperature (\u00B0C)");
	private final JLabel lblRelativeHumidity = new JLabel("Relative Humidity (%)");
	private final JLabel lblDewPointTemperature = new JLabel("Dew Point Temperature (\u00B0C)");
	private final JTextField airtemptf = new JTextField();
	private final JTextField wetbulbtf = new JTextField();
	private final JTextField relhumtf = new JTextField();
	private final JTextField dewpointtf = new JTextField();
	private final JButton btnNext = new JButton("Next");
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel RecordPanel = new JPanel();
	private final JPanel TablePanel = new JPanel();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private final JButton btnPrevious = new JButton("Previous");
	private DefaultTableModel tm;
	private final JPanel CalculationPanel = new JPanel();
	private final JLabel lblDayOfYear = new JLabel("Day of Year");
	private final JTextField dayofyeartf = new JTextField();
	private final JLabel lblMaximumAirTemperature = new JLabel("Max Air Temperature");
	private final JTextField maxairtemptf = new JTextField();
	private final JButton btnNewButton = new JButton("Get Max Air Temp");
	private final JTextField searchtf = new JTextField();
	private final JLabel lblSearchForDate = new JLabel("Search for Date (YYYYMMDD)");
	private final JButton btnSearch = new JButton("Search");
	private final JButton srtDewPointBtn = new JButton("Sort by Dew Point");
	private final JButton srtRelHumBtn = new JButton("Sort by Relative Humidity");
	private final JButton srtWetBulbBtn = new JButton("Sort by Wet Bulb Temp");
	private final JButton srtAirTempBtn = new JButton("Sort by Air Temp");
	private final JLabel lblMinAirTemperature = new JLabel("Min Air Temperature");
	private final JTextField minairtemptf = new JTextField();
	private final JButton btnGetMinAir = new JButton("Get Min Air Temp");
	private final JLabel lblMinRelativeHumidity = new JLabel("Min Relative Humidity");
	private final JTextField minrelhumtf = new JTextField();
	private final JButton btnGetMinRelative = new JButton("Get Min Relative Humidity");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Gui(ArrayList<Weather> data)
	{
		minrelhumtf.setBounds(133, 123, 86, 20);
		minrelhumtf.setColumns(10);
		minairtemptf.setBounds(412, 8, 86, 20);
		minairtemptf.setColumns(10);
		searchtf.setBounds(464, 122, 86, 20);
		searchtf.setColumns(10);
		maxairtemptf.setBounds(144, 8, 86, 20);
		maxairtemptf.setColumns(10);
		dayofyeartf.setBounds(388, 5, 86, 20);
		dayofyeartf.setColumns(10);
		this.data = data;
		datetf.setText(Integer.toString(data.get(0).getDate()));
		timetf.setText(Integer.toString(data.get(0).getTime()));
		dayofyeartf.setText(Integer.toString(data.get(0).getDayOfYear()));
		airtemptf.setText(Double.toString(data.get(0).getAirTemp()));
		wetbulbtf.setText(Double.toString(data.get(0).getTempWetBulb()));
		relhumtf.setText(Integer.toString(data.get(0).getRelativeHumidity()));
		dewpointtf.setText(Double.toString(data.get(0).getDewPoint()));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(10, 11, 696, 364);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Record", null, RecordPanel, null);
		RecordPanel.setLayout(null);
		lblDate.setBounds(10, 8, 49, 14);
		RecordPanel.add(lblDate);
		datetf.setBounds(58, 5, 86, 20);
		RecordPanel.add(datetf);
		datetf.setColumns(10);
		lblTime.setBounds(149, 8, 54, 14);
		RecordPanel.add(lblTime);
		timetf.setBounds(213, 5, 86, 20);
		RecordPanel.add(timetf);
		timetf.setColumns(10);
		lblAirTemperature.setBounds(10, 94, 161, 14);
		RecordPanel.add(lblAirTemperature);
		lblWetBulbTemperature.setBounds(10, 125, 175, 14);
		RecordPanel.add(lblWetBulbTemperature);
		lblRelativeHumidity.setBounds(6, 156, 159, 14);
		RecordPanel.add(lblRelativeHumidity);
		lblDewPointTemperature.setBounds(10, 187, 193, 14);
		RecordPanel.add(lblDewPointTemperature);
		airtemptf.setBounds(213, 94, 86, 20);
		RecordPanel.add(airtemptf);
		airtemptf.setColumns(10);
		wetbulbtf.setBounds(213, 125, 86, 20);
		RecordPanel.add(wetbulbtf);
		wetbulbtf.setColumns(10);
		relhumtf.setBounds(213, 156, 86, 20);
		RecordPanel.add(relhumtf);
		relhumtf.setColumns(10);
		dewpointtf.setBounds(213, 187, 86, 20);
		RecordPanel.add(dewpointtf);
		dewpointtf.setColumns(10);
		btnNext.setBounds(213, 231, 86, 23);
		RecordPanel.add(btnNext);
		
		/**
		 * Create event handler for previous button
		 */
		
		btnPrevious.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(index >= 0)
				{
					index--;
					datetf.setText(Integer.toString(data.get(index).getDate()));
					timetf.setText(Integer.toString(data.get(index).getTime()));
					airtemptf.setText(Double.toString(data.get(index).getAirTemp()));
					wetbulbtf.setText(Double.toString(data.get(index).getTempWetBulb()));
					relhumtf.setText(Integer.toString(data.get(index).getRelativeHumidity()));
					dewpointtf.setText(Double.toString(data.get(index).getDewPoint()));
				}else
				{
					index = 0;
					datetf.setText(Integer.toString(data.get(index).getDate()));
					timetf.setText(Integer.toString(data.get(index).getTime()));
					airtemptf.setText(Double.toString(data.get(index).getAirTemp()));
					wetbulbtf.setText(Double.toString(data.get(index).getTempWetBulb()));
					relhumtf.setText(Integer.toString(data.get(index).getRelativeHumidity()));
					dewpointtf.setText(Double.toString(data.get(index).getDewPoint()));
				}
			}
		});
		btnPrevious.setBounds(10, 231, 89, 23);
		
		RecordPanel.add(btnPrevious);
		lblDayOfYear.setBounds(309, 8, 94, 14);
		
		RecordPanel.add(lblDayOfYear);
		
		RecordPanel.add(dayofyeartf);
		
		RecordPanel.add(searchtf);
		lblSearchForDate.setBounds(425, 97, 175, 14);
		
		RecordPanel.add(lblSearchForDate);
		
		/**
		 * action listener for search button
		 */
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int dateSearchedFor = Integer.parseInt(searchtf.getText());
				Weather result = WeatherStation.search(data, dateSearchedFor);
				datetf.setText(Integer.toString(result.getDate()));
				dayofyeartf.setText(Integer.toString(result.getDayOfYear()));
				timetf.setText(Integer.toString(result.getTime()));
				airtemptf.setText((Double.toString(result.getAirTemp())));
				wetbulbtf.setText((Double.toString(result.getTempWetBulb())));
				relhumtf.setText(Integer.toString(result.getRelativeHumidity()));
				dewpointtf.setText(Double.toString((result.getDewPoint())));
				
				if(result.getDate() == 0)
				{
					JOptionPane.showMessageDialog(null, "Date not found");
				}
			}
		});
		btnSearch.setBounds(464, 152, 89, 23);
		
		RecordPanel.add(btnSearch);
		
		tabbedPane.addTab("Table", null, TablePanel, null);
		TablePanel.setLayout(null);
		scrollPane.setBounds(10, 11, 671, 264);
		
		TablePanel.add(scrollPane);
		
		
		/**
		 * declare table model
		 */
		tm = new DefaultTableModel(
				new Object[][]{},
				new String[] {"Date", "Day of Year" ,"Time", "Air Temp", "Wet Bulb Temp", "Relative Humidity", "Dew Point Temp"});
		table.setModel(tm);
		//table.setAutoCreateRowSorter(true);
		
		/**
		 * Creates event handlers for sort buttons
		 */
		scrollPane.setViewportView(table);
		srtDewPointBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DewPointCompare dpc = new DewPointCompare();
				Collections.sort(data, dpc);
				drawTable();
			}
		});
		srtDewPointBtn.setBounds(521, 286, 147, 23);
		
		TablePanel.add(srtDewPointBtn);
		srtRelHumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelativeHumidityCompare rhc = new RelativeHumidityCompare();
				Collections.sort(data,rhc);
				drawTable();
			}
		});
		srtRelHumBtn.setBounds(336, 286, 176, 23);
		
		TablePanel.add(srtRelHumBtn);
		srtWetBulbBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WetBulbComparator wbc = new WetBulbComparator();
				Collections.sort(data, wbc);
				drawTable();
			}
		});
		srtWetBulbBtn.setBounds(157, 286, 166, 23);
		
		TablePanel.add(srtWetBulbBtn);
		srtAirTempBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AirTempCompare atc = new AirTempCompare();
				Collections.sort(data, atc);
				drawTable();
				
			}
		});
		srtAirTempBtn.setBounds(10, 286, 128, 23);
		
		TablePanel.add(srtAirTempBtn);
		
		tabbedPane.addTab("Calculations", null, CalculationPanel, null);
		CalculationPanel.setLayout(null);
		lblMaximumAirTemperature.setBounds(10, 11, 150, 14);
		
		CalculationPanel.add(lblMaximumAirTemperature);
		
		CalculationPanel.add(maxairtemptf);
		
		/**
		 * button event handler for max air temp button
		 */
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				maxairtemptf.setText(Double.toString(WeatherStation.findAirTempMax(data)));
			}
		});
		btnNewButton.setBounds(43, 36, 143, 23);
		
		CalculationPanel.add(btnNewButton);
		lblMinAirTemperature.setBounds(286, 11, 116, 14);
		
		CalculationPanel.add(lblMinAirTemperature);
		
		
		/**
		 * button event handler for min air temp button
		 */
		CalculationPanel.add(minairtemptf);
		btnGetMinAir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				minairtemptf.setText(Double.toString(WeatherStation.findAirTempMin(data)));
			}
		});
		btnGetMinAir.setBounds(347, 36, 151, 23);
		
		CalculationPanel.add(btnGetMinAir);
		lblMinRelativeHumidity.setBounds(10, 126, 126, 14);
		
		CalculationPanel.add(lblMinRelativeHumidity);
		
		CalculationPanel.add(minrelhumtf);
		
		/**
		 * button event handler for min relative humidity button
		 */
		btnGetMinRelative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				minrelhumtf.setText(Integer.toString(WeatherStation.findRelativeHumidityMin(data)));
			}
		});
		btnGetMinRelative.setBounds(10, 157, 176, 23);
		
		CalculationPanel.add(btnGetMinRelative);
		drawTable();
		createABarChartTab();
	}
	
	/**
	 * Create bar chart method
	 */
	
	public void createABarChartTab()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for (int i = 0; i < data.size();i++)
		{
			dataset.addValue(data.get(i).getAirTemp(), "temp", Integer.toString(data.get(i).getDayOfYear()));
		}
		
		JFreeChart chart = ChartFactory.createBarChart("Temperature throughout the year", "Day of Year", "Temperature", dataset, PlotOrientation.VERTICAL, true,true,false);
		ChartPanel GraphPanel = new ChartPanel(chart);
		tabbedPane.add("Temperature throughout the year", GraphPanel);
	}
	
	
	/**
	 * Draws the table
	 */
		public void drawTable()
		{
			tm.setRowCount(0);
			for(int i = 0; i < 266; i++)
			{
				Object[] object = new Object[7];
				object[0] = data.get(i).getDate();
				object[1] = data.get(i).getDayOfYear();
				object[2] = data.get(i).getTime();
				object[3] = data.get(i).getAirTemp();
				object[4] = data.get(i).getTempWetBulb();
				object[5] = data.get(i).getRelativeHumidity();
				object[6] = data.get(i).getDewPoint();
				tm.addRow(object);
			}
		

		/**
		 * Event handler for next button	
		 */
		
		btnNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				index++;
				datetf.setText(Integer.toString(data.get(index).getDate()));
				dayofyeartf.setText(Integer.toString(data.get(index).getDayOfYear()));
				timetf.setText(Integer.toString(data.get(index).getTime()));
				airtemptf.setText(Double.toString(data.get(index).getAirTemp()));
				wetbulbtf.setText(Double.toString(data.get(index).getTempWetBulb()));
				relhumtf.setText(Integer.toString(data.get(index).getRelativeHumidity()));
				dewpointtf.setText(Double.toString(data.get(index).getDewPoint()));
				
				
			}
		});
	}
}
