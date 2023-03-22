package Observer;

import java.util.ArrayList;

/**
 * ClassName: WeatherData <br/>
 * Description: <br/>
 * date: 2023/3/20 20:07<br/>
 *
 * @author li111<br />
 */
public class WeatherData implements Subject{

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if( i>= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() { //将状态通知每一个观察者
        for (int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void meansurementsChange(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        meansurementsChange();
    }
}
