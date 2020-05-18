package cs151ExtraCredit;

public class BankAccount implements Runnable {

	private int money;
	
	public BankAccount() {
		money = 0;
	}
	
	
	public void deposit(int m) {
		money += m;
	}
	
	public void withdraw(int m) {
		if (money - m < 0) {
			money = 0;
		}
		else {
			money -= m;
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			deposit(300);
			System.out.println("deposited 300");
			System.out.println(money);
			withdraw(400);
			System.out.println("widthrew 400");
			System.out.println(money);
		}
	}
	
	public static void main(String[] args) {
		Runnable r1 = new BankAccount();

        Thread t1 = new Thread(r1); 
        Thread t2 = new Thread(r1); 
        
        t1.start();
        t2.start();
	}
}
