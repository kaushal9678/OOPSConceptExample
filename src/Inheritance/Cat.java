/**
 * 
 */
package Inheritance;

/**
 * @author mac
 *
 */
public class Cat extends Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal dog=new Dog();// initialize an object of dog Class and call it's move method
	dog.move();
	Cat cat=new Cat();
	cat.move();
	}
	public  void move(){
		System.out.println("I am calling from Cat class");
		System.out.println("Cat is moving");
	}
	
}

