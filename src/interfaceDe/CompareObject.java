package interfaceDe;

/**
 * ClassName: CompareObject <br/>
 * Description: <br/>
 * date: 2022/5/10 12:57<br/>
 *
 * @author li111<br />
 */
interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}


