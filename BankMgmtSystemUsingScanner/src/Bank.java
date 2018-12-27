import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bank {
	private String AccountName;
	private String AccNo;
	private String Balance;

	final String COMMA_DELIMTER=",";
	final String NEW_LINE="\n";
	Scanner KB = new Scanner(System.in);

	// Method to open Account
	void openAccount() {
		System.out.print("Enter Account Number :");
		AccNo = KB.next();
		System.out.print("Enter Account Name :");
		AccountName = KB.next();
		System.out.print("Enter Balance: ");
		Balance = KB.next();
	}

	void WriteToCSV() {
		File file = new File("D:\\STS_WS\\BankDemo.csv");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(fileWriter);
			List<String[]> data = new ArrayList<>();
			System.out.print("How any account you want to input:");
			int noOfInput = KB.nextInt();
			List AccountsDetList = new ArrayList();


			for (int i = 0; i < noOfInput; i++) {
				System.out.print("Enter Account Number :");
				AccNo = KB.next();
				System.out.print("Enter Account Name :");
				AccountName = KB.next();
				System.out.print("Enter Balance: ");
				Balance = KB.next();				
				fileWriter.append(AccNo);
				fileWriter.append(COMMA_DELIMTER);
				fileWriter.append(AccountName);
				fileWriter.append(COMMA_DELIMTER);
				fileWriter.append(Balance);
				fileWriter.append(NEW_LINE);
				 
			}
			System.out.println("CSV file is created...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// to show Account Details
	void ShowDetails() {
		System.out.println(AccNo + "," + AccountName + "," + Balance);
	}

	// Method to Deposit
	void Deposit() {
		long amt;
		System.out.print("Enter the Amount to deposit: ");
		amt = KB.nextLong();
		Balance = Balance + amt;
	}

	// Method to Withdaw Account
	/*void Withdrawl() {
		Long amt;
		System.out.print("Enter Amount to Withdraw :");
		amt = KB.nextLong();
		if (Long.parseLong(Balance) >= amt) {
			Balance = Long.parseLong(Balance) - amt;
		} else {
			System.out.println("Insufficient Balance");

		}
	}*/

	// Method to Search Account
	boolean searchAccount(String accNO) {

		if (AccNo.equals(accNO)) {
			ShowDetails();
			return true;
		} else {
			System.out.println("Account Not Found");
			return false;
		}

	}

}
