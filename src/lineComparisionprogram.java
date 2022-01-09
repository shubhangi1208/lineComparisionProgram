import java.lang.Math.*;

public class lineComparisionprogram {

	private void calculationofline()
	{
       System.out.println("Welcome to Line Comparision Computation Program");
       int x1,x2,x3,x4,y1,y2,y3,y4;
       double Distance1,Distance2;
       x1=1;
       x2=3;
       y1=2;
       y2=4;
     Distance1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
     System.out.println("Distance of first line is "+ Distance1 );
     
     x3=2;
     x4=3;
     y3=2;
     y4=6;
   Distance2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
   System.out.println("Distance of Second line is "+ Distance2 );
   if (Distance1 == Distance2)
	 {
		  System.out.println("Two lines are equal");
	 }
   
		  else 
		  		{
			 System.out.println("Two lines are not equal");
		  		}
   
   
   
		  if (Distance1>Distance2)
				 {
					 System.out.println("Line 1 is greater");

				 }	
		  else
		  {
						 System.out.println("Line 2 is greater");
			 }
	}
		 
		  public static void main(String[] args) {
			  
			  lineComparisionprogram lc= new lineComparisionprogram();
			  lc.calculationofline();
   }
}
