package Savings;

import java.util.*;
import DataBank.*;

public class savings_account extends accounts{
	public float rate;
	public double amount;
	public double deposit;
	public double withdraw;
	Scanner a=new Scanner(System.in);
	public void deposit(){
		super.display();
		System.out.print("Enter amount to deposit: ");
		deposit=a.nextDouble();
		bal=bal+deposit;
	}
	public void withdrawal(){
		super.display();
		System.out.print("Enter amount to withdraw: ");
		withdraw=a.nextDouble();
		bal=bal-withdraw;
	}
	public void calculateAmount(){
		System.out.print("Enter rate of interest: ");
		rate=a.nextFloat();
		amount=(bal*rate)/100.0;
		System.out.println("\nInterest for 1 year: "+amount);
		bal=bal+amount;
	}
	public void display(){
		System.out.println("\nName: "+name+"\nAcc_no: "+acc_no+"\nAddress: "+address+"\nBalance: "+bal+"\n\n");
	}
}