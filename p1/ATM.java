package p1;

import java.util.*;
import p1.Personne;

public class ATM {

	public static void main(String [] args) {
		int code ; 
		int id ;
		int balance = 50000000, withdraw, deposit;
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
			System.out.print("Enter money to be withdrawn:");  
			              
			//withdraw  
			withdraw = sc.nextInt();  
			              
			//verification de la possibilité du withdraw  
			if(balance >= withdraw)  
			{  
			    //retrait -  
			    balance = balance - withdraw;  
			    System.out.println("Please collect your money");  
			}  
			else  
			{  
			    //message d'erreur  
			    System.out.println("Insufficient Balance");
			    
			}break; 
			  

			        case 2:  
			              
			System.out.print("Enter money to be deposited:");  
			              
			//depot 
			deposit = sc.nextInt();  
			              
			//ajout du depot   
			balance = balance + deposit;  
			System.out.println("Your Money has been successfully depsited");    
			break;  

			        case 3:  
			//affichage du solde  
			System.out.println("Balance : " + balance);    
			  

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
	     }else {
	    	 System.out.println("Invalid User,Exit the program...");
	    	 
	     }
	 
				
		}
      
	}

