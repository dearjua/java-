package ThreadTest;

/**
 * ClassName: AccountTest <br/>
 * Description: <br/>
 * date: 2022/5/14 13:15<br/>
 *
 * @author li111<br />
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer1 = new Customer(account);

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer1);

        t1.setName("用户一");
        t2.setName("用户二");

        t1.start();
        t2.start();

    }
}
class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public synchronized void deposit(double acc){
        if (acc >= 0){
            balance += acc;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "账号余额为" + balance);
        }
    }
}

class  Customer implements Runnable{

    private Account account;

    public Customer(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            account.deposit(1000);
        }
    }
}