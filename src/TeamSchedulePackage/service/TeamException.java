package TeamSchedulePackage.service;

/**
 * ClassName: TeamException <br/>
 * Description: <br/>
 * date: 2022/5/12 19:26<br/>
 *
 * @author li111<br />
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -3423423313454L;

    public TeamException(){}

    public TeamException(String msg){
         super(msg);
    }
}
