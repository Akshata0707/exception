package customExceptions;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=10000;
		System.out.println("Enter amount to withdraw : ");
		double amount=sc.nextDouble();
		sc.close();
		
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("withdraw sucessfully..available balance is "+balance);
		}else {
			try {
				throw new InsufficientBalanceException("no sufficient funds");
			}catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
