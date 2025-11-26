package be_study.quiz.quiz30;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account acc1 = new Account();
		Account acc2 = new Account(10000);
		Account acc3 = new Account("김응석");
		Account acc4 = new Account("김응석", 100000);
		
		
//		acc1.deposit(100000000);
//		acc1.withdraw(1000000);
//		acc1.withdraw(156723456);
//		acc1.deposit(13412037);
//		acc1.deposit(127948612);
//		
//		System.out.println(acc1.getBalance());
//		System.out.println(acc1.getOwner());
//		
//		acc1.setOwner("김응석");
//		System.out.println(acc1.getOwner());
		
		acc1.deposit(1000);
		System.out.println(acc1.getBalance());
		acc1.withdraw(10000);
		System.out.println(acc1.getBalance());
		
	}

}
