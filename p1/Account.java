package p1;

import java.util.*;
import p1.ATM;


public class Account extends ATM   {

	  static int id_account ; 
	  static int id_personne ; 
	  static int code ; 
	  static int solde = 5000000  ; 
	  static Scanner sc= new Scanner(System.in);
	  
		  public static int withdrawl() {
			  System.out.print("Enter money to be withdrawn:");  
              
				//withdraw  
				int withdraw = sc.nextInt();  
				              
				//verification de la possibilité du withdraw  
				if(solde >= withdraw )  
				{  
				    //retrait -  
				    solde = solde - withdraw;  
				    System.out.println("Please collect your money");  
				}  
				else  
				{  
				    //message d'erreur  
				    System.out.println("Insufficient Balance"); 
	  }
				return withdraw;
		  }
				public  static int deposit() {
					System.out.print("Enter money to be deposited:");  
		              
					//depot 
					int depot = sc.nextInt();  
					              
					//ajout du depot   
					solde = solde + depot;  
					System.out.println("Your Money has been successfully depsited");
					return depot;  
				}
				
			   public static int checkBalance() {
				   System.out.println("Balance : " + solde);
				return solde; 
			   }
}
