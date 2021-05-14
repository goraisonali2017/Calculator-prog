package main;



import java.util.*;


public class Calculator
{
	public static void main(String str[])
	{
		int ch;
		double firstobj,secondobj, calc_result = 0.0;
		Scanner Sc = new Scanner(System.in);
		try
		{
			
			
			System.out.println ("  **<< Your Calculator >>**    \n");
			System.out.println("\n 1) ADITTION\n "+"\n 2) DIVISION\n"+"\n 3) MULTIPLICATION\n"+"\n 4) SUBSTRACTION \n");
			System.out.println("\n Your first element :  ");
 			firstobj=Sc.nextDouble();
 			System.out.println("\n Your second element :  ");
 			secondobj=Sc.nextDouble();
 			CalulationMethod object1 =new CalulationMethod(firstobj,secondobj);
			System.out.println("\n\n\n\n Select Your Choice : [Enter 1 or 2 or 3 or 4]-->");
			ch=Sc.nextInt();
			switch(ch)
			{
			 	case 1:
			 			calc_result = object1.AddMethod();
			 			System.out.println(" The   Addition Result is " + calc_result);
			 			break;
			 			
			 	case 2:
			 			
			 		    calc_result = object1.DivMethod();
			 		    System.out.println(" The Division  Result is " + calc_result);
			 			break;
			 			
			 	case 3:
			 			
			 		    calc_result = object1.MultiplyMethod();
			 		    System.out.println(" The  Multiplication  Result is " + calc_result);
			 			break;
			 			
			 	case 4:
			 			
			 		    calc_result = object1.SubstractMethod();
			 		    System.out.println(" The Substraction  Result is " + calc_result);
			 			break;
			 			
			 			
			  default :
				  		System.out.println(" \n Your choice should be inbetween 1 to 4  \n\n Try Again");
			 		
			 			
			 		
			}
			
			
		}
		catch(InputMismatchException   Ex)
		{
			System.out.println(" Please  Enter valid input, that is double  or integer type . \n The input is not matching ");
		}
		
		catch(Exception Ex)
		{
			System.out.println(" Exception Is cought \n Try to rectify");
		}
		finally
		{
			Sc.close();
			System.out.println(" The progrman is successfully trminated ");
		}
		
		
	}

}



