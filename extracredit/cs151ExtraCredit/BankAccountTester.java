package cs151ExtraCredit;

public class BankAccountTester {

	public static void main(String[] args) {
		Runnable r1 = new BankAccount();

        Thread t1 = new Thread(r1); 
        Thread t2 = new Thread(r1); 
        
        t1.start();
        t2.start();
	}
}
