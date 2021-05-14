package main;

public class CalulationMethod  implements Menu 
{
	double  element1 , element2, result ;
	
	public CalulationMethod (double  operand1 ,double  operand2)
	{
		 element1  =  operand1 ;
		
		 element2  = operand2  ; 
	}
	
	public double AddMethod()
	{
		result = element1 + element2;
		return result;
		
	}
	
	
	public double DivMethod()
	{
		try
		{
			result = element1 / element2;
			
			
		}
			
		catch(ArithmeticException exe)
		{
			System.out.println(" The divisor can't be Zero ");
		}
		return result;	
		
	}
	
	public double  MultiplyMethod()
	{
		result = element1 * element2;
		return result;
		
	}
	
	public double  SubstractMethod()
	{
		result = element1 - element2;
		return result;
		
	}
	
	
	
}

interface Menu
{
	 double AddMethod();
	 double DivMethod();
	 double MultiplyMethod();
	 double SubstractMethod();
}

