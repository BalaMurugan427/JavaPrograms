package Assignments;

interface Multiple
{
	abstract void cars();
}

interface Multiple1
{
	abstract void Bikes();
}

public class Diamond implements Multiple , Multiple1 {
	@Override
	public void Bikes()
	{
		System.out.println("Bikes are two wheeler ");
	}

	@Override
	public void cars() 
	{
		System.out.println("Cars are two wheeler ");
	}

	
	public static void main(String[] args)
	{
		Diamond jd = new Diamond();
		jd.Bikes();
		jd.cars();
	}
}
