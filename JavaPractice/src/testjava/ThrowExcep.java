package testjava;

public class ThrowExcep {

	public static void main(String[] args) 
	{
		int age=21;
		try
		{
		if (age<18)
		{
		
		throw new AgeException_UDE("person is not eligable for vote");
		}
		
		else
		{
			System.out.println("person is eligable for vote");
		}
        
	}
	catch(AgeException_UDE e)
		{
		   System.out.println(e);
		}
		finally
		{
			System.out.println("FINSLLY BLOCK RUN");
		}
		
		System.out.println("Rest the code");
	}
	
}
