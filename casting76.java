package Assignments;


class Animal 
{
    public void eat() 
    {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal 
{
    public void bark() 
    {
        System.out.println("Dog is barking."); 
    }
}




public class casting76 {

	public static void main(String[] args) 
	{
	       Animal animal = new Dog();
	        animal.eat();
	        
	        Dog dog = (Dog) animal;
	        dog.bark();
	}

}
