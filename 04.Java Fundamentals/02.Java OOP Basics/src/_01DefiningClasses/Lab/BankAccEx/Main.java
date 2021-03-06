package _01DefiningClasses.Lab.BankAccEx;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		
		String command =scanner.nextLine();
		while (!command.equals("End")) {
			String[] commandArg = command.split("\\s+");
			String commandType = commandArg[0];
			switch (commandType) {
			case "Create":
				executeCreateCommand(accounts, commandArg[1]);
				break;
			case "Deposit":
				executeDepositCommand(accounts, commandArg);
				break;
			case "Withdraw":
				executeWithdrawCommand(accounts, commandArg);
				break;
			case "Print":
				executePrintCommand(accounts, commandArg);
				break;
			default:
				break;
			}			
			command = scanner.nextLine();
		}
	}
	
	private static void executeCreateCommand(HashMap<Integer, BankAccount> accounts, String commandArg) {
		int id = Integer.valueOf(commandArg);
		if (accounts.containsKey(id)) {
			System.out.println("Account already exists");
		} else {
			BankAccount account = new BankAccount();
			account.setId(id);
			accounts.put(id, account);
		}
	}
	
	private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandArg) {
		Integer id = Integer.valueOf(commandArg[1]);
		Double amount = Double.valueOf(commandArg[2]);
		
		if (!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
			return;
		}

		accounts.get(id).deposit(amount);
		
	}
	private static void executeWithdrawCommand(HashMap<Integer, BankAccount> accounts, String[] commandArg) {
		Integer id = Integer.valueOf(commandArg[1]);
		Double amount = Double.valueOf(commandArg[2]);
		
		if (!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
			return;
		}		
		
		try {
			accounts.get(id).withdraw(amount);
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private static void executePrintCommand(HashMap<Integer, BankAccount> accounts, String[] commandArg) {
		Integer id = Integer.valueOf(commandArg[1]);
		
		if (!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
			return;
		}
		
		BankAccount account = accounts.get(id);
		System.out.printf("Account %s, balance %.2f%n",account, account.getBalance());
	}
}
