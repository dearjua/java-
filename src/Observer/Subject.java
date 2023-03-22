package Observer;

/**
 * ClassName: Subject <br/>
 * Description: <br/>
 * date: 2023/3/20 19:38<br/>
 *
 * @author li111<br />
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();//当主题改变状态时通知观察者
}
