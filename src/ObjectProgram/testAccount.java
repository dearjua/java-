package ObjectProgram;

/**
 * ClassName: testAccount <br/>
 * Description: <br/>
 * date: 2022/5/6 14:16<br/>
 *
 * @author li111<br />
 */
public class testAccount {
    public static void main(String[] args) {
        /*Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println("余额为：" + account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("余额为：" + account.getBalance() + "月利率为" + (account.getMonthlyInterest())*100 + "%");
*/
        CheckAccount ac = new CheckAccount(1122,20000,0.045,3000);
        ac.withdraw(21000);
    }
}
