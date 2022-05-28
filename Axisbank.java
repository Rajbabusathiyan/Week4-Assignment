package week4;

public class Axisbank extends Bankinfo {
	public void deposit() {
		System.out.println("Deposit Amount");
	}
	public static void main(String[] args) {
		Axisbank bank=new Axisbank();
		bank.savings();
		bank.fixed();
		bank.deposit();
	}

}
