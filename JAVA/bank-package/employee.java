import java.util.*;
import Savings.*;

public class employee{
	public static void main(String args[]){
		int ch;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter number of accounts: ");
		int n=x.nextInt();
		savings_account obj[]=new savings_account[n];
		int i=0;
		while(i<n){
			obj[i]=new savings_account();
			do{
				System.out.print("\n1)Deposit\n2)Withdrawal\n3)Exit\nEnter your choice: ");
				ch=x.nextInt();
				switch(ch){
					case 1: obj[i].deposit();
							break;
					case 2: obj[i].withdrawal();
							break;
					case 3: break;
				}
			}while(ch!=3);
			obj[i].calculateAmount();
			obj[i].display();
			i++;
		}
	}
}