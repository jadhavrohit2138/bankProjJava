import services.BankService;

import java.util.Scanner;

public class CallBankApp {


    public static void main(String[] args) {
        int choice = 0;
        BankService obj = new BankService();
        obj.logIn();
        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("\n******************************");
            System.out.println("Bank application started");
            System.out.println("******************************");
            System.out.println("1. Account Details\n2. Deposit the amount\n3. Withdraw the amount\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.accountDetails();
                    break;
                case 2:
                    obj.deposit();
                    break;
                case 3:
                    obj.withdrawal();
                    break;
            }
        }
        System.out.println("Good Bye !!!");



    }

}

