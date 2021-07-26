
package calculators;
// @author aarvy
import java.util.*;
public class BasicCalc {
	public BasicCalc() {
	 
		
	}
	public static void main(String[] args) {
	
         
        ArrayList <Integer> aarvy = new ArrayList<Integer>();
        aarvy.add(101);
        aarvy.add(102);
        aarvy.add(103);
        aarvy.add(104);
        aarvy.add(105);
        
        aarvy.add(3,45);
       
        System.out.println("intial:: "+aarvy);
        // replacing value
        System.out.println("setting value"+aarvy.set(3, 1004));
        //remove value
        System.out.println("removing::"+aarvy.remove(4));
        // size
        System.out.println("size::"+aarvy.size());
        System.out.println(aarvy.clone());
        try {
        	int num1=234;
        	int num2=0;
        	 int result;
        	 result=num1/num2;
        	 
        }
        catch(Exception mi)
        {
        	mi.printStackTrace();
        }
       
         
             
        for (int i=0; i<(aarvy.size());i++) {
        	if( i==3) {
            	System.out.println("Statement is corrrect:: "+aarvy.get(i));
            }else
        	System.out.println(aarvy.get(i));
        	
        	
        }
        aarvy.clear();
        System.out.println("finally value is cleared"+aarvy);
  
      
	}


}
