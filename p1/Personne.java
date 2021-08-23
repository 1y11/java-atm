package p1;

import java.util.HashMap;


class Personne {
	

      int id ; 
      int code ;
      
      
  	public Personne(int id, int code){
  		this.id = id;
  		this.code = code;
  	}
	

         
      public  boolean signin() { 
    	  System.out.println();
    	  
    	  if(id == 1 && code == 5873) {
    		  return true;
    	  }else {
    		  return false;
    	  }
    	 
 	}
	


      
}
