/**name:janice
id:U10216045
exercise:15.1
design a class to let player input number and get the different result of then function and display it
*/
import java.util.Scanner;

public class function {

	public static void main(String[] args){
		/*main method*/ 

	   Scanner input = new Scanner(System.in);
	   
	   //Prompt the use to enter a string
	   System.out.print("Enter x");
	   int x = input.nextInt();
	   //Show out the result
	   System.out.printf( " f(x) = sin(x) = "+getx2(x) +"\n f(x) = sin(x) = "+getsin(x)+"\n f(x) = cos(x) ="+ getcos(x)+"\n f(x) = tan(x) ="
	   + gettan(x)+"\n f(x) = cos(x)+5sin(x) =" + getcosadd5sin(x)+"\n f(x) = 5cos(x)+sin(x) ="+ get5cosaddsin(x)+"\n f(x) = log(x)+x*x ="+ getlogx2(x));
	  
	}	
	  
//Create method to run the function
	public static  float getx2(int x) 
   	{
		//return result		
   		return x*x;
	}
   	
   	public static double getsin(int x) 
   	{
		//return result	  		
   		return Math.sin(x);
   	
   	}
   	public static double getcos(int x) 
   	{
		//return result	   		
   		return Math.cos(x);
   	
	}   	
   	
   	public static double gettan(int x) 
   	{
		//return result	 		
   		return Math.tan(x);
   		
	}
   	
   	public static double getcosadd5sin(int x) 
   	{
		//return result	   		
   		return (Math.cos(x)+5*Math.sin(x));
   		
	}	
   	
   	public static double get5cosaddsin(int x) 
   	{
		//return result	   		
   		return (5*Math.cos(x)+Math.sin(x));
   		
	} 
   	
   	public static double getlogx2(int x) 
   	{
		//return result	   		
   		return (Math.log(x)+Math.pow(x,2));
   		
	}  	   
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

