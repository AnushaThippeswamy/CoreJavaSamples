import java.util.Scanner;

public class InvokeBank {

	public static void main(String[] args) {

		int accInput;
		/*System.out.print("How any account you want to input: ");
		Scanner KB = new Scanner(System.in);
		accInput = KB.nextInt();
		Bank bank[] = new Bank[accInput]; // creating object Array

		for (int i = 0; i <bank.length; i++) {
			bank[i] = new Bank();
			//bank[i].openAccount();
			bank[i].WriteToCSV();
		}
*/
		Bank b = new Bank();
		b.WriteToCSV();
		int ch;
		/*do {
			System.out.println("Main Menu\n" + "1.Display All\n" + "2.Search By Account\n" + "3.Deposit \n"
					+ "4.Withdrawal\n" + "5.Exit");
			System.out.print("Your Choice : ");
			ch = KB.nextInt();

			switch (ch) {
			case 1:
				for (int i = 0; i < bank.length; i++) {
					bank[i].ShowDetails();
				}
				break;
			case 2:
				System.out.println("Enter Account you want to search : ");
				String accToCheck = KB.next();
				boolean found = false;
				for (int i = 0; i <bank.length; i++) {

					found = bank[i].searchAccount(accToCheck);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Account Not Found");
				}
				break;
			case 3:
				System.out.println("Enter Account No. : ");
				String accToDeposit = KB.next();
				found = false;
				for (int i = 0; i < bank.length; i++) {

					found = bank[i].searchAccount(accToDeposit);
					if (found) {
						bank[i].Deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Account Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Account No. : ");
				String accToWithdrawl = KB.next();
				found = false;
				for (int i = 0; i <bank.length; i++) {

					found = bank[i].searchAccount(accToWithdrawl);
					if (found) {
						bank[i].Withdrawl();
						break;
					}
				}
				if (!found) {
					System.out.println("Account Not Found");
				}
				break;
			case 5:
				System.out.println("Sign off!!");
				break;
			}
		} while (ch != 5);*/

	}

}
