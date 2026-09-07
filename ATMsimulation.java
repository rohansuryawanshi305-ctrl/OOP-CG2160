// oop practical no 6 ATM simulator with basic functionalities - check balance, withdraw, Deposit, Exit etc.
import java.util.Scanner;

public class ATMsimulation {

	public static void main(String[]args) {

		Scanner sc=new Scanner(System.in);

		char Choice;

		System.out.println("____________________________WELCOME____________________________");
		System.out.println("");
		System.out.println("Enter your balance:");

		double balance= sc.nextDouble();

		do {

			

			

			System.out.println("______MENU______");

			System.out.println("1. CHECK BALANCE");

			System.out.println("2. DEPOSIT");

			System.out.println("3. WITHDRAW");

			System.out.println("4. EXIT  ");

			System.out.println("Enter your choice code:");

			int op=sc.nextInt();

			switch(op){

			case 1:

				System.out.println("Your current balance is:"+balance);

				break;

			case 2:

				System.out.println("Enter Amount to deposit:");

				double deposit=sc.nextDouble();

				balance=balance+deposit;

				break;

			case 3:

				System.out.println("Enter Amount to withdraw:");

				double withdraw= sc.nextDouble();

				if(withdraw>balance){

					System.out.println("---Insufficient balance---");

				

					

				}

				else {

					

					balance=balance-withdraw;

					

				}

				break;

			case 4:

				System.out.println("-----Thank you for using our Application-----");

				break;

			default:

				System.out.println("Enter a valid choice code");

				break;

				

			}
			System.out.println("");
			System.out.println(" Want to perform another operation? (y/n):");
			Choice = sc.next().charAt(0);

		}while(Choice=='y'||Choice=='Y');

		sc.close();

		if(Choice=='n'||Choice=='N') {

			System.out.println("Thankyou for using this Application!!");

		}

	}



}


