package Practice;

public class MainMethod 
{
	public static void main(int a)
	{
		System.out.println(45);
	}

	public static void main(String[] args) {
		{
			System.out.println("main");
			main(0);
		}

	}

}
