package Assignments;


class Employee{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age; 
    }

    public void displayDetails() 
    {
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age);
    }

    public Employee getEmployee()
    {
        return this; 
    }

    public Employee updateName(String newName) 
    {
        this.name = newName;
        return this;
    }
}



public class this75 {

	public static void main(String[] args) 
	{
		Employee emp = new Employee("John", 25);
		
	       emp.displayDetails();

	        System.out.println("Updated name ");
	        emp.updateName("Alice").displayDetails();
	        
	        Employee sameEmp = emp.getEmployee();
	        System.out.println("Result : " + (emp == sameEmp));

	}

}
