package p1;

import java.util.*;
import p1.Personne;
import p1.Account;

public class ATM  {

	public static void main(String [] args) {
		int code ; 
		int id ;
		 int balance;
		 int withdraw;
		 int deposit;
		Scanner sc= new Scanner(System.in);
		
		 
		System.out.println("Enter your id: ");
		id = sc.nextInt();
		System.out.println("Enter your code: ");
		code = sc.nextInt();
		
		Personne aya  = new Personne(id, code);
		
		if (aya.signin()){
			do {
				

				System.out.println("Welcome to your ATM Machine!");  
			    System.out.println("Option 1 for Withdraw");  
			    System.out.println("Option 2 for Deposit");  
			    System.out.println("Option 3 for Check Balance");  
			    System.out.println("Option 4 for EXIT\n");  
			    System.out.print("Choose the option:");
			    
			    int choice = sc.nextInt();  
			    switch(choice)  
			    {  
			        case 1:  
			         withdraw = Account.withdrawl();
			         break; 
			  

			        case 2:  
			              
			        deposit = Account.deposit();
			        break;  

			        case 3:  
			//affichage du solde  
			         balance = Account.checkBalance();  
			   
			        case 4:  
			//exit  
			       System.out.println("Thanks for using our ATM Machine ");	 
			       System.exit(0);  
			    }
			    
			    try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(true);
	     }else 
	    	 System.out.println("Invalid User,Exit the program...");
	    
	     }
	 
      
	}

