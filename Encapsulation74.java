package Assignments;

class Encapsulation
{
	private int i1=5;

	public int getI1() {
		return i1;
	}

	public int setI1(int i1) {
		return this.i1 = i1;
	}
}
public class Encapsulation74 extends Encapsulation 
{

	public static void main(String[] args) 
	{
		Encapsulation74 obj = new Encapsulation74();
		int res = obj.setI1(5);
		System.out.println(res);
	}

}
