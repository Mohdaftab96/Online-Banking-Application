
import java.util.Scanner;
class Account{

      int balance;
      int previouseTransaction;
      String customerName;
      String customerId;


      // Creating Contructor
      Account(String cname, String cid){
            this.customerName = cname;
            this.customerId = cid;
      }



      // Creating Main Method For Deposit
      void deposit(int amount){
            if(amount != 0){
                  balance = balance + amount;  // balance = 2000
                  previouseTransaction = amount; // previouseTransaction = 2000    
            }
      }

      // Creating Main Method For withdraw
      void withdraw(int amount){
            if(amount != 0){
                  balance = balance - amount;  // 
                  previouseTransaction = amount;
            }
      }


      void getPreviouseTransaction(){
            if(previouseTransaction > 0){
                  System.out.println("Deposit: " + previouseTransaction);
            }else if(previouseTransaction < 0){ // -50 = 50, -300 = 300
                  System.out.println("Deposit: " + Math.abs(previouseTransaction));
            }else{
                  System.out.println("No Transaction Occured");
            }
      }

            void showMenu(){

                  char option = '\0';
                  Scanner sc = new Scanner(System.in);

                  System.out.println("CustonmerName : " + customerName);
                  System.out.println("CustonmerId : " + customerId);
                  System.out.println();
                  System.out.println("A. Balance");
                  System.out.println("B. Deposit");
                  System.out.println("C. withdraw");
                  System.out.println("D. getPreviousTransaction");
                  System.out.println("E. Exit");

            do{

                  System.out.println("==========================");
                  System.out.println("Enter the Options : ");
                  option = sc.next().charAt(0);
                  Character.toUpperCase(option); // changing UpperCase to LowerCase
                  // Problem here a,b,c,d,e



                  switch(option){



                        case 'A':
                                    System.out.println("===================");
                                    System.out.println("Balance: " + balance);
                                    System.out.println("===================");
                                    System.out.println();
                                    break;

                        case 'B':
                                    System.out.println("===================");
                                    System.out.println("Enter the Deposit Amount: ");
                                    System.out.println("===================");
                                    int amount = sc.nextInt();
                                    deposit(amount);
                                    System.out.println();
                                    break;
                        
                        case 'C':
                                    System.out.println("===================");
                                    System.out.println("Enter the Withdraw Amount : ");
                                    System.out.println("===================");
                                    int amount2 = sc.nextInt();
                                    withdraw(amount2);
                                    System.out.println();
                                    break;

                        case 'D':
                                    System.out.println("===================");
                                    getPreviouseTransaction();
                                    System.out.println("===================");
                                    System.out.println();
                                    break;
                        
                        case 'E':  
                                    System.out.println("===================");
                                    break;
                        
                        default :
                                    System.out.println("Invalide Input, Please Try Again");
                                    break;

                  }

            }while(option != 'E');
      }
}



public class BankAccount{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Account account = new Account("XYZ", "01");
            account.showMenu();
      }     
}


