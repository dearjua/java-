package Observer;

/**
 * ClassName: WeatherStation <br/>
 * Description: <br/>
 * date: 2023/3/20 20:33<br/>
 *
 * @author li111<br />
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80.5f,56.2f,155.2f);
    }

}
