
package Assignments;

class AccessVariables
{
	int i1=1;
	private int i2=2;
	public int i3=3;
	protected int i4=4;
	public int getI2() {
		return i2;
	}
	public int setI2(int i2) {
		return this.i2 = i2;
	}
}
public class AccessSpecifiersPackage55
{	

	public static void main(String[] args)
	{
		AccessVariables obj1 = new AccessVariables();
		System.out.println(obj1.i1);
		int i =obj1.setI2(5);
		System.out.println(i);
		System.out.println(obj1.i3);
		System.out.println(obj1.i4);
		
	}

}
