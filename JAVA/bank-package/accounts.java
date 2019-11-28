package DataBank;

import java.util.*;

abstract public class accounts{
	public String name;
	public String address;
	public int acc_no;
	public double bal;
	abstract public void withdrawal();
	abstract public void deposit();
	Scanner s=new Scanner(System.in);
	public accounts(){
		System.out.print("Enter name: ");
		name=s.next();
		System.out.print("Enter address: ");
		address=s.next();
		System.out.print("Enter acc_no: ");
		acc_no=s.nextInt();
		System.out.print("Enter bal: ");
		bal=s.nextDouble();
	}
	public void display(){
		System.out.println("\nPresent Balance: "+bal);
	}
}