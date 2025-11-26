package be_study.quiz.quiz30;

public class Account {

	private String owner;
	private long balance;
	
	Account(String owner, long balance) {
		this.balance = balance;
		this.owner = owner;
	}
	
	Account() {}
	
	Account(String owner) {
		this(owner,0);
	}
	
	Account(long balance) {
		this(null,balance);
	}
	
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	public long withdraw(long amount) {
		if(amount >= this.balance)
			balance = 0;
		else
			balance -= amount;
		return balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
}
