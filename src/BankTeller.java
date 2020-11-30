/**
 * This is an application which models a bank teller system which allows the user to create accounts and allows for withdrawal(1), deposits(2), exit(3) 
 * and showing the balance(4).
 * 
 * 
* @author Yuhang Zhao, student number 150467199
*/

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BankTeller {
	
	/**
	 *  Main execution thread of the program
	 *  
	 *	This class simulates a banking application which processes financial transactions. 
	 * 
	 * "The goal is to allow a bank teller to process account transactions.  Each account has an account owner, a unique account number and a balance. 
	 * A transaction is either a deposit (adding money to an account) or withdrawal (taking money out of an account). Upon startup, the 
	 * teller shall have the ability to create a set number of accounts. After this, teller will be given the choice of processing a withdrawal 
	 * transaction, a deposit transaction, exiting the application or showing the balance. This is continuously offered until the user decides to exit. 
	 * Some other conditions required by the question2 is also applied to this application.
	 *  
	 * @param args , not used in this application
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create accounts
		System.out.println("How many accounts do you want to create?");
		int number = input.nextInt();
		Account accountArray[] = new Account[number];
		
		int currentAccNum = 5000;
		
		// iteration structure is used to initialize all accounts
		for (int x = 0; x < accountArray.length; x++) { 
			Scanner input1 = new Scanner(System.in);
			System.out.println("Type the account name: ");
			String names = input1.nextLine();
			
			//account opening date
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
			
			//initialize every account in the accountArray
			accountArray[x] = new Account(names, currentAccNum + x, formatter.format(date), "0"); 
		}
		
		
		// show some available transaction options 
		System.out.println("Some available actions can be done:");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");
		System.out.println("4. Show the balance\n");
		System.out.println("What do you want to do?");
		int choice = input.nextInt();
		
		
		do {
			switch (choice) {
			case 1:
				// deposit
				// get account number from user
				System.out.println("Which account to you want to deposit to?");
				int acctNumDep = input.nextInt();
				int counter1 = 0;
				//find that object in the array corresponding to that account that the user wanted
				for(int i = 0; i < accountArray.length; i++) {
					if(accountArray[i].getacctNumbers() == acctNumDep) {
						System.out.println("How much do you want to deposit?");
						double moneyDep = input.nextDouble();
						accountArray[i].setacctBalance(accountArray[i].deposit(moneyDep));
						
						//record the transaction operation time 
						SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
						Date date1 = new Date(System.currentTimeMillis());
						accountArray[i].setacctLastT(formatter1.format(date1));
						//display the time
						accountArray[i].displayOpenDate();
						accountArray[i].dispalyLastT();
						
						counter1 = counter1 + 1;
					}
				}
				
				if (counter1 == 0) {
					System.out.println("The account you entered doesn't exist.");
				}
				break;

				
			case 2:
				// withdrawal
				System.out.println("Which account to you want to withdrawl to?");
				int acctNumWd = input.nextInt();
				int code = 0000;
				int counter2 = 0;
				//find that object in the array corresponding to that account that the user wanted
				for(int i = 0; i < accountArray.length; i++) {
					if(accountArray[i].getacctNumbers() == acctNumWd) {
						System.out.println("How much do you want to withdrawl?");
						double moneyWd = input.nextDouble();
						if(accountArray[i].getacctBalance() < moneyWd) {
							System.out.println("This transaction is rejected, beacuse the withdrawl money has already exceeded your balance.");
							counter2 = counter2 + 1;
							break;
						}else {
							if(moneyWd > 500) {
								System.out.println("The withdrawl money has already exceeded $500. Please enter your authorization code: ");
								int authCode = input.nextInt();
								if(authCode == code) {
									accountArray[i].setacctBalance(accountArray[i].withdrawl(moneyWd));
									//record the transaction operation time 
									SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
									Date date2 = new Date(System.currentTimeMillis());
									accountArray[i].setacctLastT(formatter2.format(date2));
									//display the time
									accountArray[i].displayOpenDate();
									accountArray[i].dispalyLastT();
									
									counter2 = counter2 + 1;
								}else {
									System.out.println("You entered a wrong code. You can't withdrawl these money.");
									counter2 = counter2 + 1;
									break;
								}
							}else {
								accountArray[i].setacctBalance(accountArray[i].withdrawl(moneyWd));
								counter2 = counter2 + 1;
							}
						}
					}
				}
				
				if (counter2 == 0) {
					System.out.println("The account you entered doesn't exist.");
				}
				break;
				
			case 3:
				// exit
				break;
				
			case 4:
				// show the balance
				int counter3 = 0;
				System.out.println("Which accout do you want to check the balance?");
				int acctNumCheck = input.nextInt();
				for(int j = 0; j < accountArray.length; j++ ) {
					if(accountArray[j].getacctNumbers() == acctNumCheck) {
						accountArray[j].displayBalance();
						counter3 +=1;
					}
				}
				if(counter3 == 0) {
					System.out.println("The account you entered doesn't exist.");
				}

			}
			
			//prompt whether the user wants to do other transactions
			Scanner input2 = new Scanner(System.in);
			System.out.println("\nWhat other transactions do you want to do?");
			choice = input2.nextInt();
			
		} while(choice != 3);
		
	}

}
