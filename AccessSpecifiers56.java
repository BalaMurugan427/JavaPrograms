package Assignments;

import AssignmentsRelated.Access56;

public class AccessSpecifiers56 extends ForAccess {

	public static void main(String[] args) 
	{
		AccessSpecifiers56 obj1 = new AccessSpecifiers56();
		obj1.DemoMethod();
	}

}

class ForAccess extends  Access56
{
	public void DemoMethod()
	{
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(getI3());
		System.out.println(getI4());
	}

}
