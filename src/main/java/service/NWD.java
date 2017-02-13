package service;

public class NWD {
	
	public Integer nwd(int a, int b) {
		
		if(a == 0 || b == 0) return 0;
		if(a < 0) a = -a;
		if(b < 0) b = -b;
		
	    Integer c;   
	    
	    while(b != 0){
	    	
	        c = a % b;             
	        a = b;                
	        b = c;    
	        
	    }
	    
	    return a;                

	}

}
