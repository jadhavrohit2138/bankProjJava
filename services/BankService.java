package services;

import beanPackage.BeanClass;

import java.util.ArrayList;
import java.util.Scanner;

public class BankService {
    Boolean flag = false;
    Boolean flagRegister = true;
    Scanner userInput = new Scanner(System.in);
    ArrayList<BeanClass> arrData = new ArrayList<>();
    int key;
    int indexKey;
//    int timer = 0;


    //        List<Object> data;
        BeanClass beanObj = new BeanClass();
        Boolean regFlag = true;
        public void register() {

            while (regFlag){
                System.out.print("Enter New User Name: ");
                String tempName = userInput.next();
                System.out.print("Enter The Id No: ");
                int tempId = userInput.nextInt();
                System.out.print("Enter the password: ");
                String passTemp = userInput.next();
                System.out.print("Enter the balance: ");
                int balTemp = userInput.nextInt();
                System.out.print("\nRegister Successfully");
                arrData.add(new BeanClass(tempId,tempName,balTemp,passTemp));
                System.out.println("Do you want to add another user\npress 1 for 'Yes'\npress 2 for 'No'");
                int decisionInput = userInput.nextInt();
                switch (decisionInput){
                    case 1:
                        register();
                        break;
                    case 2:
                        regFlag = false;
                        break;
                    default:
                        System.out.println("--------------------\nInvalid Input\npress 1 for 'Yes'\npress 2 for 'No'\n--------------------");
                }
            }
        }

    public void logIn () {
            if (flagRegister) {
                System.out.println("\n*****************\nRegister Page\n");
                register();
                System.out.println("\n*****************\nLog In Page\n");

            }
            while (!flag) {
                System.out.println("Enter Account Number: ");
                int logInId = userInput.nextInt();
                for (int i = 0; i < arrData.size();i++){
                    if (arrData.get(i).getId() == logInId) {
                        System.out.println("Enter the password: ");
                        String pass = userInput.next();
                        if (arrData.get(i).getPass().equals(pass)) {
                            key = logInId;
                            indexKey = i;
                            System.out.println("Log is successfully");
                            flag = true;
                        }
                    }
                    else {
                        System.out.println("Invalid ID or Password\n\n------------------------------------------------\nplease type you valid id and pass again");
//                        timer++;
                        logIn();
                        break;
                    }
                }
            }
        }
        public void accountDetails () {
                    System.out.println("Name is: " + arrData.get(indexKey).getName());
                    System.out.println("ID : " + arrData.get(indexKey).getId());
                    System.out.println("Balance : " + arrData.get(indexKey).getBal());
        }

        public void deposit () {
            int amt;
            System.out.println("Enter the amount you want to deposit: ");
            amt = userInput.nextInt();
            arrData.get(indexKey).setBal(arrData.get(indexKey).getBal()+amt);
        }

        public void withdrawal () {
            int amt;
            System.out.println("Enter the amount you want to withdraw: ");
            amt = userInput.nextInt();
            if (arrData.get(indexKey).getBal() >= amt) {
                arrData.get(indexKey).setBal(arrData.get(indexKey).getBal() - amt);
                System.out.println("Balance after withdrawal: " + arrData.get(indexKey).getBal());
            } else {
                System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
            }
        }
    }
