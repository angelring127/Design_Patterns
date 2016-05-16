package weatherMain;

import display.CurrentConditions;
import display.ForecastDisplay;
import display.HeatIndexDisplay;
import display.StatisticsDisplay;
import weatherMain.WeatherData;

public class WeatherCheck {
	public static void main(String argv[]){
		WeatherData weatherData = new WeatherData();	//weatherData °´Ã¼ »ý¼º
		
		
		CurrentConditions currentConditions =			
				new CurrentConditions(weatherData);
		StatisticsDisplay  statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}
}
